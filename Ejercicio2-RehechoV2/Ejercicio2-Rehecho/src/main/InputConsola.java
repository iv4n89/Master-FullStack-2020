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
public class InputConsola {
    
    public static int pedirNumero(){
        System.out.println("Introduzca un numero entre 1 y 10: ");
        return new java.util.Scanner(System.in).nextInt();
    }
}
