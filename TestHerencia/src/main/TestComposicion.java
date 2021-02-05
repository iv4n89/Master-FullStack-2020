package main;

public class TestComposicion {

	public static void main(String[] args) {
		
		
		/*
		 * 1
		 * 
		 * A la hora de establecer relaciones entre entidades es importante saber distinguir 2 tipos:
		 * 
		 * IS A (es un): Es el tipo de relación que hemos visto: la herencia.
		 *   Ejemplos: Gato es un Animal, Monitor es un Periférico, Camión es un Vehículo
		 * 
		 * HAS A (tiene un): Esta relación se da cuando una clase incluye otra
		 *   Ejemplos: Vehiculo tiene un Motor, Vehiculo tiene una Carrocería, Ordenador tiene una PlacaBase
		 *   
		 * Debemos tener en cuenta qué tipo de relaciones van a tener nuestras entidades, para poder diseñar las clases correctamente.
		 * */

	}

}

//Relación HAS-A
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

//Relación IS-A
class Camion extends Vehiculo {
	int numeroEjes;
}