package tarea2.arrays;

public class Tarea2Corregido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//operacion b:
		
		int[] enteros= {1,3,5};
		int menor=0;
		
		/*
		if (enteros[0]<enteros[1]&&enteros[0]<enteros[2]) {
			menor=enteros[0];
		}else if(enteros[0]>enteros[1]&&enteros[1]<enteros[2]) {
			menor=enteros[1];
		}else {
			menor=enteros[2];
		}*/
		
		for(int i=1; i<enteros.length-1;i++) {
			if(enteros[i-1]>enteros[i]&&enteros[i]<enteros[i+1]) {
				menor=enteros[i];
			}else {
				menor=enteros[i-1];
			}
		}
		
		System.out.println("El menor es "+menor);
		
	}

}
