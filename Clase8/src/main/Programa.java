/*
 * Base de datos de Ventas: debe almacenar los datos de ventas(codigo, precio, fecha) y sus compradores (nif, nombre, direccion)
 * 
 * Tabla Venta
 * 		codigo - number (PK - Primary Key)
 * 		precio - number (check precio =>1 and precio <=1000)
 * 		fecha  - Date
 * 		idComprador - number (FK - Foreign Key) - clave foranea que relaciona esta tabla con un campo de otra
 * Tabla Comprador
 * 		id - number (PK - Primary Key)
 * 		nif    - text (unique)
 * 		nombre - text
 * 		direccion - text
 * Las bases de datos hay que normalizarlas, se refieren a un determinado modelo. Se necesita que cada registro se diferencia de una manera inequivoca. Se necesita tener una clave primaria
 * Por eficiencia, se prefiere que las PK sean numeros. Lo normal es poner un ID por tabla para normalizarla
 * Se le puede poner condiciones al campo que nos ocupa. Por ejemplo, hacer unico el valor de un campo para que no se pueda repetir (como el caso del nif)
 * Hay que relacionar de alguna manera los datos de una tabla con la otra. 
 * Una base de datos bien diseï¿½ada nunca va a tener campos en el diagrama que se cruzen. Si hay rutas cerradas de campos es que sobra una relacion.
 * HANA es un componente que actua como intermediario de aplicaciones y bases de datos u otras aplicaciones en los sistemas ERP (SAP)
 * El gestor de la base de datos seria el servidor de la base de datos
 * En java existe la clase DriverManager a la que se le da una url, usuario y contraseÃ±a y se conectara al servidor de la base de datos.
 * La conexion se guardaria en una variable de tipo Connection, de la libreria java.sql
 * Se trabaja con comandos de sql a traves de la clase Statement, de la libreria java.sql.statement. Ejecuta comandos de sql. Los textos en sql van siempre entre comillas simples.
 * La libreria que se haya usado (el driver para el servidor) se tiene que referenciar en el proyecto de java. 
 * El programa que estemos creando, si extiende a JFrame adquiere el comportamiento de ventana grafica
 * 
 * La tendencia actual para crear ventanas es la programacion por capas. 
 * Al crear una ventana con un boton necesitamos que ese boton haga algo. Necesitamos darle instrucciones, eventos. Se mezclan las instrucciones de diseño e instrucciones de gestion(?)
 */

package main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Programa extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Programa p1 = new Programa();
                JButton boton = new JButton("OK");
                p1.getContentPane().add(boton);
                p1.setVisible(true);
	}

}
