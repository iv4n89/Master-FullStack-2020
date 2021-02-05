package main;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto=pedirTexto();
		texto=invertirTexto(texto);
		mostrarTexto(texto);
	}
	
	private static String pedirTexto() {
		return Consola.leerString("Introduzca un texto para invertirlo: ");
	}
	
	private static String invertirTexto(String texto) {
		String sTextoInvertido="";
		for(int i=texto.length()-1;i>=0;i--) {
			sTextoInvertido+=String.valueOf(texto.charAt(i));
		}
		
		return sTextoInvertido;
	}
	
	private static void mostrarTexto(String texto) {
		Consola.mostrarMensaje(texto);
	}
}