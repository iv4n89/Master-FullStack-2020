/*
 * Ejercicio 4.
Solicita por consola el nombre y edad de 10 personas. Guarda todos los datos en arrays.

Después muestra por consola el nombre (o nombres) de la(s) persona(s) con mayor edad, y la edad media de todas las personas.

Usa una estructura mediante métodos.
 */

package main;

import java.util.Arrays;

public class Ejercicio4 {
	void ejercicio4() {
		String nombres[]=new String[10];
		int edades[]=new int[10];
		pedirDatos(nombres,edades);
		int mayores[]=buscarMayor(edades);
		mostrarDatos(nombres,edades,mayores);
	}

	private void pedirDatos(String[] nombres, int[] edades) {
		for(int i=0;i<nombres.length;i++) {
			nombres[i]=Consola.leerString("Introduzca el nombre de la persona numero "+(i+1)+" ");
			int edad=Consola.leerEntero("Introduzca la edad de la persona numero "+(i+1)+" ");
			while(edad<=0||edad>120) {
				if(edad<=0||edad>120) {
					Consola.mostrarMensaje("Esta edad no es real, vuelva a introducir");
					edad=Consola.leerEntero("Introduzca la edad de la persona numero "+(i+1)+" ");
				}
			}
			edades[i]=edad;
		}
	}

	private int[] buscarMayor(int[] edades) {
		int mayor=0;
		int contador=0;
		int j=0;
		
		//Buscar la mayor edad de entre los indices del array
		for(int i=0;i<edades.length;i++) {
			if(mayor<edades[i]) {
				mayor=edades[i];
			}
		}
		
		//Buscar en el array si hay mas de una persona con la mayor edad y guardar ese numero en una variable
		for(int edad:edades) {
			if(mayor==edad) contador++;
		}
		
		//Crear un array del tamaño de la variable donde se guardaron la cantidad de personas con la mayor edad del array
		int[] mayores=new int[contador];
		
		//Rellenar el array de mayores con los indices del array edades donde se encuentran las personas de mayor edad
		for(int i=0;i<edades.length;i++) {
			if(edades[i]==mayor) {
				mayores[j]=i;
				j++;
			}
		}
		return mayores;
	}
	
	
	private int hacerMedia(int[] edades) {
		int media=0;
		for(int edad:edades) media+=edad;
		return(media/edades.length);
	}

	private void mostrarDatos(String[] nombres, int[] edades, int[] mayores) {
		if(mayores.length==0) {
			Consola.mostrarMensaje("No se recogieron bien los datos");
		}
		else if(mayores.length>1) {
			Consola.mostrarMensaje("Estas son las personas mas mayores: ");
			for(int i=0;i<mayores.length;i++) {
				Consola.mostrarMensaje(nombres[mayores[i]]+", con edad de "+edades[mayores[i]]+" años");
			}
		}else {
			Consola.mostrarMensaje("La persona mas mayor es: "+nombres[mayores[0]]+" con "+edades[mayores[0]]+" años de edad");
		}
		
		Consola.mostrarMensaje("La media de edad es: "+hacerMedia(edades)+" años.");
		
	}
}
