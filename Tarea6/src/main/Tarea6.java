
package main;

public class Tarea6 {
	static Ejercicio1 ejercicio1=new Ejercicio1();
	static Ejercicio2 ejercicio2=new Ejercicio2();
	static Ejercicio3 ejercicio3=new Ejercicio3();
	static Ejercicio4 ejercicio4=new Ejercicio4();
	static Ejercicio5 ejercicio5=new Ejercicio5();
	static Ejercicio6 ejercicio6=new Ejercicio6();
	
	
	public static void main(String[] args) {
		switch(Consola.leerEntero("Introduzca el numero de ejercicio a realizar(1 a 6): ")) {
		case 1:
			ejercicio1.ejercicio1();
			break;
		case 2: 
			ejercicio2.ejercicio2();
			break;
		case 3:
			ejercicio3.ejercicio3();
			break;
		case 4:
			ejercicio4.ejercicio4();
			break;
		case 5:
			ejercicio5.ejercicio5();
			break;
		case 6:
			ejercicio6.ejercicio6();
			break;
		default:
			Consola.mostrarMensaje("Ha introducido una opcion incorrecta.");
		}

	}
	
}
