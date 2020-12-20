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
    
    public Arrays(int tamano){
        array = new int[tamano];
    }
    
    public int[] getArray(){
        return array;
    }
    
    public void inicializar(){
        for(int i=0;i<array.length;i++) array[i] = new java.util.Random().nextInt(100)+1;
    }
    
    public boolean isInicializado(){
        return array[0] != 0;
    }
    
    public int[] sumarArray(int[] otroArray){
        int[] resultado = new int[array.length];
        for(int i=0; i<array.length;i++) resultado[i]=array[i]+otroArray[i];
        return resultado;
    }
    
    public int[] multiplicarArray(int[] otroArray){
        int[] resultado = new int[array.length];
        for(int i=0; i<array.length;i++) resultado[i]=array[i]*otroArray[i];
        return resultado;
    }
    
    public int[] invertir(){
        int[] invertido = new int[array.length];
        for(int i=0, j=array.length-1; i<array.length; i++,j--) invertido[i] = array[j];
        return invertido;
    }
    
}
