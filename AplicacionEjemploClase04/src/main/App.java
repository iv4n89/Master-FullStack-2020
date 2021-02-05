package main;

import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {
        // Varias formas de crear objetos Venta
        Venta venta1 = new Venta(1);
        venta1.setPrecio(16.0);
        venta1.setVendedor("Andres");

        Venta venta2 = new Venta(2, LocalDateTime.of(2015, 3, 12, 0, 0), 100, "Juan");

        // Comprobamos el precio con iva de cada venta
        System.out.println(venta1);
        System.out.println(venta2);

        // Aplicamos descuentos
        venta1.aplicarDescuentoEspecial(5);
        venta2.aplicarDescuentoEspecial(5);

        // Comprobamos el precio con iva de cada venta
        System.out.println(venta1);
        System.out.println(venta2);
    }

}
