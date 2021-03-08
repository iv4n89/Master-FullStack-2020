package main;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		/*
		 * Java proporciona muchos tipos de colecciones englobadas en las siguientes
		 * categorías:
		 *  - Listas (interfaz List):
		 *      Son colecciones que guardan los elementos secuencialmente en posiciones
		 *      que cuentan desde cero.
		 *      
		 *      Clases concretas: ArrayList, LinkedList, Vector
		 *      
		 *  - Conjuntos (interfaz Set):
		 *      Son colecciones que garantizan que no tendrán elementos repetidos.
		 *      No garantizan un orden en los elementos.
		 *      
		 *      Clases concretas: HashSet y TreeSet
		 *      
		 *  - Colas y pilas (interfaz Queue:
		 *      Guardan los elementos siguiendo un criterio de entrada y salida.
		 *      Al sacar un elemeno de una colas se obtiene el primero que se introdujo.
		 *      Al sacer un elemento de una pila se obtiene el último que se introdujo.
		 *      
		 *      Clases concretas: ArrayDeque, PriorityDequue
		 *       
		 *  - Mapas o diccionarios (interfaz Map):
		 *      Guardan elementos asociados a una clave.
		 *      No permiten claves repetidas.
		 *      
		 *      Clases concretas: HashMap, TreeMap, IdentityHashMap, LinkedHashMap,
		 *         HashTable, Properties.
		 */
		
		
		RepositoryPerson rp = new MapRepositoryPerson();
	    rp.insert(new Person(1,"Juan","Lopez",30));
	    rp.insert(new Person(2,"Maria","Rafols",20));
	    rp.insert(new Person(3,"Carmen","Rafols",10));
		rp.insert(new Person(2,"Maria","Rafols",20));
	    
	    //Obtener las personas con menos de 20 años
	    //Person[] menores = rp.find(p->p.getAge()<20);
	    //System.out.println(Arrays.toString(menores));
	}

}
