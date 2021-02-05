package main;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=solicitarNumeroValido();
		int resultado=calcularSumaDigitos(numero);
		mostrarMensaje(numero,resultado);
	}
	
	private static int solicitarNumeroValido() {
		int numero=0;
		while(Integer.valueOf(String.valueOf(numero).length())!=3) {
			numero=Consola.leerEntero("Introduzca un numero de 3 cifras: ");
		}
		return numero;
	}
	
	private static int calcularSumaDigitos(int numero) {
		String s=String.valueOf(numero);
		int suma=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			suma+=Character.getNumericValue(c);
		}
		return suma;
	}
	
	private static void mostrarMensaje(int numero ,int resultado) {
		Consola.mostrarMensaje("El resultado de la suma de los digitos de "+numero+" es: "+resultado);
	}

}
