/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4java;

import java.util.Scanner;

/**
 *
 * @author iv4n8
 */
public class Entrada {
    
    static Scanner entrada=new Scanner(System.in);
    
    static String recogerEntrada(){
        return entrada.next();
    }
    
    static int recogerInteger(){
        return entrada.nextInt();
    }
}
