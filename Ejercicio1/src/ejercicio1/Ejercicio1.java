/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author iv4n8
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO crear programa que solicite nombre, y nacimiento (dia, mes y año) y muetre un mensaje personalizado.
        GestionDatos gestion = new GestionDatos();
        gestion.pedirDatos();
        mostrarSaludo(gestion.cliente);
    }

    /**
     * Muestra un saludo con los datos disponibles del cliente en una ventana emergente.
     * @param cliente 
     */
    private static void mostrarSaludo(DatosCliente cliente){
        JOptionPane.showMessageDialog(null,"Hola " + cliente.getNombre() + ", parece que tienes " + cliente.getEdad() + " años.");
    }
}
