/*
   TIPOS ESTRUCTURADOS.
   Los tipos estructurados permiten juntar varios datos de diferente
   naturaleza dentro de un mismo bloque de memoria.
   Para crear tipos estructurados se utilizan clases donde se definen
   variables (los llamados campos).
 */
package com.cloudftic.main;

import java.time.LocalDate;

public class TiposEstructurados {
    public static void main(String[] args) {
        Articulo a1 = new Articulo();
        a1.codigo = 1;
        a1.nombre = "Saco de patatas";
        a1.precio = 10.0;
        System.out.println("Articulo " + a1.codigo + " de nombre " + 
                a1.nombre + " y precio " + a1.precio);
        Vendedor juanito=new Vendedor("Juanito","Madrid",true);
        Vendedor pablita=new Vendedor();
        pablita.nombre="Pablita";
        pablita.localidad="Valencia";
        pablita.novato=false;
        a1.proveedor=new Proveedor();
        a1.proveedor.nombreProveedor="Juan";
        a1.proveedor.telefonoProveedor="111111";
    }
}

class Articulo {
    int codigo;
    String nombre;
    double precio;
    Proveedor proveedor;

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", proveedor=" + proveedor + '}';
    }
    
}//Esta es la manera de crear una variable de tipo estructurado. Una clase que solo va a guardar datos.

class Proveedor{

    @Override
    public String toString() {
        return "Proveedor{" + "nombreProveedor=" + nombreProveedor + ", telefonoProveedor=" + telefonoProveedor + '}';
    }
    
    String nombreProveedor,telefonoProveedor;
}

class Vendedor{
    String nombre;
    String localidad;
    boolean novato;
    LocalDate primerDia;
    Vendedor(){
        
    }
    Vendedor(String nombre, String localidad, boolean novato){
        this.nombre=nombre;
        this.localidad=localidad;
        this.novato=novato;
    }
}//Hay que crear una variable de esta clase para poder guardar los datos de un vendedor.
//La palabra reservada new es el que crea el objeto dentro del bloque de memoria. La variable es el puntero que apunta al bloque de memoria donde esta el objeto.
//Valor por defecto de las variables puntero: null (valor nulo)