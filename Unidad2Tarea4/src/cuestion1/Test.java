package cuestion1;

import java.util.Collections;
import java.util.Comparator;

public class Test {

    public static void main(String[] args){
        ListNames names =createListNames(new String[]{"Geronimo, Luis","Pikillo, Papa", "Currupipi, Agapito"});
        showUnsortedList(names);
        names.addNames(new String[]{"Corsemino, Juan", "Garcilaso, Manuel", "Lilith, Ana", "Genero, Elena", "Male, Eden", "Vanitas, Kirlian"});
        showUnsortedList(names);
        names.addName("Loki, John");
        showUnsortedList(names);
        names.addName(2,"Willy, Fer");
        showUnsortedList(names);
        showSortedList(names);

    }

    private static ListNames createListNames(){
        return new ListNames();
    }

    private static ListNames createListNames(String[] names){
        return new ListNames(names);
    }

    private static void showUnsortedList(ListNames names){
        System.out.println(names.toString());
    }

    private static void showSortedList(ListNames names){
    	Comparator<String> comparador=(a,b)->a.split(", ")[1].compareTo(b.split(", ")[1]);
    	comparador=comparador.thenComparing((a,b)->a.split(", ")[0].compareTo(b.split(", ")[0]));
        names.sortNames(comparador);
        System.out.println(names);
    }

}

