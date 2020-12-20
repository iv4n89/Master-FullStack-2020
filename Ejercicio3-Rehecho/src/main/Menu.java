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
public class Menu {
    static final String MENU = "MENÚ\n-------------------------------\n1-Cargar el array A\n2-Cargar el array B\n3-Mostrar el array A\n4-Mostrar el array B\n5-Mostrar el resultado de A+B\n6-Mostrar el resultado de A*B\n7-Mostrar el array A al revés\n8-Salir\n\nIntroduce una opción (1-8): ";
    static Arrays arrayA = new Arrays(10);
    static Arrays arrayB = new Arrays(10);
    
    public static void mostrarMenu(){
        System.out.println(MENU);
    }
    
    private static void mostrarArray(int[] array){
        String imprimirArray="";
        for(int i=0;i<array.length;i++){
            if(i<array.length-1) imprimirArray+=array[i] + ", "; 
            else imprimirArray+=array[i]+".";
        }
        System.out.println(imprimirArray);
    }
    
    public static void realizarAccion(int opcion) {
        switch(opcion){
            case 1 ->{
                if(!arrayA.isInicializado()) arrayA.inicializar();
                else System.out.println("El array A ya ha sido inicializado");
            }
            case 2 ->{
                if(!arrayB.isInicializado()) arrayB.inicializar();
                else System.out.println("El array B ya ha sido inicializado");
            }
            case 3 ->{
                if(!arrayA.isInicializado()) arrayA.inicializar();
                else mostrarArray(arrayA.getArray());
            }
            case 4 ->{
                if(!arrayB.isInicializado()) arrayB.inicializar();
                else mostrarArray(arrayB.getArray());
            }
            case 5 ->{
                if(!arrayA.isInicializado()) arrayA.inicializar();
                else if(!arrayB.isInicializado()) arrayB.inicializar();
                else mostrarArray(arrayA.sumarArray(arrayB.getArray()));
            }
            case 6 ->{
                if(!arrayA.isInicializado()) arrayA.inicializar();
                else if(!arrayB.isInicializado()) arrayB.inicializar();
                else mostrarArray(arrayA.multiplicarArray(arrayB.getArray()));
            }
            case 7 ->{
                if(!arrayA.isInicializado()) arrayA.inicializar();
                else mostrarArray(arrayA.invertir());
            }
                
        }
    }
}
