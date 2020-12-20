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
public class OutputConsola {
    
    public static void mostrarVidas(Juego juego){
        System.out.println("A " + juego.getNombre() + " le quedan " + juego.getVidas() + " vidas.\n");
    }
    
    public static void juegoIniciado(Juego juego){
        System.out.println("El juego de " + juego.getNombre() + " se ha iniciado.\n");
    }
    
    public static void mensajeVidasActualizadas(Juego juego, int numero){
        if(numero<0) System.out.println(juego.getNombre() + " ha perdido " + (numero*-1) + " vidas.\n");
        else if(numero>0) System.out.println(juego.getNombre() + " ha ganado " + numero + " vidas.\n");
    }
    
    public static void mensajeVidasActualizadas(JuegoExt juego) {
    	System.out.println(juego.getNombre() + " ha perdido una vida.\n");
    	if(!juego.quitaVida()) System.out.println("A " + juego.getNombre() + " no le quedan vidas.\n");
    }
    
    public static void mensajeFin(Juego juego){
        if(juego.isTimeout()) System.out.println(juego.getNombre() + " no ha podido acabar el juego antes del tiempo limite de " + String.valueOf(juego.getDuracion()/1000).substring(0, 2) + " segundos.\n");
        else System.out.println(juego.getNombre() + " ha podido acabar el juego antes del tiempo limite de " + String.valueOf(juego.getDuracion()/1000).substring(0, 2) + " segundos.\n");
    }
    
    public static void mensajeReinicio(JuegoExt juego) {
    	System.out.println("El juego de " + juego.getNombre() + " se ha reiniciado.\nSus vidas han vuelto a " + juego.getVidasIniciales() + " vidas.\n");
    }
    
    public static void mensajeRecord(JuegoExt juego) {
    	System.out.println("El anterior record de " + juego.getRecord() + " vidas se ha " + juego.actualizaRecord() + "\n");
    }
}
