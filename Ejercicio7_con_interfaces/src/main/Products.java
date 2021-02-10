package main;

import java.util.Objects;
import java.util.Random;

public class Products {
    private static final String NOMBRE_POR_DEFECTO="--SIN NOMBRE--";
    private final String code;
    private String name;
    private String description;

    {
        Random r=new Random();
        char c=(char)((r.nextInt(26)+'A'));
        int n=r.nextInt(1000-100+1)+100;
        code=""+c+n;
    }

    public Products() {
        this.name=NOMBRE_POR_DEFECTO;
    }

    public Products(String description){
        this.name=NOMBRE_POR_DEFECTO;
        this.description=description;
    }

    public Products(String name, String description) {
        this.name = name;
        if(name.equals("")) this.name=NOMBRE_POR_DEFECTO;
        else this.description = description;
    }

    public static String getNombrePorDefecto() {
        return NOMBRE_POR_DEFECTO;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.getCode()+" - "+this.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(getName(), products.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, description);
    }
}
