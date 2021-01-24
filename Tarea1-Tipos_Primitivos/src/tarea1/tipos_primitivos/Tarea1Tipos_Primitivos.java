/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1.tipos_primitivos;

/**
 *
 * @author iv4n8
 */
public class Tarea1Tipos_Primitivos {
    
    //Variable tipo String
    static String variableString="123";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Convertir variable tipo String con valueOf:
        int variableValueOfInteger = Integer.valueOf(variableString);
        //Convertir con en base 10:
        int variableValueOfIntegerBase=Integer.valueOf(variableString,16);//base 16
        //Convertir variable tipo String con Parse: 
        int variableParseInteger =Integer.parseInt(variableString);
        //Variable de tipo Long que contiene la variable integer sumado con 1000
        long variableLong=variableParseInteger+1000;
        //Convertir la variable tipo long a un double usando la clase envoltorio:
        Double variableDouble=(double)variableLong;//Correccion de variable con clase envoltorio despues de ver el ejercicio en clase
        //Mostrar en pantalla la variable de tipo double:
        System.out.println(variableDouble);
        
        //3 variables de tipo double:
        double x,y,z;
        x=1.2;
        y=2.3;
        z=3.4;
        //Operacion con las variables de tipo double recien creadas e inicializadas
        double operacionConVariablesDouble=(x+y)*z;
        //Variable de tipo String donde guardar cadena de texto con el resultado de la operacion anterior:
        String mostrarResultado="Resultado de la ecuacion: "+operacionConVariablesDouble;
        //Mostrar el resultado de la operacion por consola:
        System.out.println(mostrarResultado);
    }
    
}
