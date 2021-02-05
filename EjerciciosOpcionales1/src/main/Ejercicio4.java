package main;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=pedirNumero();
		int tamano=pedirNumero();
		
		Fibonacci fib1=new Fibonacci(numero,tamano);
		fib1.mostrarSecuencia();
	}
	
	private static int pedirNumero() {
		return Consola.leerEntero("Introduce un numero: ");
	}

}

class Fibonacci{
	private int numero;
	private int tamano;
	
	public Fibonacci() {

	}
	
	public Fibonacci(int numero, int tamano) {
		setNumero(numero);
		setTamano(tamano);
	}
	
	public void setNumero(int numero) {
		this.numero=numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setTamano(int tamano) {
		this.tamano=tamano;
	}
	
	public int getTamano() {
		return this.tamano;
	}
	
	public int obtenerSecuencia(int numero) {
		if(numero>1) {
			return obtenerSecuencia(numero-1)+obtenerSecuencia(numero-2);
		}else if(numero==1) {
			return 1;
		}else if(numero==0) {
			return 0;
		}else {
			Consola.mostrarMensaje("Debe introducir un numero mayor o igual a 1");
			return -1;
		}
	}
	
	void mostrarSecuencia() {
		Consola.mostrarMensaje("La secuencia que comienza con el numero: "+getNumero()+", de tamaño: "+getTamano()+" es:\n");
		for(int i=0; i<getTamano();i++) {
			System.out.print(obtenerSecuencia(i)+" ");
		}
	}
}