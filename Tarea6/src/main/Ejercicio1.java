/*
 * Ejercicio 1.
Solicita por consola dos n�meros y gu�rdalos en variables de nombres n1 y n2. A continuaci�n calcula y muestra el resultado de las siguientes expresiones aritm�ticas: 

La suma de ambos n�meros:

n1 + n2

La media de los dos n�meros:

n1 + n2
      2

El primer n�mero elevado al segundo:

n1 n2

El resto de la divisi�n entre ambos:

resto de  n1/n2

Si suponemos que el valor de n1 est� en grados

coseno de n1

El valor menor entre  n1 y n2

m�nimo entre n1 y n2

Utiliza m�todos que hagan cada c�lculo. Estos m�todos no deben imprimir nada, s�lo hacer el c�lculo.
 */

package main;

import java.util.stream.IntStream;

public class Ejercicio1 {
	
	 void ejercicio1() {
		int n1=0,n2=0;
		Consola.mostrarMensaje("Se le pediran 2 numeros enteros para operar con ellos posteriormente: ");
		n1=pedirNumero();
		n2=pedirNumero();
		operarConNumeros (n1, n2);
	}

	private  void operarConNumeros(int n1, int n2) {//corregir este metodo para que solo trabaje mostrando el resultado, no realizando las operaciones
		if(n1==0&&n2==0) Consola.mostrarMensaje("Todo esta a 0. Revise si cometio un error al introducir datos");
		else {
			//suma
			Consola.mostrarMensaje("La suma de ambos numeros es: "+(suma(n1,n2)));
			//media
			Consola.mostrarMensaje("La media de ambos numeros es: "+(media(n1,n2)));
			//potencia
		    Consola.mostrarMensaje("La potencia del primer numero elevado al segundo es: "+(potencia(n1,n2)));
			//Resto de division
			Consola.mostrarMensaje("El resto de dividir los dos numeros es: "+(restoDivison(n1,n2)));
			//Valor menor entre ambos 
			//a�adir coseno, minimo y maximo			
		}
	}
	
	private int restoDivison(int n1, int n2) {
		int resto=0;
		try {
			resto=n1%n2;
		}catch(ArithmeticException ex) {
			Consola.mostrarMensaje("No puede dividir un numero entre 0");
		}
		
		return resto;
	}
	
	private double potencia(int n1, int n2) {
		return Math.pow(n1,n2);
	}

	private double media(int n1, int n2) {//Corregir
		// TODO Auto-generated method stub
		return (n1+n2)/2.0;
	}

	private int suma(int n1, int n2) {
		// TODO Auto-generated method stub
		//IntStream.of(n1,n2).sum(); --> Crea un flujo de enteros con el que se pueden realizar operaciones sin tener que realizar bucles
		return n1+n2;
	}

	private int pedirNumero() {
		int numero=0;
		numero=Consola.leerEntero("Introduzca un numero entero: ");
		return numero;
	}
}
