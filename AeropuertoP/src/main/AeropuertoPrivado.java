package main;

public class AeropuertoPrivado extends Aeropuerto{
    private String[] enterprises=new String[10];
    private int numEnterprises=0;

    public AeropuertoPrivado(String name, String city, String country) {
        super(name, city, country);
    }

    public AeropuertoPrivado(String name, String city, String country, Company[] companies, String[] enterprises) {
        super(name, city, country, companies);
        this.enterprises = enterprises;
        this.numEnterprises= enterprises.length;
    }

    public void insertarEmpresas(String[] e){
        this.enterprises=e;
        this.numEnterprises=e.length;
    }

    public void insertarEmpresa(String e){
        enterprises[numEnterprises]=e;
        numEnterprises++;
    }

    public String[] getEnterprises() {
        return enterprises;
    }

    public int getNumEnterprises() {
        return numEnterprises;
    }
}
