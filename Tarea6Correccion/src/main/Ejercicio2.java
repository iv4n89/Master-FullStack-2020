package main;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=solicitarNumero();
		mostrarComparacion(numero);
	}
	
	private static int solicitarNumero() {
		return Consola.leerEntero("Introduzca un numero para verificar si el par, impar o 0: ");
	}
	
	private static void mostrarComparacion(int numero) {
		Consola.mostrarMensaje("El numero introducido es: "+comparacionIfElse(numero));
		Consola.mostrarMensaje("El numero introducido es: "+comparacionLambda(numero));
	}
	
	private static String comparacionIfElse(int numero) {
		if(numero==0) return "cero";
		else if(numero%2==0) return "par";
		else return "impar";
	}
	
	private static String comparacionLambda(int numero) {
		return numero==0?"cero":(numero%2==0?"par":"impar");
	}

}
