/*
Trabajar con polinomios: ecuaciones con potencias de una variable. Dandole valor a la variable se crean curvas
Se piensa primero en los datos que definen un polinomio, lo primero es definir que es un polinomio. Despues se pensara que es lo que se necesita para seguir con el programa.

 */
package main;

/**
 *
 * @author iv4n8
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] coef1 = {2,4,5.2,8,12.3};
        Polinomio p1 = new Polinomio(coef1);
        p1.getValor(2);
        System.out.println(p1);
        Polinomio p2 = new Polinomio(new double[] {2,3.1,5,-6});
        p2.getValor(5);
        System.out.println(p2);
        
    }
    
}
