package main;

import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Document> docs=new ArrayList<>();
        docs.add(new Document(10));
        docs.add(new Document(25));
        docs.add(new Document(20));
        docs.add(new Document(15));
        System.out.println(docs);
        Collections.sort(docs);
        System.out.println(docs);

        ArrayList<Consumible> cons = new ArrayList<>();
        cons.add(new Nobel(300));

        docs.add(docs.get(0).clone());
        System.out.println(docs);

        Comparator<Document> comparator = (a, b) -> a.pageNumber-b.pageNumber;
        Collections.sort(docs, comparator);
        System.out.println(docs);
    }
}

class Document implements Comparable<Document>, Cloneable{
    int pageNumber;

    public Document(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Document[" +
                pageNumber +
                ']';
    }

    @Override
    public int compareTo(Document o) {
        //Compara this con other
        return this.pageNumber-o.pageNumber; //Solo con numeros enteros
    }

    @Override
    public Document clone() throws CloneNotSupportedException {
        return (Document) super.clone();
    }
}

/***
 * Algo es consumible si se puede tasar (ponerle un precio)
 * Si es gratis no es consumible.
 */
interface Consumible{
    double precioMaximo=10000; //Es estatica (compartida-pertenece a la interfaz, no a quienes la implementen) y final (no se puede cambiar su valor)
    double getPrecio();
}

/***
 * Algo es medible si se puede medir su perimetro y calcular su area
 */
interface Medible{
    double calcularArea();
    double getAncho();
    double getAlto();
    double calcularPerimetro();
}

class Nobel extends Document implements Consumible, Serializable {
    private double precio;

    public Nobel(int pageNumber) {
        super(pageNumber);
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }
}

class Ventas{

}

class GestorVentas{
    IRepositorioVentas<Ventas> ventas;
}

class RepositorioVentasBBDD implements IRepositorioVentas<Ventas>{
    @Override
    public void insert(Ventas o) {

    }

    @Override
    public void delete(Ventas o) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void update(Ventas o) {

    }

    @Override
    public Ventas findById(int clave) {
        return null;
    }
    //puede trabajar como almacen con una BBDD local.

}

class RepositorioVentaWeb implements IRepositorioVentas<Ventas>{

    @Override
    public void insert(Ventas o) {

    }

    @Override
    public void delete(Ventas o) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void update(Ventas o) {

    }

    @Override
    public Ventas findById(int clave) {
        return null;
    }
}

class RepositorioFake implements IRepositorioVentas<Ventas>{
    List<Ventas> almacen=new ArrayList<>();

    @Override
    public void insert(Ventas o) {

    }

    @Override
    public void delete(Ventas o) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void update(Ventas o) {

    }

    @Override
    public Ventas findById(int clave) {
        return null;
    }
}

interface IRepositorioVentas<T>{
    void insert(T o);
    void delete(T o);
    void delete(int index);
    void update(T o);
    T findById(int clave);
}