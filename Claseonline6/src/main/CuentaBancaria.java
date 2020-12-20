/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Siempre que se trabaje con base de datos es conveniente tener un compilador vacio, aunque tengamos un constructor no vacio aparte
En el constructor no es lo normal hacer acciones que lleven un tiempo. Ejemplo conectarse a una base de datos. Un constructor es sólo un inicializador
 */
package main;

/**
 *
 * @author iv4n8
 */
public class CuentaBancaria {
    public enum TIPO{ CREDITO, DEBITO, HOGAR};
    private final String numero;
    private String titular;
    private double saldoActual;
    private final TIPO tipo;

    public CuentaBancaria(String numero, TIPO tipo) {
        this.numero = numero;
        this.tipo = tipo;
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

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void ingresar(double cantidad){
        this.setSaldoActual(this.getSaldoActual()+cantidad);
    }
    
    public void reintegrar(double cantidad){
        if(tipo==TIPO.DEBITO) if(getSaldoActual()<cantidad) throw new RuntimeException("No hay dinero suficiente");
        else if(tipo==TIPO.CREDITO) this.setSaldoActual(this.getSaldoActual()-cantidad);
    }

    public String getNumero() {
        return numero;
    }
    
    public TIPO getTipo(){
        return tipo;
    }
    
}
