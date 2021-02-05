/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author pedro
 */
public class Consola {

    public static String leerStr(String... mensaje) {
        if (mensaje.length > 0) {
            System.out.print(mensaje[0]);
        }
        return new java.util.Scanner(System.in).nextLine();
    }

    public static int leerInt(String... mensaje) {
        if (mensaje.length > 0) {
            System.out.print(mensaje[0]);
        }
        return new java.util.Scanner(System.in).nextInt();
    }

    public static double leerDouble(String... mensaje) {
        if (mensaje.length > 0) {
            System.out.print(mensaje[0]);
        }
        return new java.util.Scanner(System.in).nextDouble();
    }
}
