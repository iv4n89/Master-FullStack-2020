/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2.arrays;

/**
 *
 * @author iv4n8
 */
public class Tarea2Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    	System.out.println(operacionA());
        System.out.println(operacionB());
        System.out.println(operacionC("Juan",20));
       
    }
    
    
    static String operacionA(){
        String[] arrayA=new String[3];
        arrayA[0]="Esto es ";
        arrayA[1]="un array";
        arrayA[2]=" de String";
        String arrayToString="";
        for (String str : arrayA) {arrayToString += str;}
        return arrayToString;
    }
    
    static int operacionB(){
        int[] arrayB={1,2,3};
        int media=0;
        for(int i=0;i<arrayB.length;i++){
            media+=arrayB[i];
        }
        return media/=(double)arrayB.length;
    }
    
    static String operacionC(String nombre, int edad) {
    	return nombre+" tiene "+String.valueOf(edad)+" años.";
    }
    
}
