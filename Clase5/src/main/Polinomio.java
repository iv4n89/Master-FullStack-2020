/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa un polinomio
 * Un polinomio queda definido por sus coeficientes y por su grado (maxima potencia - Numero de coeficientes -1)
 * 
 * p1= -3 + 1*x -7*x^3 +12*x^4
 * p1 tiene coeficientes: -3, 1, 0,-7, 12
 * p1 tiene grado 4
 * 
 * Diferenciar las variables de tipo base (uno normal) de las variables de tipo objeto (como los array) - en la memoria se guarda solo el lugar de la memoria donde se va a guardar el valor de la variable, asi que su valor es nulo por defecto
 * Metodo constructor forma parte de la definicion de la clase, se usa para inicializar el objeto de la clase concreta
 * 
 */
public class Polinomio {
    private double[] coeficientes;
    
//    public Polinomio(double d0, double d1, double d2, double d3, double d4) {
//        coeficientes = new double[5];
//        coeficientes[0] = d0;
//        coeficientes[1] = d1;
//        coeficientes[2] = d2;
//        coeficientes[3] = d3;
//        coeficientes[4] = d4;
//    }
    
    public Polinomio(double[] coef){
        coeficientes = coef;
    }
    
    public double getGrado(){
        return coeficientes.length-1;
    }
    
    public double getValor(double x){
        double acumulador = 0.0;
        for(int i=0; i<coeficientes.length; i++){
            double potencia = coeficientes[i]*Math.pow(x,i);
            acumulador += potencia;
        }
        return acumulador;
    }
    
    
    //Lo normal si necesitamos un indice es usar el bucle for. Si no necesitamos un indice lo normal es usar el foreach.
    //Programación funcional: parte de crear un flujo de datos
    @Override
    public String toString(){
        String texto = "";
//        for(int i=0; i<coeficientes.length;i++) texto+=String.format("%+.2f·x^%d",coeficientes[i],i);
//        return texto;
//        int i=0;
//        for(double coeficiente: coeficientes) {texto+=String.format("%+.2f·x^%d",coeficiente,i); i++;}
//        return texto;

//        Arrays.stream(coeficientes).sum(); //suma los valores de un array y devuelve la suma en una variable de mismo tipo que el array
        return Stream.iterate(0, n-> n+1).limit(coeficientes.length).map(n-> String.format("%+.2f·x^%d", coeficientes[n],n)).collect(Collectors.joining());   
        //se declara que se quiere generar unos numeros, comenzando desde cero, limitado al tamaño de coeficientes, que usa un texto formateado para cada numero y que se juntan con collect.
    }
}

//Tendencia actual es usar un lenguaje declarativo para crear interfaces graficas (en java: javafx) - parecido a html
