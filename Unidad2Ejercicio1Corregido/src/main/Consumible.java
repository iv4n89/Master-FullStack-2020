package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Consumible {
    private String nombre;
    private String descripcion;
    private Proveedor proveedor;
    private LocalDate fechaDeCaducidad;

    public Consumible() {
        this(null,null,null, LocalDate.now());
    }

    public Consumible(String nombre, String descripcion, Proveedor proveedor, LocalDate fechaDeCaducidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.proveedor = proveedor;
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    /***
     * Comprueba si la fecha de caducidad es mayor que la actual
     * @return true si es asi
     */
    public boolean isCaducado(){
        LocalDate fechaActual= LocalDate.now();
        return this.fechaDeCaducidad.compareTo(fechaActual) > 0;
    }

    public static LocalDate convertirFecha(String fecha){
        return LocalDate.parse(fecha);
    }

    public static String convertirFecha(LocalDate fecha){
        return fecha.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDate getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(LocalDate fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    @Override
    public String toString() {
        return "["+this.getNombre()+"]\n[Fecha de caducidad: "+this.getFechaDeCaducidad().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+"]";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
