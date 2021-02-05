package main;

import java.util.ArrayList;
import java.util.List;

public class Vuelo {
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private Pasajero[] listaPasajeros;

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros = 0;
        this.listaPasajeros = new Pasajero[numMaxPasajeros];
    }

    public void insertarPasajero(Pasajero pasajero){
        listaPasajeros[numActualPasajeros]=pasajero;
        numActualPasajeros++;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public Pasajero getPasajero(int index){
        return listaPasajeros[index];
    }

    public Pasajero getPasajero(String pasaporte){
        boolean found=false;
        int i=0;
        Pasajero pas=null;
        while((!found)&&(i<listaPasajeros.length)){
            if(pasaporte.equals(listaPasajeros[i].getPasaporte())) {
                found = true;
                pas = listaPasajeros[i];
            }
            i++;
        }
        return pas;
    }
}
