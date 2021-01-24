/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4java;

/**
 *
 * @author iv4n8
 */
public class Tarea4Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre=Operaciones.pedirNombre();
        
         int option=0;
        do{
            Menu.mostrarMenu(nombre);
            System.out.print("Introduzca una opcion: ");
            option=Entrada.recogerInteger();
            
            switch(option){
                case 1->{
                    int n1=0,n2=0;
                    n1=Operaciones.recogerNumero(n1);
                    n2=Operaciones.recogerNumero(n2);
                    System.out.println("El resultado de la suma de estos dos numeros: "+n1+" y "+n2+" es: "+Operaciones.operacion1(n1, n2));
                    break;
                }
                case 2->{
                    int cantidadNumeros=0;
                    int media=0;
                    System.out.print("Introduzca cuantos numeros quiere introducir para calcular la media: ");
                    cantidadNumeros=Entrada.recogerInteger();
                    media=Operaciones.operacion2(cantidadNumeros, media);
                    
                    System.out.println("La media de los numeros introducidos es: "+media);
                }
            }
            
        }while(option!=3);
        
       Menu.mostrarMenu(nombre);
    }    
}
