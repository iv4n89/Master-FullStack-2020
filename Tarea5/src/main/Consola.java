package main;

import java.util.Scanner;

public class Consola {
	Scanner entrada= new Scanner(System.in);
	
	public int leerEntero(String...mensaje) {
		if(mensaje.length>0) System.out.print(mensaje[0]);
		return entrada.nextInt();
	}
	
	public String leerString(String...mensaje) {
		if(mensaje.length>0) System.out.print(mensaje[0]);
		return entrada.next();
	}
	
	public boolean leerBoolean(String...mensaje) {
		if(mensaje.length>0) System.out.print(mensaje[0]);
		String respuesta="";
		respuesta=leerString();
		if(respuesta=="yes") return true;
		else if(respuesta=="no") return false;
		else return leerBoolean("Debe introducir yes o no.");
	}
}
