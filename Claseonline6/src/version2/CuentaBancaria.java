/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Siempre que se trabaje con base de datos es conveniente tener un compilador vacio, aunque tengamos un constructor no vacio aparte
En el constructor no es lo normal hacer acciones que lleven un tiempo. Ejemplo conectarse a una base de datos. Un constructor es sólo un inicializador
Con la herencia tambien se pueden crear comportamientos comunes
 */
package version2;

import main.*;

/**
 *Al haber puesto abstract ya no se pueden crear objetos de la clase CuentaBancaria, pero si se pueden crear de sus subclases.
 * @author iv4n8
 */
public abstract class CuentaBancaria {
    private final String numero;
    private String titular;
    private double saldoActual;

    public CuentaBancaria(String numero) {
        this.numero = numero;
    }
    
    public CuentaBancaria(String numero, String titular){
        this.numero = numero;
        this.titular = titular;
    }
    
    public CuentaBancaria(String numero, String titular, double saldoActual){
        this.numero = numero;
        this.titular = titular;
        this.saldoActual = saldoActual;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    private void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void ingresar(double cantidad){
        this.setSaldoActual(this.getSaldoActual()+cantidad);
    }
    
    public void reintegrar(double cantidad){
        this.setSaldoActual(this.getSaldoActual()-cantidad);
    }

    public String getNumero() {
        return numero;
    }
    
}
