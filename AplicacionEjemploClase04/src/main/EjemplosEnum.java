/*
  Una ENUM permite definir un rango de valores posibles.
  Despues podremos definir variables que solo pueden ser asignadas a uno
  de los valores de la enum.
 */
package main;

public class EjemplosEnum {

    public static void main(String[] args) {
        TipoEmpleado te1 = TipoEmpleado.Asistente;

        // Cambio la puntuacion de los peones
        PiezaAjedrez.Peon.setPuntuacion(5);

        PiezaAjedrez peon = PiezaAjedrez.Peon;

        System.out.println(peon);

    }
}

/**
 * Una enumeracion simple
 */
enum TipoEmpleado {
    Gerente, Directivo, Asistente;
}

/**
 * Una enumeracion personalizable. Las piezas del ajedrez. Cada pieza indicara
 * cuantas hay en el tablero, y a cada pieza se le podrá asignar una puntuacion.
 *
 * Las enumeraciones son un tipo especial de clases, así que podemos añdirles
 * contructores (siempre privados), atributos y métodos.
 */
enum PiezaAjedrez {
    Rey(1, 10), Dama(1, 9), Torre(2, 7), Caballo(2, 6), Alfil(2, 6), Peon(8, 1);

    private int cantidad;
    private int puntuacion;

    private PiezaAjedrez(int cantidad, int puntuacionPorDefecto) {
        this.cantidad = cantidad;
        this.puntuacion = puntuacionPorDefecto;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return this.name() + "(cantidad: " + getCantidad() + ", puntuacion: "
                + getPuntuacion() + ")";
    }

}
