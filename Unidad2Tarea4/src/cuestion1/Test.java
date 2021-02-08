package cuestion1;

public class Test {

    public static void main(String[] args){
        ListNames names =createListNames(new String[]{"Geronimo","Pikillo", "Currupipi"});
        showUnsortedList(names);
        names.addNames(new String[]{"Corsemino", "Garcilaso", "Lilith", "Genero", "Male", "Vanitas"});
        showUnsortedList(names);
        names.addName("Loki");
        showUnsortedList(names);
        names.addName(2,"Willy");
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
        names.sortNames((a,b)->a.compareTo(b));
        System.out.println(names);
    }

}

