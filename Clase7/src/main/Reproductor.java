/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Este objeto se encarga de gestionar un objeto que se puede reproducir.
 * @author iv4n8
 */
public class Reproductor {
    private Reproducible objeto;//el reproductor conoce el comportamiento de este objeto. A veces habran objetos que gestionan otros objetos.
    
    public Reproductor(Reproducible objeto){
        this.objeto=objeto;
    }
    
    public void iniciarLaReproduccion(){
        objeto.iniciar();
    }
    
    public void pararLaReproduccion(){
        objeto.parar();
    }
}

//interface Reproducible{} //viene a ser lo mismo que una clase abstracta. En java se usa para gestionar multiherencia. Implementa varias herencias