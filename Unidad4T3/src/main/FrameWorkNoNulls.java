package main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.stream.Stream;

public class FrameWorkNoNulls {

	public static Object executeNoNulls(Class clase, Object instancia, String nombreMetodo, Object... argumentos) {
		Method metodo = null;
		try {
			Class[] tiposArgumentos = Stream.of(argumentos).map(arg -> arg.getClass()).toArray(n -> new Class[n]);
			metodo = clase.getMethod(nombreMetodo, tiposArgumentos);
		} catch (NoSuchMethodException | SecurityException ex) {
			throw new RuntimeException("No se puede encontrar el metodo");
		}
		// Hay que comprobar si existe la anotacion @NoNulls
		// si existe hay que mirar los argumentos del metodo y si alguno es nulo lanzar
		// una excepcion de tipo NullPointerException
		NoNulls nonull = (NoNulls) metodo.getAnnotation(NoNulls.class);
		if (nonull != null) {
			for (Object o : argumentos) {
				if (o == null) {
					throw new NullPointerException(nonull.mensaje());
				}
			}
		}

		try {
			// Si los argumentos son no nulos, ejecutamos el metodo
			return metodo.invoke(instancia, argumentos);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
			throw new RuntimeException("No se puede ejecutar el metodo");
		}

	}

}
