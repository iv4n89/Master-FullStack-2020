/*
 * 1
 * 
 * La herencia es uno de los conceptos básicos en la programación
 * orientada a objetos.
 * Este mecanismo nos permite que una clase comparta métodos y
 * atributos con otra clase.
 * El mecanismo para compartir (heredar) es que una clase (subclase) herede
 * de otra (superclase).
 * Para que una clase herede de otra se usa la palabra extends.
 * */

package com.cloudftic.herencia;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TestHerencia {

	public static void main(String[] args) {
		
		/*
		 * 3
		 * 
		 * Si creamos un objeto de cualquiera de las subclases, podremos
		 * usar métodos y atributos tanto propios como de su superclase
		 * */
		
		Imagen img1 = new Imagen();
		
		img1.nombre = "paisaje";
		img1.tamanho = 256;
		img1.alto = 10;
		img1.ancho = 15;
		img1.abrir();
		System.out.println("Tamaño: " + img1.alto + "x" + img1.ancho);
		img1.convertirJpg();
		img1.cerrar();
		
		Documento doc1 = new Documento();
		doc1.nombre = "manual";
		doc1.tamanho = 16;
		doc1.tipo = "txt";
		doc1.abrir();
		doc1.comprimir();
		doc1.cerrar();
		
		/*
		 * 4
		 * 
		 * Este tipo de programación tiene múltiples ventajas:
		 * 
		 * - Reutilización de código: Si queremos que distintas clases tengan un mismo método,
		 *   basta con crear una superclase con ese método y hacer que todas clases que queramos
		 *   hereden de esa superclase [ver métodos Archivo.abrir() Archivo.cerrar()].
		 *   
		 * - Adaptar el diseño del código al mundo real: Resulta muy intuitivo crear ciertas 
		 *   clases que coinciden con elementos del mundo real, donde encontramos tipos y 
		 *   subtipos de cosas:
		 *   Ejemplo:
		 *     Vivienda
		 *       Piso
		 *         Loft
		 *         Dúplex
		 *         Ático
		 *       Chalet
		 *         Chalet adosado
		 *         Chalet independiente
		 *   Es fácil convertir esta clasificación de viviendas en clases y subclases.
		 *   
		 * - La siguiente ventaja es un concepto muy importante en la Programación Orientada a 
		 *   Objetos: Polimorfismo.
		 *   El polimorfismo es una propiedad de los lenguajes Orientados a Objetos que nos
		 *   permite que en una misma variable podamos almacenar distintos tipos de objetos,
		 *   siempre que éstos hereden de la clase de la variable. 
		 *   La mejor forma de entender esto es con un ejemplo:
		 * */
		
		//Podemos almacenar un objeto Imagen dentro de una variable de tipo Archivo, porque 
		//Imagen hereda de Archivo (Imagen ES UN Archivo).
		Archivo aImagen = new Imagen();
		//Lo mismo con cualquier clase que herede de Archivo
		Archivo aDocumento = new Documento();
		//Lo que no podremos hacer es almacenar un objeto de tipo Archivo en una variable
		//de tipo Imagen. Archivo NO ES UNA Imagen
		//Imagen img2 = new Archivo();
		
		/*
		 * 5
		 * 
		 * Ahora el objeto aImagen "se comporta" como un archivo, es decir, tiene las
		 * propiedades y métodos de un archivo, pero OJO, aunque sea un objeto Imagen, como está
		 * almacenado en una variable de tipo Archivo, no podremos acceder a los atributos y 
		 * métodos propios de la clase Imagen:
		 * */
		//aImagen.alto;
		//aImagen.convertirJpg();
		/*
		 * De momento veremos algún ejemplo en el que podemos sacar provecho de esta
		 * característica, pero más adelante veremos otros.
		 * En nuestro ejemplo, tenemos la ventaja de que podemos crear un almacén de archivos
		 * que contenga cualquiera de sus subtipos:
		 * */
		
		List<Archivo> directorio = new ArrayList<>();
		
		Imagen imgA = new Imagen();
		imgA.nombre = "cielo nublado";
		imgA.alto = 5;
		imgA.ancho = 5;
		directorio.add(imgA);
		
		Documento docA = new Documento();
		docA.nombre = "factura";
		docA.tipo = "Hoja de cálculo";
		directorio.add(docA);
		
		//Podemos manipular objetos de distintas clases almacenados en la misma lista
		boolean isImgA = directorio.contains(imgA);
		directorio.remove(docA);
		
		/*
		 * 6
		 * 
		 * Hay algo que, como vimos antes, no podemos hacer usando polimorfismo: no podemos 
		 * acceder directamente a los atributos y métodos de la subclase.
		 * */
		//Imagen i = aImagen;
		/*
		 * Aunque el objeto aImagen sea de la clase Imagen, no podemos guardarlo directamente
		 * en una variable de tipo Imagen, porque ha sido declarado como un Archivo.
		 * Si queremos usar el objeto aImagen como una Imagen, previamente devemos convertirlo.
		 * Es una operación conocida como cast (casteo).
		 * */
		Imagen i = (Imagen) aImagen;
		/*
		 * Ahora ya podemos usar el objeto como una Imagen
		 * */
		i.convertirJpg();
		
		/*
		 * Este proceso debe realizarse con cuidado, ya que debemos tener muy claro en todo
		 * momento que el objeto que vamos a castear es del tipo que le estamos indicando ya
		 * que, de no serlo, se producirá un error.
		 * Para asegurarnos de que el objeto que queremos convertir es del tipo que nosotros
		 * queremos, podemos usar la palabra clave instanceof. Esta instrucción nos devolverá
		 * true si el objeto es de la clase indicada y false si no lo es.
		 * */
		
		if(aImagen instanceof Imagen) {
			System.out.println("Es el tipo correcto");
		}
		
		/*
		 * 8
		 * 
		 * Hemos sobreescrito el método abrir(). Entonces, ¿qué pasaría si creamos un objeto
		 * imagen y lo almacenamos en una variable de tipo archivo? ¿qué método abrir se
		 * ejecutaría?
		 * */
		Archivo a = new Imagen();
		a.nombre = "retrato";
		a.abrir();
		/*
		 * Se ejecutaría el método de Imagen, ya que, como recordáis, los métodos (no estáticos)
		 * se ejecutan sobre el propio objeto. Es decir, el método abrir() se ejecuta sobre el
		 * objeto creado con new Imagen().
		 * */
		
		
	}

}

/*
 * 2
 * 
 * En este ejemplo decimos que las clases Imagen y Documento
 * heredan de la clase Archivo, por lo que ambas adquieren sus atributos
 * y métodos.
 * */
class Archivo {
	String nombre;
	double tamanho;
	
	public void abrir() {
		System.out.println("Abriendo archivo " + nombre);
	}
	
	public void cerrar() {
		System.out.println("Cerrando archivo " + nombre);
	}

	@Override
	public String toString() {
		return "Archivo [nombre=" + nombre + ", tamanho=" + tamanho + "]";
	}
	
	/* 
	 * 9
	 *  
	 * Los constructores no se heredan. Si queremos usar un constructor de la superclase,
	 * debemos definirlo en la subclase y llamarlo usando la palabla clave super.
	 * 
	 * Si definimos constructores en la superclase, obligatoriamente debemos sobreescribirlos
	 * en las subclases.
	 * */
	
	//Cuando definamos este constructor, nos aparecerá un error en todas las subclases,
	//indicándonos que debemos definirlo
	public Archivo(String nombre, double tamanho) {
		this.nombre = nombre;
		this.tamanho = tamanho;
	}
	
	public Archivo() {}
	
	
	
	
}

class Imagen extends Archivo {
	
	double alto;
	double ancho;
	
	/*
	 * 10
	 * 
	 * Además de los constructores de la superclase, podemos definir cuantos queramos
	 * */
	
	public Imagen() {}
	
	public Imagen(String nombre, double tamanho) {
		//Si queremos que el constructor de la subclase haga lo mismo que el de la
		//superclase, basta con invocarlo de esta forma:
		super(nombre, tamanho);
	}
	
	public Imagen(String nombre, double tamanho, double alto, double ancho) {
		super(nombre,tamanho);
		this.alto = alto;
		this.ancho = ancho;
		
	}
	
	public void convertirJpg() {
		System.out.println("Convirtiendo imagen a jpg");
	}
	
	/*
	 * 7
	 * 
	 * Hemos visto por encima cómo sobreescribir un método. En otros ejemplos hemos
	 * sobreescrito el método toString() para que transforme un objeto en una cadena de
	 * texto de la manera que nosotros le indiquemos, en lugar del formato por defecto
	 * que realiza el método toString(), heredado de la clase Object.
	 * 
	 * Podemos sobreescribir cualquier método heredado. La anotación @Override nos sirve para 
	 * indicar que un método está sobreescrito. Es recomendable usarla aunque no es obligatoria.
	 * */
	@Override
	public void abrir() {
		/*
		 * la palabra clave super nos sirve para acceder a los atributos, métodos e incluso los
		 * constructores de la superclase.
		 * */
		super.abrir();
		System.out.println("El archivo abierto es una imagen.");
	}
}

class Documento extends Archivo {
	String tipo;
	
	public Documento() {}
	
	public void comprimir() {
		System.out.println("Comprimiendo documento");
	}
}

/*
 * 11
 * 
 * Si queremos que una clase no sea heredable, debemos usar el modificador final. De esta
 * manera no podrán crearse subclases.
 * */

final class Directorio {
	String nombre;
	Path ruta;
	List<Archivo> archivos;
}