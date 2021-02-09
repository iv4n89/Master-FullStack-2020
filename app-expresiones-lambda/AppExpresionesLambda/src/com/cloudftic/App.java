package com.cloudftic;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * EXPRESIONES LAMBDA
 *   Una expresion lambda es la forma de abreviar la definicion
 *   de un metodo:
 *       (lista de parametros) -> (instrucciones del metodo)
 *
 *   Si solo contiene una instruccion se puede escribir:
 *       expresion = (a, b) -> a+b;
 *   Si contiene mas de una instruccion hay que poner llaves:
 *       expresion = (a, b) -> {return a+b;};
 *   El tipo de la variable donde asigna la expresion siempre
 *   debe ser el de una interface funcional, y la expresion
 *   debe casar con el metodo abstracto de la interfaz.
 */

public class App {

    public static void main(String[] args) throws Exception {
        List<Articulo> articulos = new ArrayList<>();
        articulos.add(new Articulo("leche"));
        articulos.add(new Articulo("berzas"));
        articulos.add(new Articulo("manzanas"));

        System.out.println(articulos);
        Collections.sort(articulos, (a, b) -> a.getName().compareTo(b.getName()));
        System.out.println(articulos);

        List<String> palabras = leerPalabras();
        System.out.println(palabras);

        List<String> resultado;
        // Obten las palabras que tengan la misma logitud que la primera
        resultado = evalue(palabras, (a, b) -> a.length() == palabras.get(0).length());
        System.out.println(resultado);

        // Obten las palabras que comiencen por la letra "a"
        resultado = evalue(palabras, (a, b) -> a.charAt(0) == 'a');
        System.out.println(resultado);

        // Obten las palabras que tengan todas sus letras en mayusculas
        resultado = evalue(palabras, (a, b) -> a.toUpperCase().equals(a));
        System.out.println(resultado);

        // Obten las palabras que aparezcan en posiciones opuestas.
        // (e.j. si una misma palabra est� al principio y al final se incluye)
        resultado = evalue(palabras, (a,b)->palabras.lastIndexOf(a)==palabras.size()-1-b);
        System.out.println(resultado);

        // Obten las palabras que aparezcan en posiciones opuestas.
        // (e.j. si una misma palabra est� al principio y al final se incluye)
        //resultado = evalue(palabras, null);
        //System.out.println(resultado);

        // Obten las palabras que aparezcan una sola vez en la lista
        resultado = evalue(palabras, (a,b)->palabras.lastIndexOf(a)==palabras.indexOf(a));
        System.out.println(resultado);
    }

    /*
     * Este metodo retorna aquellos elementos de la lista que cumplen con un filtro.
     * El filtro recibe un elemento y su indice dentro de la lista.
     */
    private static List<String> evalue(List<String> list, IFilter filter) {
        List<String> aux = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            if (filter == null || filter.apply(item, i)) {
                aux.add(item);
            }
        }
        return aux;
    }

    private static List<String> leerPalabras() throws Exception {
        URI uri = App.class.getResource("palabras.txt").toURI();
        return Files.readAllLines(Path.of(uri));
    }

}

@FunctionalInterface
interface IFilter {
    boolean apply(String text, int idx);
}

class Articulo {
    private String name;

    public Articulo() {

    }

    public Articulo(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }


}