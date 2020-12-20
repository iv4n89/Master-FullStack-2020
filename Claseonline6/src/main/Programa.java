/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
try intenta una linea de codigo. catch caza la excepcion y caza el mensaje que va a soltar. Se puede soltar ese mensaje. Al hacer esto el programa no deja de funcionar y sigue.
 */
package main;
import main.CuentaBancaria.TIPO;
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
        String s;
        CuentaBancaria cl = new CuentaBancaria("111111", TIPO.CREDITO);
        cl.ingresar(100);
        try {cl.reintegrar(200);} catch (RuntimeException ex){System.out.println(ex.getMessage());}
        System.out.printf("Saldo actual "+cl.getSaldoActual());
    }
    
}
