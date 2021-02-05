package main;

import java.util.stream.IntStream;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consola.mostrarMensaje("Introduce 2 numeros para operar con ellos: ");
		int[] numeros=new int[2];
		
		numeros= pedirNumeros();
		int n1=numeros[0];
		int n2=numeros[1];
		int suma= sumarNumeros(n1,n2);
		double media=mediaNumeros(n1,n2);
		double potencia=potenciaNumeros(n1,n2);
		int resto=restoNumeros(n1,n2);
		double coseno1= cosenoNumeros(n1);
		double coseno2=cosenoNumeros(n2);
		int minimo= minimoEntreNumeros(n1,n2);
		int maximo=maximoEntreNumeros(n1,n2);
		mostrarResultado("El resultado de la suma es: ",suma );
		mostrarResultado("El resultado de la media es: ", media);
		mostrarResultado("El resultado de la potencia es: ",potencia);
		mostrarResultado("El resto de la division de los numeros es: ",resto);
		mostrarResultado("El coseno del primer numero es: ",coseno1);
		mostrarResultado("El coseno del segundo numero es: ",coseno2);
		mostrarResultado("El minimo entre los dos numeros es: ",minimo);
		mostrarResultado("El maximo entre los dos numeros es: ",maximo);
	}
	
	private static int[] pedirNumeros() {
		int[] numeros=new int[2];
		numeros[0]=Consola.leerEntero("Introduzca el valor para el primer numero: ");
		numeros[1]=Consola.leerEntero("Introduzca el valor para el segundo numero: ");
		return numeros;
	}
	
	private static int sumarNumeros(int...numeros) {
		if(numeros.length==0) return 0;
		return IntStream.of(numeros).sum();
	}
	
	private static double mediaNumeros(int...numeros) {
		return IntStream.of(numeros).average().orElse(0.0);
	}
	
	private static double potenciaNumeros(int n1, int n2) {
		return Math.pow(n1, n2);
	}
	
	private static int restoNumeros(int n1,int n2) {
		int resto=0;
		try {
			resto=n1%n2;
			return resto;
		}catch(ArithmeticException ex) {
			Consola.mostrarMensaje("No se puede dividir por 0!");
			return 0;
		}
	}
	
	private static double cosenoNumeros(int n1) {
		return Math.cos(n1);
	}
	
	private static int minimoEntreNumeros(int n1, int n2) {
		return IntStream.of(n1,n2).min().orElse(0);
	}
	
	private static int maximoEntreNumeros(int n1, int n2) {
		return IntStream.of(n1,n2).max().orElse(0);
	}
	
	private static void mostrarResultado(String mensaje, int numero) {
		Consola.mostrarMensaje(mensaje+numero);
	}
	
	private static void mostrarResultado(String mensaje, double numero) {
		Consola.mostrarMensaje(mensaje+numero);
	}

}
