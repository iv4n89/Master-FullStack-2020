package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Consola {
	static Scanner entrada= new Scanner(System.in);
	
	public static int leerEntero(String...mensaje) {
		if(mensaje.length>0) System.out.print(mensaje[0]);
		int salida=0;
		try {
			salida=entrada.nextInt();
		}catch(InputMismatchException ex) {
			System.out.println("Debe introducir un numero entero.");
		}
		return salida;
	}
	
	public static String leerString(String...mensaje) {
		if(mensaje.length>0) System.out.print(mensaje[0]);
		return entrada.next();
	}
	
	public static boolean leerBoolean(String...mensaje) {
		if(mensaje.length>0) System.out.print(mensaje[0]);
		String respuesta="";
		respuesta=leerString();
		if(respuesta=="yes") return true;
		else if(respuesta=="no") return false;
		else return leerBoolean("Debe introducir yes o no.");
	}
	
	public static void mostrarMensaje(String...mensaje) {
		if(mensaje.length>0) System.out.println(mensaje[0]);
	}
}
