/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * ANT: Se encarga del orden de compilacion y las dependencias entre librerias. No solo establece dependencias a nivel de compilacion, tambien a nivel de testeo.
 * En en caso de MAVEN tiene una sintaxis un poco dificil, pero es capaz de buscar por si mismo, previo codigo, una libreria en la nube.
 * Normalmente el IDE tiene funciones para conectarse a bases de datos. JavaDB es para conectarse a bases de datos (java derby) Se pueden usar bases de datos de otras marcas, como mySQL.
 * Antes los datos se guardaban en ficheros fisicos dentro de discos duros en las empresas. Cada registro tenia informacion completa de una venta. Se guardaban secuancialmente. Se guardaban siempre al final, se añadian al final de la "lista"
 * Los indices tenian que ser ficheros aparte, donde se guardaban los codigos y las celdas en las que se encontraban los registros. En cada programa habia que programar todo desde cero.
 * Despues de esto a alguien se le ocurrio crear las bases de datos relacionales, con esto se trabaja con el gestor de bases de datos, en lugar de tener que crear toda la logica desde cero cada vez que se crea un programa nuevo de este tipo.
 * Para estandarizar todo se creo un lenguaje que enviase datos al gestor de base de datos, el lenguaje SQL. Este lenguaje es declarativo, le decimos lo que queremos, no como lo queremos.
 * Las bases de datos relacionales se pueden modificar y gestionar a traves del lenguaje SQL (Standard Query Languaje)
 * Ahora tambien existen bases de datos no estructuradas, creadas para el big data.
 * Hay que seguir unas reglas de diseño, sobre todo reglas de diseño iniciales para crear las bases de datos.
 * @author iv4n8
 */
public class Juego {
    private String nombre;
    private int vidas;
    private long duracion;
    private final long tiempoJuego;
    private long tiempoFinJuego;
    
    public Juego(int vidas,int duracion){
        this.vidas=vidas;
        this.duracion=duracion*1000;//Convertir los segundos introducidos al crear el objeto a milisegundos, para poder operar con el tiempo de juego guardado
        tiempoJuego = System.currentTimeMillis();
    }
    
    public Juego(String nombre, int vidas, int duracion){
        this.vidas=vidas;
        this.duracion=duracion*1000;//Convertir los segundos introducidos al crear el objeto a milisegundos, para poder operar con el tiempo de juego guardado
        this.nombre = nombre;
        tiempoJuego = System.currentTimeMillis();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    public void actualizarVidas(int numero){
        vidas+=numero;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public void finJuego(){
        tiempoFinJuego=System.currentTimeMillis();
    }
    
    public boolean isTimeout(){
        return tiempoFinJuego>=tiempoJuego+duracion;
    }
}
