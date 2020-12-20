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
public class Arrays {
    
    private int[] array;
    
    /**
     * Da un valor aleatorio a cada uno de los elementos del array int[] dado.
     * @param array a inicializar
     */    
    public Arrays(int[] array){
        
        for(int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*100);
        }
        array = this.array;
    }
}
