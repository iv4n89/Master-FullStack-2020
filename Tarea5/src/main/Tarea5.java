package main;

import java.util.InputMismatchException;

public class Tarea5 {
	static Consola consola=new Consola();

	public static void main(String[] args) {
		//1-pedir datos al usuario, habiendo mostrado antes opciones
		//2-realizar la operacion seleccionada
		mostrarMenu();
		int opcion= recogerOpcion();
		realizarOpcion(opcion);
	}

	private static void mostrarMenu() {
		final String MENU="Seleccione que desea realizar:\n1- Introducir nombre de usuario\n2- Sumar dos numeros\n3- Calcular la media de 3 numeros";
		System.out.println(MENU);
	}

	private static int recogerOpcion() {
		int opcion=0;
		try{
			opcion=consola.leerEntero("Introduzca una opcion a continuacion: ");
		}catch(InputMismatchException ex) {
			System.out.println("Ha introducido un caracter incorrecto. Introduzca un numero de 1 a 3.");
		}
				
		if(opcion<1||opcion>3) {
			System.out.println("Ha introducido una opcion incorrecta");
			return 0;
		}else return opcion;
	}

	private static void realizarOpcion(int opcion) {
		switch(opcion) {
		case 1:
			operacion1();
			break;
		case 2:
			operacion2();
			break;
		case 3:
			operacion3();
			break;
		default:
			System.out.println("Ha introducido una opcion incorrecta.");
			break;
		}
		
	}
	
	private static void operacion1() {
		String nombre="";
		nombre=consola.leerString("Introduzca un nombre de usuario de entre 4 y 10 caracteres: ");
		if(nombre.length()>10) System.out.println("El nombre de usuario no debe superar los 10 caracteres.");
		else if(nombre.length()<4) System.out.println("El nombre de usuario debe tener mas de 4 caracteres.");
		else System.out.println("Nombre de usuario correcto.");		
	}
	
	private static void operacion2() {
		int n1=0,n2=0;
		try {
			n1= consola.leerEntero("Introduzca el primer numero: ");
			n2=consola.leerEntero("Introduzca el segundo numero: ");
		}catch(InputMismatchException ex) {
			System.out.println("Debe introducir un numero entero");
		}
		
		System.out.println("El resultado de la suma es: "+(n1+n2));
	}
	
	private static void operacion3() {
		int[] arrayNumeros=new int[3];
		int media=0;
		System.out.print("Introduzca 3 numeros enteros para realizar la media entre ellos: ");
		try {
			for(int numero:arrayNumeros) {
				numero=consola.leerEntero("Introduzca un numero:");
				media+=numero;
			}
		}catch(InputMismatchException ex) {
			System.out.println("Debe introducir numeros para realizar la operacion.");
		}
		
		System.out.println("El resultado de la media es: "+(media/=arrayNumeros.length));
	}

}
