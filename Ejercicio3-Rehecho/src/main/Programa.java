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
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        
        do{
            Menu.mostrarMenu();
            opcion = InputConsola.leerNumero();
            Menu.realizarAccion(opcion);
        }while(opcion!=8);
    }

    
    
}
