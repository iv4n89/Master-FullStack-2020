/*

Escribir un programa que pida los datos de 10 clientes. Mostrar el cliente de mayor antiguedad
Arrays: bloques divididos en celdas. 
Arrays en java tienen tamaño maximo, necesitamos crear arrays de un tamaño especifico a la hora de crearlos, son rigidos. Aun asi, hay metodos que permiten redimensionarlos, pero copiando
el antiguo array en un nuevo array con el antiguo mas las nuevas celdas.
Para crear un array: tipo [] nombre
Si se crea una variable local se crea en un bloque de memoria, pero no le guarda un valor. Si se crea una variable global se le pone un valor por defecto.
Si se crea una variable local hay que darle un valor antes de usarlo ya que por defecto no tiene valor.
Al crear un array se guarda la variable en memoria donde a su vez se guarda el lugar de la memoria en el que se va a guardar el array,
Al poner new tipo[numero] se crea el array en memoria dentro del bloque de memoria que dice la variable en la que se guarda
Los arrays se consideran objetos
Los datos compuestos, con datos de diferente naturaleza, se suelen guardar dentro de una clase diferente. Después se crea en la clase principal una variable de tipo Clase-donde-guardamos-los-datos
y entonces se guarda dentro los datos que nos interesan.

Las clases pueden usarse tambien como estructuras de datos.
No es lo mismo valor null que no ponerle valor y que su valor sea indeterminado

 */
package javaapplication3;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author iv4n8
 */
public class JavaApplication3 {
    
    static final int NUMERO_CLIENTES = 2; //Al poner final a una variable se convierte en una constante, no se puede cambiar su valor en ningun momento del codigo

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente clientes[] = new Cliente[NUMERO_CLIENTES];
        solicitarDatosDeClientes(clientes);
        mostrarClienteConMayorAntiguedad(clientes);
    }

    /**
     * 
     * @param clientes 
     */
    private static void solicitarDatosDeClientes(Cliente[] clientes) {
        for(int i=0; i<clientes.length; i++){
            Cliente cliente = solicitarDatosDeCliente();
            clientes[i] = cliente;
        }
        
    }

    /**
     * 
     * @param clientes 
     */
    private static void mostrarClienteConMayorAntiguedad(Cliente[] clientes) {
        Cliente mayor = clientes[0];
        for(int i=1; i<clientes.length;i++){
            if(clientes[i].getAntiguedad() > mayor.getAntiguedad()){
                mayor = clientes[i];
            }
        }
        JOptionPane.showMessageDialog(null, mayor);
    }

    private static Cliente solicitarDatosDeCliente() {
        Cliente cliente = new Cliente();
        cliente.setNombre(solicitarNombre());
        cliente.setApellidos(solicitarApellido());
        cliente.setFecha(solicitarFecha());
        return cliente;
    }

    private static String solicitarNombre() {
        String nombre = JOptionPane.showInputDialog("Introduzca el nombre: ", "");
        return nombre;
    }

    private static String solicitarApellido() {
        String apellido = JOptionPane.showInputDialog("Introduzca el apellido: ", "");
        return apellido;
    }

    private static LocalDate solicitarFecha() {
        String fecha = JOptionPane.showInputDialog("Introduzca fecha (año-mes-dia)", "");
        return LocalDate.parse(fecha);
    }
    
}
