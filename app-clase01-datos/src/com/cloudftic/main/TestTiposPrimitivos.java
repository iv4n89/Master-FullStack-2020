/*
 * Tipos primitivos
 * 
 * En un programa necesitaremos manejar datos.
 * En java, para manejar datos simples, como numeros o caracteres,
 * tenemos los tipos primitivos.
 * 
 */
package com.cloudftic.main;

public class TestTiposPrimitivos {

    public static void main(String[] args) {
        
        //String nombre;//Usar nombre de variable que sea significativo con lo que se va a guardar dentro de esta variable. 
        //En Java se tiene que especificar el tipo de variable que va a guardar. En este caso un String (una cadena de caracteres). String es una clase de java dada por las librerias del JDK
        //Se guarda en memoria como binario. Al especificar el tipo de variable que es, esa secuencia binaria se puede interpretar de una manera concreta para saber como tiene que representar el dato
        //Al saber el tipo de dato, nosotros podemos trabajar con los datos de ese bloque de memoria. De otra forma, seria imposible al tener que estar trabajando con secuencias binarias.
        //La variable se puede inicialar al crear la variable o un momento posterior.
        //nombre="Juanito Turriano";
        //Antes de poder usar un bloque de memoria hay que inicializarlo, darle un valor.

	// Las variables de tipos primitivos se declaran de la siguiente forma:
        int variableSinInicializar;
        int var1, var2, var3;
        //Las variables creadas dentro de un metodo son llamadas variables locales. Estas se van a crear cuando se use el metodo, y se van a destruir cuando el metodo deje de hacer su trabajo. 
        //Las variables globales estaran presentes en la memoria siempre que el programa este en funcionamiento

        //System.out.println(variableSinInicializar);
        
        /*
        * Podemos darle un valor (inicializarla) al mismo tiempo que la declaramos.
        * En Java disponemos de los siguientes tipos de datos primitivos:
        */
 
        boolean unBoolean = true;			//1 bit
        byte unByte = 127;				//8 bits
        short unShort = 32767;				//16 bits (numero entero pequeño)
        int unInt = 2147483647; 			//32 bits (numero entero normal)
        long unLong = 9223372036854775807L;		//64 bits (numero entero grande)
        // Cuando escribimos un literal de un numero entero, si queremos forzar que el compilador lo
        // identifique como un long, debemos poner una L al final, ya que si no lo interpretara como un int
        float unFloat = 3.402823E38F;			//32 bits (numero decimal pequeño)
        // Pasa lo mism con el float. Debemos poner una F al final, ya que si no lo interpretar� como un double.
        double unDouble = 1.7976931348623157E308; 	//64 bits (numero decimal grande)
        char unChar = 'a';				//16 bits
        
        //Cada tipo de variable tiene un tamaño maximo. Si queremos crear una variable con un numero increiblemente grande con un tipo int no va a caber dentro del bloque de memoria que se guarda para el. Habria que elegir un tipo de variable de mayor tamaño
        //Si se escribe un numero tal cual, va a interpretarse como un integer. Necesitamos especificar a vaces, como con long (L) o float (F).
        //Numeros decimales=numeros flotantes
        //Cualquier numero que tenga un numero se va a interpretar como un double. Si se pone una F al final del numero en el valor de una variable de tipo float, se va a interpretar como float
        //Java distingue entre "a" (String -  Cadena de un caracter) y 'a' (dato de tipo char - un caracter)
        //'\loquesea' El caracter que lleve delante \ sera un caracter especial, como \n que implica salto de linea.

        System.out.println(unInt);

        /*
        * Para guardar cadenas de texto usaremos la clase String. Un texto entre comillas
        * dobles es interpretado automáticamente como un objeto String.
        * La clase String nos permite guardar una cadena de texto y
        * nos proporciona una serie de metodos para interactuar con ella
        * */
        String texto = "texto guardado en objeto String";

        System.out.println(texto);

        /*
        * Para usar los metodos de una clase sobre un objeto debemos escribir:
        *       objeto.nombreMetodo()
        * Podemos usar el metodo length que nos proporciona la clase String
        * para saber el tamaño de un objeto String concreto
        */
        System.out.println(texto.length());

        /*
        * Para concatenar dos objetos String podemos usar el operador +.
        * El resultado es un nuevo objeto String.
        */
        String texto2 = texto + " texto a�adido";
        System.out.println(texto2);

        /*
        * Java dispone de clases envoltorio para los tipos primitivos.
        * Son otro tipo de clases especiales que aportan funcionalidades
        * a los tipos primitivos
        */
        Boolean objBoolean;
        Byte objByte;
        Short objShort;
        Integer objInteger;
        Long objLong;
        Float objFloat;
        Double objDouble;
        Character objCharacter;

        /*
        * Podemos usar distintos metodos que nos proporcionan estas clases para
        * transformar los datos:
        */
        //Por ejemplo, metodo que convierte un int en una clase envoltorio Integer:
        Integer objInt = Integer.valueOf(unInt);

        //metodo que convierte un Integer en un double
        double numDouble = objInt.doubleValue();

        //metodo que convierte un Integer en un String
        String stringInt = Integer.toString(unInt);

        //m�todo que convierte un String en un int
        int iString = Integer.parseInt(stringInt);

        /*
        * Los nombres de variables, tanto tipos primitivos como objetos, deben empezar
        * por una letra minuscula, o los simbolos _ o $. No pueden tener espacios en blanco.
        * No pueden llamarse como las palabras reservadas (public, default, class, enum...)
        */
        //nombres correctos:
        int precio;
        int _precio;
        int $precio;

        //nombres incorrectos:
//        int 2precio;
//        int public;
//        int numero-entero;

        //los literales con punto decimal se interpretan por defecto como double
        //si queremos guardar este valor en un float, debemos añadir la letra F al final
        unFloat = 12.5F;
        unDouble = 123456.789;

        //Esto es un string que contiene el caracter A
        texto = "A";
        //Esto es un char que contiene el caracter A
        unChar = 'A';
        //No podemos guardar un car�cter en un String, ya que los tipos de datos son distintos
        //texto = 'A';
        //texto = unChar;
        //Para poder almacenar un char en un String, debemos convertirlo previamente, usando
        //el metodo toString() que nos proporciona la clase Character.
        texto = Character.toString(unChar);

        System.out.println(texto);

        /*
        * Algunas operaciones matematicas que podemos realizar:
	*/
        int suma = 1 + 2;
        long multiplicacion = suma * 100;
        float division = 1.5F / 2;
        double modulo = 10 % 5; //calcula el resto de la division de 10 entre 3
        //puede ser util si por ejemplo queremos saber si un numero es
        //divisible por otro (modulo = 0)

        double ecuacion = (suma + multiplicacion) * 5;

        System.out.println(ecuacion);
        
        /*
        Quiero guardar los datos de un vendedor:
        - Nombre
        - Localidad donde opera
        - Si es novato
        - Sueldo medio
        - Su primer dia
        */
        
        String nombre;
        String localidad;
        boolean novato;
        float sueldoMedio=23.4f;
        double d=sueldoMedio+1; //La variable sueldoMedio, al ser un float, se puede guardar en un double, que es double, que es un tipo de variable mas grande
        sueldoMedio=(float)d; //Para convertir esto hay que usar el casteo (float) diciendole entre parentesis a que se quiere convertir. Moldeo. Solo entre tipos compatibles
        String primerDia = "2020-02-23"; //En algunos lenguajes se pueden guardar fechas como String, pero ese NO es el caso de java
        //Parse tiene que convertir datos de un tipo a otro
        //localDate primerDia;
        
        /*
        En este caso es mejor tener una variable de tipo estructurado, de manera que todos los datos esten juntos en un unico bloque de memoria.
        */
    }

}
