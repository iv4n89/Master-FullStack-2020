package programa;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		int arreglo[]= new int[10];
		
		System.out.println("Llenar el arreglo");
		for(int i=0;i<10;i++) {
			System.out.print(i+". Digite un numero: ");
			arreglo[i]=entrada.nextInt();
		}
		int ultimo=arreglo[9];
		
		for(int i=8;i>=0;i--) {
			arreglo[i+1]=arreglo[i];
		}
		
		arreglo[0]=ultimo;
		for(int i=0;i<10;i++) {
			System.out.println(i+" es el numero: "+arreglo[i]);
		}
	}

}
