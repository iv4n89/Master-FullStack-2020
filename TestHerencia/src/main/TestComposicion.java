package main;

public class TestComposicion {

	public static void main(String[] args) {
		
		
		/*
		 * 1
		 * 
		 * A la hora de establecer relaciones entre entidades es importante saber distinguir 2 tipos:
		 * 
		 * IS A (es un): Es el tipo de relaci�n que hemos visto: la herencia.
		 *   Ejemplos: Gato es un Animal, Monitor es un Perif�rico, Cami�n es un Veh�culo
		 * 
		 * HAS A (tiene un): Esta relaci�n se da cuando una clase incluye otra
		 *   Ejemplos: Vehiculo tiene un Motor, Vehiculo tiene una Carrocer�a, Ordenador tiene una PlacaBase
		 *   
		 * Debemos tener en cuenta qu� tipo de relaciones van a tener nuestras entidades, para poder dise�ar las clases correctamente.
		 * */

	}

}

//Relaci�n HAS-A
class Vehiculo {
	Motor motor;
	Carroceria carroceria;
}

class Motor {
	String tipo;
	double potencia;
}

class Carroceria {
	double longitud;
	String material;
}

//Relaci�n IS-A
class Camion extends Vehiculo {
	int numeroEjes;
}