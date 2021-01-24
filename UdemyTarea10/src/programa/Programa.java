package programa;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		int[] arreglo= new int[10];
		int n_posicion,ultimo;
		System.out.println("Llenar el arreglo: ");
		for(int i=0; i<10; i++) {
			System.out.print(i+". Digite un numero: ");
			arreglo[i]=entrada.nextInt();
		}
		
		System.out.print("Digite la cantidad de posiciones a desplazar: ");
		n_posicion=entrada.nextInt();
		
		for(int vuelta=1;vuelta<=n_posicion;vuelta++) {
			ultimo=arreglo[9];
			for(int i=8; i>=0; i--) {
				arreglo[i+1]=arreglo[i];
			}
			arreglo[0]=ultimo;
		}
		
		System.out.println("El arreglo resultante es:");
		for(int i=0;i<10;i++) {
			System.out.println(i+". El numero es: "+arreglo[i]);
		}
		
		/*
		Scanner scaner= new Scanner(System.in);
		int[] arreglo=new int[10];
		int movimiento;
		
		for(int i=0; i<10; i++) {
			System.out.print(i+". Digite un numero: ");
			arreglo[i]=scaner.nextInt();
		}
		
		System.out.print("Digite la cantidad de puestos a mover: ");
		movimiento=scaner.nextInt();
		
		int[] arregloMovimiento= new int[movimiento];
		for(int i=movimiento; i<arreglo.length; i++) {
			arregloMovimiento[i]=arreglo[i];
		}
		
		for(int i=arreglo.length-movimiento;i>=0;i--) {
			arreglo[i+1]=arreglo[i];
		}
		
		for(int i=0;i<arregloMovimiento.length;i++) {
			arreglo[i]=arregloMovimiento[i];
		}
		
		for(int i=0; i<10; i++) {
			System.out.println("El indice "+i+" es: "+arreglo[i]);
		}
		*/
	}

}
