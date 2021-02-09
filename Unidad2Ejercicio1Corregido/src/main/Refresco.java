package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

enum TipoEnvase{
    lata, botella, brick
}

public class Refresco extends Consumible{
    private TipoEnvase tipoEnvase;
    private double volumen;
    private boolean guardarNevera;

    public Refresco(){
        super();
    }

    public Refresco(String nombre, String descripcion, Proveedor proveedor, LocalDate fechaDeCaducidad, TipoEnvase tipoEnvase, double volumen, boolean guardarNevera) {
        super(nombre, descripcion, proveedor, fechaDeCaducidad);
        this.tipoEnvase = tipoEnvase;
        this.volumen = volumen;
        this.guardarNevera = guardarNevera;
    }

    public TipoEnvase getTipoEnvase() {
        return tipoEnvase;
    }

    public void setTipoEnvase(TipoEnvase tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public boolean isGuardarNevera() {
        return guardarNevera;
    }

    public void setGuardarNevera(boolean guardarNevera) {
        this.guardarNevera = guardarNevera;
    }

    @Override
    public String toString(){
        return super.toString()+
                "\nTipo de envase: "+getTipoEnvase().name()+
                "\nVolumen: "+getVolumen()+"cl"+
                ((isGuardarNevera())?"\nGuardar en nevera!":"");
    }
}
