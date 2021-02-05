package main;

public class EjercicioBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] valores= {1,2,3,5,6,7,8};
		
		long suma=calcularSuma(valores);
		mostrarResultado(suma);
	}

	private static long calcularSuma(int[] valores) {
		
		if(valores==null||valores.length==0) return 0;//comprobacion de lo que puede ir mal antes de realizar las operaciones para que el programa no casque
		
		long suma=0;
		
		for(int valor:valores) suma+=valor; //Este bucle solo para lectura. Recorre todo el array
		
		/*
		 * for(int i=0;i<valores.length;i++){
		 * suma+=valores[i];
		 * }
		 * 
		 */
		
		return suma;
	}

	private static void mostrarResultado(long suma) {
		// TODO Auto-generated method stub
		System.out.println("El resultado es: "+suma);
		
	}

}
