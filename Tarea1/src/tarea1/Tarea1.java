/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author iv4n8
 */
public class Tarea1 {
    static String variable1 = "123";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = Integer.valueOf(variable1);
        long numeroSumado=numero+1000;
        System.out.println((double)(numeroSumado));
        double x,y,z;
        x=1;
        y=2.2;
        z=5.655;
        double operacion=(x+y)*z;
        String resultado="Resultado de la operacion: "+Double.valueOf(operacion);
        System.out.println(resultado);
    }
    
}
