package main;

import java.time.LocalDate;

public class Bolleria extends Consumible{
    private boolean fresco;

    public Bolleria() {
        this(null,null,null,false);
    }

    public Bolleria(String nombre, String descripcion, Proveedor proveedor, boolean fresco) {
        super(nombre, descripcion, proveedor, LocalDate.now().plusDays(1));
        this.fresco = fresco;
    }

    public boolean isFresco() {
        return fresco;
    }

    public void setFresco(boolean fresco) {
        this.fresco = fresco;
    }

    @Override
    public String toString() {
        return super.toString()+
                (isFresco()?"\nEs fresco!":"");
    }
}
