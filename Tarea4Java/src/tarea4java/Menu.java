/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4java;

/**
 *
 * @author iv4n8
 */
public class Menu {
    static final String mensajeMenu="Opciones: \n1- Sumar 2 numeros enteros\n2- Calcular la media de un conjunto de numeros\n3- Salir";
       
    static void mostrarMenu(String nombre){
       System.out.println("Hola "+nombre.toUpperCase());
       System.out.println(mensajeMenu);
    }
    
}
