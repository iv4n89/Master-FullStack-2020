/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Si se le mete abstract a una clase no se pueden crear objetos de esa clase, habria que crear subclases de esa clase y crear objetos de las subclases. La clase abstracta sera solo la base para las subclases
 */
package version2;

/**
 *
 * @author iv4n8
 */
public class CuentaHogar extends CuentaBancaria{
    
    public CuentaHogar(String numero){
        super(numero);
    }
    
}
