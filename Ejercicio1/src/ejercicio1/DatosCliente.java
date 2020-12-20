//NOTA IMPORTANTE - TODOS LOS DATOS VAN AQUI. DEJAR DE CREAR METODOS QUE GUARDEN DATOS FUERA DE LA CLASE DE ACCESO A DATOS
package ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author iv4n8
 */
public class DatosCliente {
    private String nombre;
    private int anho;
    private int mes;
    private int dia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    /**
     * Calcula la edad en años del cliente en función a los datos introducidos.
     * @return int edad del cliente en años
     */
    public int getEdad(){
        java.time.LocalDate fechaActual = java.time.LocalDate.now();
        int anhoActual = fechaActual.getYear();
        int mesActual = fechaActual.getMonthValue();
        int diaActual = fechaActual.getDayOfMonth();
        int anhosCliente = anhoActual - getAnho();
        int mesesCliente = mesActual - getMes();
        int diasCliente = diaActual -  getDia();
        
        if(diasCliente < 0){
            mesesCliente-=1;
            if(mesesCliente < 0){
            anhosCliente-=1;
            }
        }
        
        
        return anhosCliente;
    }
    
    
    
}
