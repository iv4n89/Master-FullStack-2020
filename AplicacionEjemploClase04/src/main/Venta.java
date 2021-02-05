/*
 PATRON DE DISEÑO DE CLASES BEAN:
    1) definir atributos/campos privados
       si un atributo tendra valor fijo ponerle el modificador final
       si un atributo es un valor comun para todos los objetos ponerle
       el modificador static
    2) definir metodos get***() publicos para obtener acceso a un dato de
       la clase.
       Aquellos datos que se calculan tendrán un metodo get***(), pero no
       un atributo.
    3) defininir metodos set***() publicos para modificar un dato de la
       clase
    4) definir metodos constructores para inicializar apropiadamente
       los objetos de la clase
 */
package main;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *  Cada clase debe tener un nombre apropiado que se corresponda con el
 *  concepto que representa.
 *  Hay que aplicar el concepto de ENCAPSULACION:
 *       - cada objeto debe ocultar los detalles de implementacion.
 *       - para obtener un dato de un objeto usar un método get***()
 *       - para modificar un dato de una clase usar un método set***()
 *       - para cualquier otra operacion usar un metodo que oculte los detalles.
 *  Hay que aplicar el concepto de COHESION:
 *       - un clase no debe realizar operaciones que no le corresponden
 *         (por ejemplo, la clase Venta debe gestionar el sueldo de un vendedor)
 *  Hay que aplicar el concepto de DESACOPLAMIENTO:
 *       - al escribir el codigo de una clase no debemos depender del codigo
 *         que hayamos escrito en otra clas.
 *       - para evitar acoplamientos de pasarán objetos de otra clase como
 *         argumento
 */
public class Venta {
    // Un dato comun a todos los objetos de tipo Cliente
    public static double iva = 0.21;
    // Datos que no cambiaran de valor (deben ser inicializados en el constructor)
    private final int codigo;
    private final LocalDateTime fecha;
    // Datos que pueden cambiar
    private double precio;
    private String vendedor;
    
    // Constructores

    public Venta(int codigo) {
        // Ejecutamos el segundo constructor con la fecha actual
        this(codigo, LocalDateTime.now(), 0.0, null);
    }

    public Venta(int codigo, LocalDateTime fecha, double precio, String vendedor) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.precio = precio;
        this.vendedor = vendedor;
    }
    
    // Metodos accesores:
    //    tendremos propiedades de solo lectura: codigo, fecha, y pvp
    //    tendremos propiedades de lectura/escritura: precio, vendedor

    public int getCodigo() {
        return codigo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getVendedor() {
        return vendedor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    
    public double getPvp() {  // El precio con iva
        return this.precio * (1 + Venta.iva);
    }
    
    // Operaciones
    
    /**
     * Esta operacion aplica un descuento al precio si el año de venta
     * coincide con el año actual.
     * @param descuento La cantidad que se resta al precio
     */
    public void aplicarDescuentoEspecial(double descuento) {
        if (this.fecha.getYear() == LocalDate.now().getYear()) {
            this.setPrecio( this.getPrecio() - descuento );
        }
    }

    // Este metodo debe retornar un texto representando al objeto actual.
    @Override
    public String toString() {
        return "Venta [" + this.getCodigo() + "] con pvp " + this.getPvp();
    }    
    
}
