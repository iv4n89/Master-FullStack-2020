/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author iv4n8
 */
public class GenerarNumero {
    java.util.Random random = new java.util.Random();
    
    public int numeroAleatorio(){
        int n = random.nextInt(10)+1;
        //System.out.println(n);
        return n;
    }
    
    public int numeroAleatorio(int n, boolean teHasPasado){
        int nuevoNumero;
        if(teHasPasado){
            nuevoNumero = random.nextInt(n)+1;
            //System.out.println(nuevoNumero);
        }else{
            nuevoNumero = random.nextInt(11-n)+n;
            //System.out.println(nuevoNumero);
        }
        return nuevoNumero;
    }
    
}
