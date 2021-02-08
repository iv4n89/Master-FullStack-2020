package cuestion1;

import java.util.*;

import static java.util.Objects.*;

public class ListNames{
    private List<String> names;

    public ListNames(){
        this.names =new ArrayList<>();
    }

    public ListNames(String[] n){
        this.names=new ArrayList<>(Arrays.asList(n));
    }

    public List<String> getNames() {
        return names;
    }

    public String getName(int index){
        return names.get(index);
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void addName(String name){
        names.add(name);
    }

    public void addName(int index, String name){
        names.add(index, name);
    }

    public void addNames(String[] _names){
        this.names.addAll(Arrays.asList(_names));
    }

    public void sortNames(Comparator<String> comparator){
        this.names.sort(comparator);
    }

    @Override
    public String toString() {
        return names.toString();
    }
}
