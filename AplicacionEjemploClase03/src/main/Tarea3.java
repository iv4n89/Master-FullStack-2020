package main;

public class Tarea3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostrarMenu();
		int opcion = leerOpcion();
		procesar(opcion);

	}

	private static void mostrarMenu() {
		System.out.println("Mensaje");
		
	}

	private static int leerOpcion() {
		int opcion= Consola.leerInt("Introduce una opcion entre 1 y 3: ");
		if(opcion<1||opcion>3) opcion= leerOpcion();
		return opcion;
	}

	private static void procesar(int opcion) {
		System.out.println("Se ejecuta la opcion: "+opcion);
		if(opcion==1) {
			procesarOpcion1();
		}else if(opcion==2) {
			procesarOpcion2();
		}else if(opcion==3) {
			procesarOpcion3();
		}
		
	}
	
	private static void procesarOpcion1() {
		System.out.println("Opcion 1");
	}
	
	private static void procesarOpcion2() {
		System.out.println("Opcion 2");
	}
	
	private static void procesarOpcion3() {
		System.out.println("Opcion 3");
	}

}
