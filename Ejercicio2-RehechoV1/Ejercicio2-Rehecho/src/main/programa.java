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
    private static final int MIN=1,MAX=10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeneradorNumero generador = new GeneradorNumero();
        boolean acierto;
        
        int numeroAleatorio =  generador.numeroAleatorio(MIN,MAX);
        do{
        int numeroIntroducido = InputConsola.pedirNumero();
        //System.out.println(numeroAleatorio);
        acierto = revisarNumero(numeroAleatorio,numeroIntroducido);
        notificarAcierto(acierto);
        }while(!acierto);
        
        
    }
    
    private static boolean revisarNumero(int numA, int numB){
        return numA==numB;
    }
    
    private static void notificarAcierto(boolean acierto){
        if(acierto){
            System.out.println("Has acertado.");
        }else{
            System.out.println("No has acertado. Prueba de nuevo.");
        }
    }
    
}
