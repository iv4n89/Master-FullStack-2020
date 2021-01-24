/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudftic.main;

/**
 * Almacenar datos de una empresa:
 * - Nombre de empresa
 * - Lista de empleados
 * - Direccion
 * - Sueldo medio de un empleado
 * @author iv4n8
 */
public class EjemplosTiposCompuestos {
    
    public static void main(String[] args){
        Empresa empresa=new Empresa();
        empresa.empleados=new Empleado[10];
        empresa.direccion=new Direccion();
    }
}

class Empresa{
    String nombre;
    Empleado[] empleados;
    Direccion direccion;
    double sueldoMedio;
}

class Empleado{
    
}

class Direccion{
    String calle;
    String ciudad;
    String codigoPostal;
}