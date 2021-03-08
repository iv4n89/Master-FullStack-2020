package main;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class FechaUtils {

	public static String convertirFechaAString(Date date) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		if(date==null) throw new RuntimeException();
		
		return sdf.format(date);
	}
	
	public static Date obtenerDate(int anio, int mes, int dia) {
		
		/*
		Calendar cal = Calendar.getInstance();
		//cal.set(anio, mes, dia);
		cal.set(anio, mes-1, dia);
		
		return cal.getTime();
		*/
		
		/*
		 * Este método nos permite situarnos en la hora 0 de un día concreto
		 * y convertirlo a milisegundos, para luego crear un objeto Date con
		 * el resultado.
		 * */
		try {
			LocalDate ld = LocalDate.of(anio, mes, dia);
			return Date.from(ld.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
		}catch(DateTimeException ex) {
			ex.fillInStackTrace();
			return null;
		}
		
	}
	
	public static boolean validarDatosFecha(int anio, int mes, int dia) {
		
		try {
			LocalDate.of(anio, mes, dia);
			return true;
		} catch(DateTimeException ex) {
			return false;
		}
		
	}
}

class A<T extends Number>{
	private Number n;
	public A(T n) {
		this.n=n;
		try {
			String.class.newInstance();
			String.getClass().newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class B{
	public static void main(String[] args) {
		A a=new A<Integer>(4);
		X x4= t ->t.toLowerCase();
		X<? extends String> x1=t->t.toLowerCase();
		X<String> x2=t -> t.toLowerCase();
		X<? super String> x11=t -> t.toLowerCase();
		try {
			String.class.getConstructor(String.class).newInstance("");
			
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class C extends A{
	
	@Override
	private Number n;
	
	public C(Number n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	
}

interface X<T extends String> {
	   void cambia (T t);
	}
