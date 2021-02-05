package main;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=solicitarNumero();
		mostrarMensajes(numero);
	}
	
	private static int solicitarNumero() {
		int numero=0;
		try {
			numero=Consola.leerEntero("Introduzca un numero para realizar las operaciones con el: ");
		}catch (Exception ex) {
			Consola.mostrarMensaje("Debe introducir un numero entero");
		}
		
		return numero;
	}
	
	private static void mostrarMensajes(int n) {
		Consola.mostrarMensaje(n+" -> "+voltearNumero(n));
		
		if(isPar(n)) 	Consola.mostrarMensaje("El numero "+n+" es par.");
		else Consola.mostrarMensaje("El numero "+n+" es impar.");
		
		if(isPrimo(n)) Consola.mostrarMensaje("El numero "+n+" es primo.");
		else Consola.mostrarMensaje("El numero "+n+" no es primo.");
	}
	
	private static int voltearNumero(int n) {
		String numero=String.valueOf(n);
		String nVolteado="";
		for(int i=numero.length()-1;i>=0;i--) {
			nVolteado+=String.valueOf(numero.charAt(i));
		}
		return Integer.parseInt(nVolteado);
	}
	
	private static boolean isPar(int n) {
		boolean par;
		if(n%2!=0) {
			par=false;
		}else par=true;
		
		return par;
	}
	
	private static boolean isPrimo(int n) {
		boolean primo=true;
		int contador=2;
		while((primo)&&(contador!=n)) {
			if(n%contador==0) primo=false;
			contador++;
		}
		return primo;
	}

}
