package main;

public class AeropuertoPublico extends Aeropuerto{
    private double subvencion;

    public AeropuertoPublico(String name, String city, String country) {
        super(name, city, country);
    }

    public AeropuertoPublico(String name, String city, String country, Company[] companies, double subvencion) {
        super(name, city, country, companies);
        this.subvencion = subvencion;
    }

    public AeropuertoPublico(String name, String city, String country, double subvencion) {
        super(name, city, country);
        this.subvencion = subvencion;
    }

    public double getSubvencion() {
        return subvencion;
    }
}
