/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemytarea13;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author iv4n8
 */
public class UdemyTarea13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int[] array=new int[10];
        int conteo_pares=0,conteo_impares=0;
        
        System.out.println("Rellenar el array:");
        for(int i=0;i<10;i++){
            System.out.print(i+". Introduce un numero: ");
            array[i]=entrada.nextInt();
            
            if(array[i]%2==0) conteo_pares++;
            else conteo_impares++;
        }
        
        int par[]= new int[conteo_pares];
        int impar[]=new int[conteo_impares];
        
        conteo_pares=0;
        conteo_impares=0;
        
        for(int i=0;i<10;i++){
            if(array[i]%2==0){
                par[conteo_pares]=array[i];
                conteo_pares++;
            }
            else{
                impar[conteo_impares]=array[i];
                conteo_impares++;
            }
        }
        
        System.out.print("Array pares: ");
        for(int i=0;i<par.length;i++){
            System.out.print(par[i]+" - ");
        }
        
        System.out.print("\nArray impares: ");
        for(int i=0;i<impar.length;i++){
            System.out.print(impar[i]+" - ");
        }
    }
}
