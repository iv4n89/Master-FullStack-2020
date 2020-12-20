
package main;
//paquete - una manera de organizar las clases y clasificarlas. Seria como una analogia entre los ficheros (clases) y las carpetas(package)
//Esto es parte de la organizacion a la hora de la compilacion.
//Podemos tener varias clases con el mismo nombre, pero en paquetes diferentes. 
//Lo normal es que la clase publica se corresponde con el nombre del fichero. Solo una clase publica por fichero, si no dara error.
//Lo mejor es tener una clase por fichero. No se comporta java igual que otros lenguajes similares

//Dentro de una clase no se puede poner directamente dentro de una clase, siempre dentro de un metodo o dentro de un bloque {}.
//Si tenemos un bloque sin nombre del metodo, se llama bloque anonimo
//Main determina cual es el metodo inicial que se va a ejecutar al inicio. Java ejecuta clases, no ficheros.
//Los ficheros anonimos no se pueden invocar, se ejecutan en un determinado orden.
//



//Java está orientado totalmente a objetos. Las clases se organizan en paquetes, que contienen las clases.
//La clase que se llame igual que el fichero será el que tenga el metodo main

//TODO escribir un programa que solicite los datos de un cliente (con su nombre y tratamiento). Despues el programa debe saludar al cliente con un mensaje.
//Paso 1: definir las estructuras de datos: que datos va a almacenar este programa. En java hay que decir que tipos de datos almacena cada variable.
/*
Como variables globales solo las variables que necesitemos mantener con vida durante todo el programa
Paso 2: definir la estrunctura del programa como componentes modulares. 
Si una variable retorna algun dato, se debe guardar en alguna variable, normalmente local

Programacion por capas:
cuando se crean diferentes componentes de un programa se suelen crean en 3 capas:
1. Capa de la logica del negocio
2. Capa de acceso a datos
3. Capa de presentacion al usuario

Se pueden diferenciar claramente una capa de otra de diferentes maneras
En aplicaciones de escritorio se suele partir de la presentacion al usuario e ir expandiendo el codigo desde ahi
Cada capa tendra sus propias clases. 

Orden para invocar segun las capas: Presentacion al usuario --> Logica del negocio --> Acceso a datos. Siempre hacia adelante, no hacia atras
Las clases se pueden especializar para que trabajen solo con algo especifico
*/

public class programa {
    static String tratamiento;
    static String nombre;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        solicitarDatos();
        saludar();
    }
    
   
    




/*
//ejemplos
    static double x(int valor){
        return valor;
    }
    
    static double y(double valor){
        return valor*2;
    }
    
        // TODO code application logic here
        double d = x(8); //se invoca el metodo x, dandole de variable el numero 8 y se guarda en la variable d
        double resultado = y(d); //se invoca el metodo y con el valor de la variable d como parametro
        
        //tambien se pueden encadenar directamente si se ve claro:
        double resultado = y(x(8));
*/

    private static void solicitarDatos() {
        tratamiento = Consola.leerString("Introduce el tratamiento (Sr./Sra./Srta)");
        nombre = Consola.leerString("Introduce nombre y primer apellido");
        
    }

    private static void saludar() {
        Consola.mostrarMensaje("Hola " + tratamiento + " " + nombre);
    }
    
}
