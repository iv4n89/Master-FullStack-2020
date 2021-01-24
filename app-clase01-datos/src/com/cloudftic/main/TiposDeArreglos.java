/*
  Un ARREGLO o ARRAY es un tipo estructurad, por tanto contiene varios datos
  dentro de un mismo bloque de memoria. Pero todos sus datos tienen que tener
  la misma naturaleza y se guardan seguidos dentro de celdas numeradas desde
  cero.
  Es correcto crear un array de nombres, otro array de alturas, etc. No es
  correcto crear un array donde se mezclan en celdas diferentes números que
  indica un precio o un descuento.
 */
package com.cloudftic.main;

public class TiposDeArreglos {
    public static void main(String[] args) {
        // Varias formas de crear un array
        double[] precios = { 23.5, 6.12, 8.5};//Sintaxis simple sin tener que usar new, se esta creando el objeto y dando un valor a cada uno de los indices del array creado, dando tambien el numero de indices que va a tener el array
        double[] descuentos = new double[] { .21, 0.12, 0.4}; //Aque se esta usando la misma sintaxis que arriba, pero no obviando el new para crear el objeto
        //Si se le da tamaño no se pueden dar los valores en la misma linea. Si se dan los valores en la linea no se puede dar el tamaño
        String[] nombres = new String[3];  // = {null, null, null} //Se crea un array de tipo String con 3 celdas sin valor ninguno, por lo que por defecto se les da un valor nulo
        int[] edades=new int[10]; //Un array con 10 celdas con valor 0 por defecto
        edades[1]=30;
        System.out.println(edades[0]);//Va a imprimir en pantalla 0, que es el valor por defecto al no haber sido inicializado.
        System.out.println(edades[1]);//Imprime 30, que es el valor que se le ha dado anteriormente para este indice del array
        
        Articulo[] articulos=new Articulo[5];//Creamos un array de tipo Articulo de 5 indices
        articulos[0]=new Articulo();//Actua como un puntero hacia el bloque de memoria donde se guarda el puntero que apunta a los valores del objeto articulo que se esta creando
        articulos[0].nombre="Juanito";
        articulos[0].codigo=123;
        articulos[0].precio=12.23;
        articulos[0].proveedor=new Proveedor();
        articulos[0].proveedor.nombreProveedor="Juanito Turriano";
        articulos[0].proveedor.telefonoProveedor="111111111";
    }//Las [] indica que es un array del tipo de datos que se esta dando
}


