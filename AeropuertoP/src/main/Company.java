package main;

public class Company {
    private String name;
    private Vuelo[] listaVuelos = new Vuelo[10];
    private int numVuelo = 0;

    public Company(String name) {
        this.name = name;
    }

    public Company(String name, Vuelo[] listaVuelos) {
        this.name = name;
        this.listaVuelos = listaVuelos;
        this.numVuelo = listaVuelos.length;
    }

    public void insertarVuelo(Vuelo vuelo){
        listaVuelos[numVuelo] = vuelo;
        numVuelo++;
    }

    public String getName() {
        return name;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public Vuelo getVuelo(int index){
        return listaVuelos[index];
    }

    public Vuelo getVuelo(String id){
        boolean found=false;
        int i=0;
        Vuelo v=null;
        while((!found)&&i< listaVuelos.length){
            if(id.equals(listaVuelos[i].getIdentificador())){
                v=listaVuelos[i];
                found=true;
            }
            i++;
        }
        return v;
    }
}
