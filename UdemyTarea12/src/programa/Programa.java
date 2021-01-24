package programa;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int[] array=new int[10];
		int posicion;
		
		for(int i=0;i<array.length;i++) {
			System.out.print(i+". Digite un numero: ");
			array[i]=entrada.nextInt();
		}
		
		do {
			System.out.print("Digite una posicion");
			posicion=entrada.nextInt();
		}while(posicion<0||posicion>9);
		
		for(int i=posicion;i<9;i++) {
			array[i]=array[i+1];
		}
		
		for(int i=0;i<9;i++) System.out.print(array[i]+" - ");
	}

}
