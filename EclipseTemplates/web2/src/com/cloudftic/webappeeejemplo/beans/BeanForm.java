/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudftic.webappeeejemplo.beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("beanForm")
@SessionScoped
public class BeanForm implements Serializable {

    private String nombre;
    private double altura = 1.0;
    private LocalDate fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDatosStr() {
        return String.format("%s, nace en %tF, mide %.2f de altura", nombre, fechaNacimiento, altura);
    }

    public String cambiarNombre() {
        this.nombre = this.nombre.toUpperCase();
        return null;
    }
}
