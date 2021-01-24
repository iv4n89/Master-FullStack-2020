/*
 * Java es un lenguaje Orientado a Objetos. Todo el codigo de Java esta organizado
 * en Clases.
 * 
 * Una Clase es una estructura de codigo que contiene atributos y metodos.
 * Podemos considerar una clase como una plantilla, a partir de la cual
 * se crearan los objetos. Un objeto es una instanciaci�n (la "materializacion")
 * de una clase.
 * 
 * Comparado con el mundo real, una Clase podria ser un plano de una maquina y un
 * objeto seria la propia maquina.
 * 
 * A medida que avancemos en el curso profundizaremos mas en estos conceptos.
 * 
 * */
package com.cloudftic.holamundo;

import java.util.prefs.Preferences;
import java.util.Scanner;

/*
En Java, todo el codigo fuente que escribamos debe pertenecer a una clase. No podemos escribir 
instruciones fuera del �mbito de una clase.
Para definir una clase usamos la palabra clave class, seguida del nombre de la clase.
Por convencion, los nombres de las clases deben empezar con mayuscula, sin espacios ni caracteres
especiales entre cada palaba, y cada palabra debe escribirse con la primera letra mayuscula.
Esta es una norma para la nomenclatura de clases, pero el programa funcionara igual si no la seguimos.
 */
class HolaMundo {

    /*
    * En Java, la ejecucion de un programa siempre comienza por el metodo main.
    * Cuando le digamos a la JVM que queremos ejecutar, esta buscara el metodo main
    * y comenzara a leer las instrucciones de forma secuencial.
    * 
    * El metodo main debe declararse de esta manera:
     */
    public static void main(String[] args) {
        /*
        * Mas adelante veremos que significa cada una de estas palabras.
        * De momento quedaros con que aqui es donde comienza la ejecucion del programa.
        * 
        * Las instrucciones que escribamos se ejecutar�n de manera secuencial.
        */

        //La primera instruccion que vamos a ver es como mostrar una linea de texto por consola:
        System.out.println("Hola Mundo");
        //Scanner sale de java.util
        //Sin entrar en detalles, en esta instruccion estamos llamando al metodo println() de la
        //salida de datos por defecto de Java (mostrar texto por consola).
        //este metodo imprime una linea de texto con el contenido que nosotros le indiquemos		
    }
}

//Dentro de un mismo fichero se pueden crear todas las clases que queramos, pero solo la clase principal con el mismo nombre del archivo debe ser publica
//Si se crean mas clases publicas dentro de un mismo fichero que la clase de mismo nombre, dara un error y no se podra compilar

//A java siempre hay que decirle de donde sale cada cosa. Todo lo que empiece por mayusculas es una clase.
//Los programas constan de dos componentes: datos e instrucciones. Todo en java gira en torno a datos.
//Los lenguajes orientados a objetos suelen funcionar siempre de esta misma manera
//Pensar no en instrucciones, sino en datos.
//Una instruccion es una mezcla de atributos y metodos

//Una clase es un contenedor de codigo
//Las clases funcionan como plantillas, para crear objetos a partir de ellos.
//No se pueden escribir instrucciones fuera del ambito de una clase. 
//Lo que se ejecuta son las instrucciones. Van dentro de llaves {}
//Los nombres de clases van siempre en mayusculas. La clase principal siempre con mismo nombre que el fichero.
//El interprete siempre va a buscar el metodo main para funcionar. Va a ejecutar las instrucciones dentro del metodo main de manera secuencial

//Tipos de datos primitivos: numeros, caracteres, booleanos,...
//Para que java pueda ejecutar los datos, estos datos tienen que ser guardados en variables que se guardan en espacios de memoria en la RAM. Las variables deben tener su tamaño especificado
//Los datos y las instrucciones van en bloques de memoria diferentes. Cuando se abre un programa de java se guarda un bloque de memoria para su ejecucion
//Las variables son en realidad la manera de referenciar un dato que se tiene en memoria.
//Si se quiere guardar un nombre se le dice al pc que guarde un bloque de memoria para guardar ese nombre, luego se crea una variable que trabaja referenciando ese bloque de memoria
//La clase es el plano, el objeto es el que se guarda en memoria.