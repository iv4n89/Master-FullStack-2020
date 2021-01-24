package programa;

import java.util.Arrays;
import java.util.Scanner;

public class Programa {
	
	public static void main (String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		int a[],b[],c[];
		boolean creciente=true;
		
		a= new int[10];
		b= new int[10];
		c= new int[20];
		
		System.out.println("Digite el primer arreglo: ");
		do {
			//pedimos el arreglo:
			for(int i=0;i<10;i++) {
				System.out.print((i+1)+". Digite un numero: ");
				a[i]=entrada.nextInt();
			}
			//comprobamos si el arreglo esta ordenado crecientemente:
			for(int i=0;i<9;i++) {
				if(a[i]<a[i+1]) {//Creciente
					creciente=true;
				}
				else if(a[i]>a[i+1]) {//Decreciente
					creciente=false;
					break;
				}
			}
			
			if(!creciente) {
				System.out.println("El arreglo esta desordenado, vuelva a digitar: ");
			}
			
		}while(!creciente);
		
		do {
			//pedimos el arreglo:
			for(int i=0;i<10;i++) {
				System.out.print((i+1)+". Digite un numero: ");
				b[i]=entrada.nextInt();
			}
			//comprobamos si el arreglo esta ordenado crecientemente:
			for(int i=0;i<9;i++) {
				if(b[i]<b[i+1]) {//Creciente
					creciente=true;
				}
				else if(b[i]>b[i+1]) {//Decreciente
					creciente=false;
					break;
				}
			}
			
			if(!creciente) {
				System.out.println("El arreglo esta desordenado, vuelva a digitar: ");
			}
			
		}while(!creciente);
		
		int i=0; //Iterador i sera para el arreglo a
		int j=0; //Iterador j sera para el arreglo b
		int k=0; //Iterador k sera para el arreglo c
		
		while(i<10&&j<10) {
			if(a[i]<b[i]) { //Si el elemento del arreglo a es menor que el elemento del arreglo b
				c[k]=a[i];//Copiamos el elemento de a
				i++;//Avanzamos una posicion en el arreglo a
			}else {//Si el elemento del arreglo b es menor que el elemento del arreglo a
				c[k]=b[j];//Copiamos el elemento de b
				j++;//Avanzamos una posicion en el arreglo b
			}
			k++;//Avanzamos una posicion en el arreglo c
		}
		
		//Cuando salimos de while es porque unn arreglo (a o b) se ha copiado completamente
		if(i==10) {//Esto significa que ya copiamos todo el arreglo a
			while(j<10) {//Copiamos todos los elementos restantes de b en c
				c[k]=b[j];
				j++;//Avanzamos una posicion en b
				k++;//Avanzamos una posicion en c
			}
		}
		
		if(j==10) {
			while(i<10) {
				c[k]=a[i];
				i++;
				k++;
			}
		}
		
		System.out.println("\nEl arreglo c completo es: ");
		for(k=0;k<20;k++) {
			System.out.print(c[k]+" - ");
		}
		System.out.println("\n");
		
	}
	
	
	
	
	
	
	
	
	/*
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int[] array1=new int[10];
		int[] array2=new int[10];
		int[] array3=new int[20];
		
		System.out.println("Digita los 10 primeros numeros: ");
		for(int i=0;i<array1.length;i++) {
			System.out.print(i+". Introduce un numero: ");
			array1[i]=entrada.nextInt();
		}
		
		System.out.println("Digita los siguientes 10 numeros: ");
		for(int i=0;i<array2.length;i++) {
			System.out.print(i+". Introduce un numero: ");
			array2[i]=entrada.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			array3[i]=array1[i];
		}
		for(int i=0;i<10;i++) {
			array3[i+10]=array2[i];
		}
		
		Arrays.sort(array3);
		System.out.println("Los dos arrays juntos y ordenados son: ");
		for(int i=0;i<array3.length;i++) {
			System.out.print(array3[i]+" - ");
		}
	}
	
	*/

}
