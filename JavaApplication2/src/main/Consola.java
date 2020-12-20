/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author iv4n8
 */
public class Consola {

    static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    static String leerString(String mensaje) {
        System.out.println(mensaje);
        //String linea = System.console().readLine();
        //return linea;
        //return System.console().readLine(); //No hace falta crear una variable local para retornar un parametro, se puede retornar directamente.
        return (new java.util.Scanner(System.in).nextLine());
    }
    
}
