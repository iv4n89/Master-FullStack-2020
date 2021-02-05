/*
 * ESTRUCTURAS DE PROGRAMACIÓN ALTERNATIVAS O CONDICIONALES.
 */
package main;

public class AppAlternativa {

    public static void main(String[] args) {
        /* ESTRUCTURA ALTERNATIVA if/else:
           Permite tomar decisiones basado en si se cumple una condicion
         */

        int valor = Consola.leerInt("Escribe un número entero: ");

        if (valor > 2) {
            System.out.println("La condicion se cumple");
        }

        // Podemos añadir un else para ejecutar algo si la condicion no se cumple
        if (valor > 2) {
            System.out.println("La condicion se cumple");
        } else {
            System.out.println("La condicion no se cumple");
        }

        // Se pueden anidar varias condiciones excluyentes:
        if (valor < 3) {
            System.out.println("El valor es menor que 3");
        } else if (valor < 6) {
            System.out.println("El valor es menor que 6");
        } else if (valor < 9) {
            System.out.println("El valor es menor que 9");
        } else {
            System.out.println("El valor es menor que mayor o igual que 9");
        }

        /* EXPRESION ALTERNATIVA con el operador ternario  ?: 
           En una única expresion permite evaluar una condicion y retornar
           un valor si se cumple u otro valor si no se cumple
         */
        String resultado = valor > 3 ? ">3" : "<=3";
        System.out.println(resultado);

        // se pueden anidar expreseiones alternativas
        resultado = valor > 3 ? (valor > 8 ? ">8" : ">3 y <=8") : (valor == 3 ? "==8" : "<3");
        System.out.println(resultado);

        /* ESTRUCTURA ALTERNATIVA CON switch
           Cuando hay que comparar un dato contra valores posibles es preferible
           al if/else.
           Permite comparar datos simples, String y enumeraciones.
         */
        switch (valor) {
            case 1:
                System.out.println("es 1");
                break;
            case 2:
            case 3:
                System.out.println("es 2 o 3");
                break;
            case 4:
                System.out.println("es 4");
                break;
            default://Solo se ejecuta si lo que se compara no entra en ninguno de los casos. No es necesario que este abajo, puede estar arriba.
                System.out.println("No es 1, 2, 3 o 4");
                break;
        }

        /* SWITCH DE EXPRESIONES (desde JDK 14 version 58.65535)
           Es una sintaxis (experimental) más rica que la del switch clásico
         */
        switch (valor) {
            case 1 -> {
                System.out.println("Es 1");
            }
            case 4 -> {
                System.out.println("Es 4");
            }
            default -> {
                System.out.println("No es 1 ni 4");
            }
        }

        String resultadoswitch = switch (valor) {
            case 1 ->
                "Es 1";
            case 4 ->
                "Es 4";
            default -> {
                // sin llaves se retorna el valor. Con llaves hay que usar yield.
                yield "No es No es 1 ni 4";//Usa yield para devolver algo, si se usa return para retornar acabaria con el proceso del switch
            }
        };
        System.out.println(resultadoswitch);

    }

}
