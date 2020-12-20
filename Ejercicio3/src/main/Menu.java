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
    static String MENU = "MENÚ\n-------------------------------\n1-Cargar el array A\n2-Cargar el array B\n3-Mostrar el array A\n4-Mostrar el array B\n5-Mostrar el resultado de A+B\n6-Mostrar el resultado de A*B\n7-Mostrar el array A al revés\n8-Salir\n\nIntroduce una opción (1-8): ";
    int opcion;
    
    /**
     * Método que mostrará el menú en pantalla
     */
    public void mostrarMenu(){
        
        System.out.println(MENU);
        
    }
    
    /**
     * Se recogerá la opción del menú, por número del 1 al 9, y se devolverá dentro de la variable opcion para su posterior uso
     * @return int opcion escogida por usuario
     */
    public int recogerOpcion(){
        opcion = new java.util.Scanner(System.in).nextInt();
        while(opcion < 0 || opcion > 8){
            System.out.println("Opción incorrecta, revisa de nuevo el menú para ver las opciones disponibles: ");
            mostrarMenu();
            opcion = new java.util.Scanner(System.in).nextInt();
        }
        return opcion;
    }
    
    
    /**
     * Método que va a realizar la opción elegida
     */
    public void realizarOpcion(){
        int[] numerosA = new int[10];
        int[] numerosB = new int[10];
        
        do{
            mostrarMenu();
            opcion = recogerOpcion();
            
            
            switch (opcion) {
                case 1 -> {
                    if(numerosA[0] == 0){
                    Arrays arrayA = new Arrays(inicializarArray(numerosA, "A"));
                    }
                    else{
                        System.out.println("El array A ya ha sido inicializado. Pulsa 3 para ver su contenido.");
                    }
                    
                }
                case 2 -> {
                    if(numerosB[0] == 0){
                    Arrays arrayB = new Arrays(inicializarArray(numerosB, "B"));
                    }
                    else{
                        System.out.println("El array B ya ha sido inicializado. Pulsa 4 para ver su contenido.");
                    }
                }
                case 3 -> {
                    if(numerosA[0] != 0){
                        
                        System.out.println("El array A se compone de: " + mostrarArray(numerosA));
                    }else{
                        System.out.println("El array A no se ha inicializado aún. ¿Desea hacerlo ahora?\n1- Si\n2- No");
                        int opcionInterna = new java.util.Scanner(System.in).nextInt();
                        if(opcionInterna == 1){
                            Arrays arrayA = new Arrays(inicializarArray(numerosA, "A"));
                        }else{
                            break;
                        }
                    }
                }
                case 4 -> {
                    if(numerosB[0] != 0){
                        System.out.println("El array B se compone de: " + mostrarArray(numerosB));
                    }else{
                        System.out.println("El array B no se ha inicializado aún. ¿Desea hacerlo ahora?\n1- Si\n2- No");
                        int opcionInterna = new java.util.Scanner(System.in).nextInt();
                        if(opcionInterna == 1){
                            Arrays arrayB = new Arrays(inicializarArray(numerosB, "B"));
                        }else{
                            break;
                        }
                    }
                }
                case 5 -> {
                    int [] suma = new int[10];
                    if(numerosA[0]==0){
                        System.out.println("El array A no se ha incializado. Pulsa 1 para hacerlo antes de poder sumar ambos arrays");
                    }else if(numerosB[0]==0){
                        System.out.println("El array B no se ha incializado. Pulsa 2 para hacerlo antes de poder sumar ambos arrays");
                    }else{
                        for(int i=0; i<numerosA.length; i++){
                            suma[i] = numerosA[i] + numerosB[i];
                        }
                        System.out.println("La suma de ambos arrays es: " + mostrarArray(suma));
                    }
                }
                case 6 -> {
                    int [] multiplicacion = new int[10];
                    if(numerosA[0]==0){
                        System.out.println("El array A no se ha incializado. Pulsa 1 para hacerlo antes de poder sumar ambos arrays");
                    }else if(numerosB[0]==0){
                        System.out.println("El array B no se ha incializado. Pulsa 2 para hacerlo antes de poder sumar ambos arrays");
                    }else{
                        for(int i=0; i<numerosA.length; i++){
                            multiplicacion[i] = numerosA[i] * numerosB[i];
                        }
                        System.out.println("La suma de ambos arrays es: " + mostrarArray(multiplicacion));
                    }
                }
                case 7 -> {
                    if(numerosA[0]!=0){
                        System.out.println(mostrarArrayDelReves(numerosA));
                    }else{
                        System.out.println("El array A no se ha inicializado aún. Pulsa 1 para hacerlo.");
                    }
                }
                case 8 -> System.exit(0);
            }
        }while(opcion!=8);
        
    }
    
    
    /**
     * Inicializa con números aleatorios el array dado, devuelve el array con los nuevos valores e imprime en consola un mensaje de feedback al usuario donde se indica que el "array x" (x corresponde a la letra/número dado por parámetro) ya puede usarse en el resto de operaciones.
     * @param array a incializar
     * @param letra del array que se está inializando para imprimir su nombre en pantalla correctamente.
     * @return  array que se dió por parámetro, esta vez con los nuevos valores
     */
    public int[] inicializarArray(int[] array, String letra){
        System.out.println("El array " + letra + " se ha inicializado.");
        return array;
    }
    
    /**
     * Recorre el array dado para mostrarlo en pantalla con una "," entre los valores. "." para simbolizar el final del array.
     * @param array que se quiere mostrar
     * @return mensaje por consola donde se muestran los valores del array dado, diferenciados con una "," entre valor.
     */
    public String mostrarArray(int[] array){
        String retorno = "";
        for(int i=0; i<array.length; i++){
            if(i!=array.length-1){
                retorno += array[i] + " , ";
            }else{
                retorno += array[i] + ".";
            }
        }
        return retorno;
    }
    
    /**
     * Muestra el array dado, cuyos valores se mostrarán en sentido inverso al registrado dentro del array
     * @param array que se quiere mostrar del revés
     * @return array dado impreso en consola, ordenado del revés respecto al orden del propio array, con una "," entre valores.
     */
    public String mostrarArrayDelReves(int[] array){
        System.out.println("Esta es la información de array A del revés:");
        String retorno = "";
        for(int i=0; i<array.length; i++){
            if(i!=array.length-1){
                retorno += array[array.length-1-i] + " , ";
            }else{
                retorno += array[0] + ".";
            }
        }
        return retorno;
    }
    
}
