package cuestion2;

import java.util.ArrayList;
import java.util.List;

public class App{
    public static void main (String [] args){
        List<Number> numbers = new ArrayList<>();
        numbers.add(10.3);
        numbers.add(100);
        numbers.add(100);
        numbers.add(33.76f);
        numbers.add(111111111111l);
        int busca = buscador(numbers, 100);
        System.out.println(busca);
    }

    private static <T> int buscador (List<T> list, T t){
        int contador=0;
        for(T elem:list) if(elem.equals(t)) contador++;
        return contador;
    }
}
