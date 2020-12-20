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
public class programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Juego juegoJuan = new Juego("Juan", 5, 63);
        OutputConsola.juegoIniciado(juegoJuan);
        OutputConsola.mostrarVidas(juegoJuan);
        actualizarVidas(juegoJuan,-1);
        OutputConsola.mostrarVidas(juegoJuan);
        Juego juegoMarta = new Juego("Marta", 5, 53);
        OutputConsola.juegoIniciado(juegoMarta);
        OutputConsola.mostrarVidas(juegoJuan);
        OutputConsola.mostrarVidas(juegoMarta);
        finalizarJuego(juegoJuan);
        finalizarJuego(juegoMarta);*/
    	
    	JuegoExt juegoJuan = new JuegoExt("Juan", 5, 5);
    	JuegoExt juegoMarta = new JuegoExt("Marta",6,5);
    	OutputConsola.juegoIniciado(juegoJuan);
    	OutputConsola.juegoIniciado(juegoMarta);
        OutputConsola.mostrarVidas(juegoJuan);
    	actualizarVidas(juegoJuan);
    	OutputConsola.mostrarVidas(juegoJuan);
    	reiniciarJuego(juegoJuan);
    	reiniciarJuego(juegoMarta);
    	OutputConsola.mostrarVidas(juegoJuan);
    	OutputConsola.mostrarVidas(juegoMarta);
    	OutputConsola.mensajeRecord(juegoJuan);
    	OutputConsola.mensajeRecord(juegoMarta);
    }
        
    private static void actualizarVidas(Juego juego, int numero){
        OutputConsola.mensajeVidasActualizadas(juego, numero);
        juego.actualizarVidas(numero);
    }
    
    private static void actualizarVidas(JuegoExt juego) {
    	OutputConsola.mensajeVidasActualizadas(juego);
    }
    
    private static void finalizarJuego(Juego juego){
        juego.finJuego();
        OutputConsola.mensajeFin(juego);
    }
    
    private static void reiniciarJuego(JuegoExt juego) {
    	juego.reiniciaPartida();
    	OutputConsola.mensajeReinicio(juego);
    }
}
