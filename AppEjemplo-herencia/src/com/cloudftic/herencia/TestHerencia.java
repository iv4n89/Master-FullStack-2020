/*
 * 1
 * 
 * La herencia es uno de los conceptos b�sicos en la programaci�n
 * orientada a objetos.
 * Este mecanismo nos permite que una clase comparta m�todos y
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
		 * usar m�todos y atributos tanto propios como de su superclase
		 * */
		
		Imagen img1 = new Imagen();
		
		img1.nombre = "paisaje";
		img1.tamanho = 256;
		img1.alto = 10;
		img1.ancho = 15;
		img1.abrir();
		System.out.println("Tama�o: " + img1.alto + "x" + img1.ancho);
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
		 * Este tipo de programaci�n tiene m�ltiples ventajas:
		 * 
		 * - Reutilizaci�n de c�digo: Si queremos que distintas clases tengan un mismo m�todo,
		 *   basta con crear una superclase con ese m�todo y hacer que todas clases que queramos
		 *   hereden de esa superclase [ver m�todos Archivo.abrir() Archivo.cerrar()].
		 *   
		 * - Adaptar el dise�o del c�digo al mundo real: Resulta muy intuitivo crear ciertas 
		 *   clases que coinciden con elementos del mundo real, donde encontramos tipos y 
		 *   subtipos de cosas:
		 *   Ejemplo:
		 *     Vivienda
		 *       Piso
		 *         Loft
		 *         D�plex
		 *         �tico
		 *       Chalet
		 *         Chalet adosado
		 *         Chalet independiente
		 *   Es f�cil convertir esta clasificaci�n de viviendas en clases y subclases.
		 *   
		 * - La siguiente ventaja es un concepto muy importante en la Programaci�n Orientada a 
		 *   Objetos: Polimorfismo.
		 *   El polimorfismo es una propiedad de los lenguajes Orientados a Objetos que nos
		 *   permite que en una misma variable podamos almacenar distintos tipos de objetos,
		 *   siempre que �stos hereden de la clase de la variable. 
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
		 * propiedades y m�todos de un archivo, pero OJO, aunque sea un objeto Imagen, como est�
		 * almacenado en una variable de tipo Archivo, no podremos acceder a los atributos y 
		 * m�todos propios de la clase Imagen:
		 * */
		//aImagen.alto;
		//aImagen.convertirJpg();
		/*
		 * De momento veremos alg�n ejemplo en el que podemos sacar provecho de esta
		 * caracter�stica, pero m�s adelante veremos otros.
		 * En nuestro ejemplo, tenemos la ventaja de que podemos crear un almac�n de archivos
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
		docA.tipo = "Hoja de c�lculo";
		directorio.add(docA);
		
		//Podemos manipular objetos de distintas clases almacenados en la misma lista
		boolean isImgA = directorio.contains(imgA);
		directorio.remove(docA);
		
		/*
		 * 6
		 * 
		 * Hay algo que, como vimos antes, no podemos hacer usando polimorfismo: no podemos 
		 * acceder directamente a los atributos y m�todos de la subclase.
		 * */
		//Imagen i = aImagen;
		/*
		 * Aunque el objeto aImagen sea de la clase Imagen, no podemos guardarlo directamente
		 * en una variable de tipo Imagen, porque ha sido declarado como un Archivo.
		 * Si queremos usar el objeto aImagen como una Imagen, previamente devemos convertirlo.
		 * Es una operaci�n conocida como cast (casteo).
		 * */
		Imagen i = (Imagen) aImagen;
		/*
		 * Ahora ya podemos usar el objeto como una Imagen
		 * */
		i.convertirJpg();
		
		/*
		 * Este proceso debe realizarse con cuidado, ya que debemos tener muy claro en todo
		 * momento que el objeto que vamos a castear es del tipo que le estamos indicando ya
		 * que, de no serlo, se producir� un error.
		 * Para asegurarnos de que el objeto que queremos convertir es del tipo que nosotros
		 * queremos, podemos usar la palabra clave instanceof. Esta instrucci�n nos devolver�
		 * true si el objeto es de la clase indicada y false si no lo es.
		 * */
		
		if(aImagen instanceof Imagen) {
			System.out.println("Es el tipo correcto");
		}
		
		/*
		 * 8
		 * 
		 * Hemos sobreescrito el m�todo abrir(). Entonces, �qu� pasar�a si creamos un objeto
		 * imagen y lo almacenamos en una variable de tipo archivo? �qu� m�todo abrir se
		 * ejecutar�a?
		 * */
		Archivo a = new Imagen();
		a.nombre = "retrato";
		a.abrir();
		/*
		 * Se ejecutar�a el m�todo de Imagen, ya que, como record�is, los m�todos (no est�ticos)
		 * se ejecutan sobre el propio objeto. Es decir, el m�todo abrir() se ejecuta sobre el
		 * objeto creado con new Imagen().
		 * */
		
		
	}

}

/*
 * 2
 * 
 * En este ejemplo decimos que las clases Imagen y Documento
 * heredan de la clase Archivo, por lo que ambas adquieren sus atributos
 * y m�todos.
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
	
	//Cuando definamos este constructor, nos aparecer� un error en todas las subclases,
	//indic�ndonos que debemos definirlo
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
	 * Adem�s de los constructores de la superclase, podemos definir cuantos queramos
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
	 * Hemos visto por encima c�mo sobreescribir un m�todo. En otros ejemplos hemos
	 * sobreescrito el m�todo toString() para que transforme un objeto en una cadena de
	 * texto de la manera que nosotros le indiquemos, en lugar del formato por defecto
	 * que realiza el m�todo toString(), heredado de la clase Object.
	 * 
	 * Podemos sobreescribir cualquier m�todo heredado. La anotaci�n @Override nos sirve para 
	 * indicar que un m�todo est� sobreescrito. Es recomendable usarla aunque no es obligatoria.
	 * */
	@Override
	public void abrir() {
		/*
		 * la palabra clave super nos sirve para acceder a los atributos, m�todos e incluso los
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
 * manera no podr�n crearse subclases.
 * */

final class Directorio {
	String nombre;
	Path ruta;
	List<Archivo> archivos;
}