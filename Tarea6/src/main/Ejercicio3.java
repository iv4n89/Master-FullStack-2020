/*
 * Ejercicio 3.
Solicita por teclado un número de como máximo tres cifras. Asegúrate de que el número introducido es válido y sino vuelve a solicitarlo. Descompón el número en sus cifras y muestra el resultado de la suma. Por ejemplo, si escriben "361" el resultado de la suma es 3+6+1 = 10.

Usa una estructura mediante métodos.
 */

package main;

public class Ejercicio3 {//corregir
	void ejercicio3() {
		mostrarResultado(sumaNumeros(descomponerNumero(solicitarNumero())));
	}

	private int sumaNumeros(int[] descompuesto) {
		int suma=0;
		for(int numero:descompuesto)suma+=numero;
		return suma;
	}

	private void mostrarResultado(int suma) {
		Consola.mostrarMensaje("El resultado de la suma de los digitos del numero introducido es: "+suma);
		
	}

	private  int[] descomponerNumero(int numero) {//Se puede hacer convirtiendo el numero a un string
		int[] descompuesto=new int[3];
		int i=0;
		while(numero>0) {
			if(numero%10!=0) {
				descompuesto[i]=numero%10;
				i++;
			}
			numero/=10;
		}
		return descompuesto;
	}

	private int solicitarNumero() {
		int numero=0;
		while(comprobarDigitos(numero)!=3) numero=Consola.leerEntero("Introduzca un numero de 3 digitos: ");
		return numero;
	}
	
	private int comprobarDigitos(int numero) {
		String n=Integer.toString(numero);
		return (n.length()==3)?3:0;
	}
}
