/*
Patron de diseño para clases de datos:
- Los campos deben ser privados. Usar metodos accesores getters y setters para acceder a los valores desde fuera de la clase
Cuando ponemos static a un campo el campo se crea una sola vez en el objeto clase, no se va a volver a crear en los objetos de esta clase. Es decir, si ponemos fecha como static
va a ser comun a todos los objetos de la clase Cliente, no se va a poder modificar ya que no se va a guardar espacio en memoria para guardar el valor de la variable cuando se cree el objeto
La palabra clave this seguido de punto y la variable, accede a la variable de ese nombre que sea global a la clase. Si this.nombre = nombre, quiere decir que la variable global nombre es = 
a la variable local nombre

- Se crean propiedades publicas para acceder a los campos: metodos getters y setters.
En los get y los set siempre se inicia con minuscula y sigue con mayusculas. Si no se hace asi no serian propiedades.
En caso de los campos static no se usa this en los set, se usa el nombre de la clase, que es el propietario de la variable estatica.
Los métodos creados deben ser get o set para poder usar el potencial de los parametros.
Los metodos estaticos solo van a aparecer cuando se llama directamente a la clase. Si se intenta hacer desde un objeto de una clase no aparecerá como método para ese objeto

La clase cliente solo va a guardar los datos, no a trabajar con ellos. Se necesita otra clase para la gestion de los clientes.
*/


package javaapplication3;

import java.time.LocalDate;

/**
 *
 * @author iv4n8
 */
public class Cliente {
    private String nombre;
    private String apellidos;
    private LocalDate fecha;
    
    /**
     * This method gets the string in the variable nombre of this class
     * @return value of nombre variable
     */
    public String getNombre(){
        
        return nombre.trim();
    }
    
    /**
     * This method set a string to the variable nombre of the class Cliente
     * @param nombre 
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * This method returns the value of the variable int fecha
     * @return LocalDate fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * This method set a value to the variable fecha. It needs to be an int. It can not be a negative number.
     * @param fecha LocalDate
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    /**
     * Metodo que va a calcular la antiguedad segun la fecha dada
     * @return 
     */
    public int getAntiguedad(){
        return LocalDate.now().getYear() - this.getFecha().getYear();
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    /**
     * Usa el valor dado a las variables de nombre y apellidos y nos retorna el nombre completo con un string vacío en medio de ambos
     * @return String con los valores de nombre y apellidos para crear un nombre completo.
     */
    public String getNombreCompleto(){
        return nombre.concat(" ").concat(apellidos);
    }
}
