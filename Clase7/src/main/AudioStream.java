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
public class AudioStream extends Reproducible{
    
    private String rutaFichero;
    private Boolean isPausado=false;
    private Boolean isIniciado=false;
    public AudioStream(String ruta){
        this.rutaFichero = ruta;
    }

    @Override
    public void parar() {
        System.out.println("se ha parado "+ rutaFichero);
    }

    @Override
    public void reanudar() {
        if(isPausado) System.out.println("se ha renaudado "+ rutaFichero);
    }

    @Override
    public void pausar() {
        if(isIniciado&&!isPausado) {isPausado = true; System.out.println("se ha pausado "+ rutaFichero);}
    }

    @Override
    public void iniciar() {
        if(!isIniciado) System.out.println("se ha iniciado "+ rutaFichero);
    }
    
}
