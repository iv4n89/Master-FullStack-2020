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
public class GeneradorNumero {
    java.util.Random random = new java.util.Random();
    
    public int numeroAleatorio(int min, int max){
        return random.nextInt(max-min+1)+min;
    }
}
