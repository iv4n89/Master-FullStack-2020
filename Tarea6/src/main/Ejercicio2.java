/*
 * Ejercicio 2.
Solicita por teclado un número entero. A continuación muestra un mensaje indicando si es par, impar o cero.

Resuelve este ejercicio primero con un método que use una estructura if/else y después otro método que use el operador condicional ?:
 */

package main;

public class Ejercicio2 {
	void ejercicio2() {
		int numero=0;
		numero=Consola.leerEntero("Introduzca un numero entero para verificar si es par, impar o 0: ");
		Consola.mostrarMensaje(" El numero "+numero+" es "+verificarNumeroIfElse(numero)); 
		Consola.mostrarMensaje("Usando una expresion condicional lambda, se muestra que el numero "+numero+" es "+verificarNumeroLambda(numero));
	}
	
	private String verificarNumeroIfElse(int numero) {
		if(numero==0) return "cero";
		else if(numero%2==0) return "par";
		else return "impar";
	}
	
	private String verificarNumeroLambda(int numero) {
		return (numero%2==0)?"par":"impar";//Corregir
	}
}
