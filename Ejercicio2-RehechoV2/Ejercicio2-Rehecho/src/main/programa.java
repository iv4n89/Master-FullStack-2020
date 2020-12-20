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
        boolean acierto;
        int numeroAleatorio =  generarNumero(MIN,MAX); 
        do{
            //System.out.println(numeroAleatorio);
            int numeroIntroducido = InputConsola.pedirNumero();
            acierto = revisarNumero(numeroAleatorio,numeroIntroducido);
            if(numeroAleatorio>numeroIntroducido){
                notificarAcierto(acierto, "menor");
                numeroAleatorio = generarNumero(MIN,numeroIntroducido);
                revisarNumero(numeroAleatorio, numeroIntroducido);
            }else if(numeroAleatorio<numeroIntroducido){
                acierto=false;
                notificarAcierto(acierto, "mayor");
                numeroAleatorio = generarNumero(numeroIntroducido,MAX);
                revisarNumero(numeroAleatorio, numeroIntroducido);
            }else notificarAcierto(acierto);
        }while(!acierto);
    }
    
    private static boolean revisarNumero(int aleatorio, int introducido){
        return aleatorio==introducido;
    }

    private static void notificarAcierto(boolean acierto){
        if(acierto){
            System.out.println("Has acertado.");
        }else{
            System.out.println("No has acertado.");
        }
    }
    
    private static void notificarAcierto(boolean acierto, String caso){
        if(acierto){
            System.out.println("Has acertado.");
        }else{
            System.out.println("No has acertado. Tu numero es " + caso + " que el número aleatorio.");
        }
    }

    private static int generarNumero(int min, int max) {
        GeneradorNumero generador = new GeneradorNumero();
        return generador.numeroAleatorio(min, max);
    }

}
