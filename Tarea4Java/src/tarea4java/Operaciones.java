/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4java;

import static tarea4java.Entrada.recogerEntrada;

/**
 *
 * @author iv4n8
 */
public class Operaciones {
    
    static String pedirNombre(){
        String nombre="";
        while(nombre.length()<4||nombre.length()>10){
           System.out.print("Introduzca un nombre de entre 4 y 10 caracteres: ");
           nombre=recogerEntrada();
        }
        return nombre;
    }
    
    static int recogerNumero(int numero){
        System.out.print("Introduce un numero (no puede ser negativo): ");
        while(numero<=0){
            numero=Entrada.recogerInteger();
        }
        return numero;
    }
    
    static int operacion1(int n1,int n2){
        
        return n1+n2;
    }
    
    static int operacion2(int cantidadNumeros, int media){
        int[] arrayNumeros=new int[cantidadNumeros];
        for(int i=0;i<arrayNumeros.length;i++){
            System.out.print(i+"- Introduce un numero: ");
            arrayNumeros[i]=Entrada.recogerInteger();
            media+=arrayNumeros[i];
            }
        media/=arrayNumeros.length;
        return media;
    }
}
