/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author iv4n8
 */
public class Ejercicio2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO generar numero aleatorio entre 1 y 10 y pedir que se adivine. Si se adivina se cierra la app, si se queda corto notificar y usar el valor introducido como max-generar nuevo, si no llega notificar y usar el valor introducido como min-generar
        int numeroAleatorio = generarNumeroAleatorio();
        int numeroIntroducido = pedirNumeroAlUsuario();
        revisarNumeroIntroducido(numeroAleatorio, numeroIntroducido);
        
    }

    private static int generarNumeroAleatorio() {
        System.out.println("Se ha generado un número aleatorio de 1 al 10. Introduzca un número en ese rango para tratar de adivinarlo: ");
        GenerarNumero generador = new GenerarNumero();
        return generador.numeroAleatorio();
    }

    private static int pedirNumeroAlUsuario() {
        int numero;
        PedirNumero scanner = new PedirNumero();
        numero = scanner.leerNumero();
        while (numero < 1 || numero > 10){
            System.out.println("Has introducido un número fuera del rango de 1 a 10. Prueba de nuevo: ");
            numero= scanner.leerNumero();
        }
        return numero;
    }

    private static void revisarNumeroIntroducido(int numeroAleatorio, int numeroIntroducido) {
        if(numeroAleatorio == numeroIntroducido){
            hasGanado(numeroIntroducido, numeroAleatorio);
        }else{
            pruebaDeNuevo(numeroIntroducido, numeroAleatorio);
        }
    }

    private static void hasGanado(int nIntroducido, int nGenerado) {
        System.out.println("Tu número " + nIntroducido + " y el número generado " + nGenerado + " son iguales. Has ganado.");
        System.exit(0);
    }

    private static void pruebaDeNuevo(int numeroIntroducido, int numeroAleatorio) {
        GenerarNumero generador = new GenerarNumero();
        boolean teHasPasado;
        if(numeroIntroducido > numeroAleatorio){
            teHasPasado = true;
            System.out.println("Te has pasado, tu número es más alto que el número aleatorio. Prueba de nuevo: ");
        }else{
            teHasPasado=false;
            System.out.println("Te has quedado corto, tu número es más bajo que el número aleatorio. Prueba de nuevo: ");
        }
        numeroAleatorio = generador.numeroAleatorio(numeroIntroducido, teHasPasado);
        numeroIntroducido = pedirNumeroAlUsuario();
        revisarNumeroIntroducido(numeroAleatorio,numeroIntroducido);
    }
    
}
