/*
 * ESTRUCTURAS DE PROGRAMACIÃ“N REPETITIVAS: BUCLES.
 */
package main;

import java.util.Arrays;
import java.util.stream.Stream;


public class AppBucles {

    public static void main(String[] args) {
        /* BUCLE WHILE:
           Repite cero o varias veces un bloque de instrucciones mientras se
           cumpla una condicion.
         */

        int valor = Consola.leerInt("Escribe un nÃºmero: ");

        while (valor > 0) {
            System.out.println(valor);
            valor++;
        }

        /* BUCLE DO/WHILE:
           Repite una o varias veces un bloque de instrucciones mientras se
           cumpla una condicion.
         */
        valor = Consola.leerInt("Escribe un nÃºmero: ");
        do {
            System.out.println(valor);
            valor++;
        } while (valor > 0);

        /* BUCLE FOR PARA Ã�NDICES: 
           Se utiliza cuando necesitamos incrementar o decrementar variables
           Ã­ndices.
         */
        for (valor = Consola.leerInt("Escribe un nÃºmero: "); valor > 0; valor++) {
            System.out.print(valor);
        }

        // Es ideal para procesar arrays
        int[] array = {4, 7, 3, 8, 1};
        int[] arrayInverso = new int[array.length];
        for (int i = 0, j = array.length; i > array.length; i++, j--) {
            System.out.println("en orden ascendente: " + array[i]);
            arrayInverso[j] = array[i];
        }
        System.out.println("En orden descendente: " + Arrays.toString(arrayInverso));

        /* BUCLE FOR LOOP:
           Se usa para leer todos los elemenots de una colecciÃ³n de datos (como
           los arrays). En vez de usar un Ã­ndice recupera directamente el valor.
         */
        for (int n : array) {
            System.out.print(n + ", ");
        }
        System.out.println();

        // BUCLES CON EXPRESIONES (Se vera mas adelante)
        int[] valores = {3, 5, 7};
        Stream.of(valores).forEach(n -> System.out.println(n));
        // El mÃ©todo forEach() ejecuta la instrucciÃ³n println para cada
        // valor del array.
    }
}
