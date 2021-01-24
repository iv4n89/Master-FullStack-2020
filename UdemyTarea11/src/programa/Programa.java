package programa;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int[] array=new int[10];
		boolean creciente=true;
		int n,sitio_n=0,j=0;
		
		do {
			for(int i=0;i<5;i++) {
				System.out.print((i+1)+". Digite un numero: ");
				array[i]=entrada.nextInt();
			}
			
			//Comprobar si el arreglo esta ordenado en forma creciente
			for(int i=0;i<4;i++) {
				if(array[i]<array[i+1]) creciente=true;
				else {creciente=false; break;}
			}
			
			if(!creciente) {
				System.out.println("\nEl arreglo no esta ordenado, vuelva a digitar");
			}
		}while(!creciente);
		
		System.out.print("\nDigite un numero a insertar: ");
		n=entrada.nextInt();
		
		while(array[j]<n&&j<5) {
			sitio_n++;
			j++;
		}
		
		for(int i=4;i>=sitio_n;i--) {array[i+1]=array[i];}
		
		array[sitio_n]=n;
		
		System.out.print("\nEl arreglo queda: ");
		for(int i=0;i<6;i++) System.out.print(array[i]+" - ");
	}

}
