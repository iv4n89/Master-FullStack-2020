/*
 * Ejercicio 5.
Solicita a través de teclado, y por separado, un día, un mes y un año. Asigna estos tres valores a una variable de tipo LocalDate.

A continuación, utiliza la variable de tipo LocalDate para mostrar la fecha por consola en formato año-mes-día.

Usa una estructura mediante métodos.
 */

package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio5 {
	int dia,mes,anho;
	
	 void ejercicio5() {
		Consola.mostrarMensaje("Se le pedira un entero para incluir en la fecha, en orden dia, mes, año: ");
		pedirDatos();
		mostrarFecha(convertirFecha(anho,mes,dia));
	}

	private void pedirDatos() {
		//Se guardan en las variables los valores introducidos con los metodos individuales para cada variable
		dia=pedirDia();
		mes=pedirMes();
		anho=pedirAnho();
	}
	
	private int pedirDia() {
		//Se pide el dia para incluir en la fecha, debe ser un valor entre 1 y 31 para que sea valido, de otra forma se volvera a pedir un valor
		int dia=0;
		while(dia<1||dia>31) {
			dia=Consola.leerEntero("Introduce un numero entero entre 1 y 31 para el dia de la fecha: ");
			if(dia<1||dia>31) Consola.mostrarMensaje("Ha introducido un numero para dia incorrecto.");
		}
		return dia;
	}
	
	private int pedirMes() {
		//Se pide el mes para incluir en la fecha, debe ser un valor entre 1 y 12 para que sea valido, de otra manera se volvera a pedir un valor
		int mes=0;
		while(mes<1||mes>12) { 
			mes=Consola.leerEntero("Introduce un numero entero entre 1 y 12 para el dia de la fecha: ");
			if(mes<1||mes>12) Consola.mostrarMensaje("Ha introducido un mes incorrecto. ");
		}
		return mes;
	}
	
	private int pedirAnho() {
		//Se pide año para incluir en la fecha
		return Consola.leerEntero("Introduce un numero entero para el año de la fecha: ");
	}

	private void mostrarFecha(LocalDate fecha) {
		//Se muestra la fecha ya convertida a LocalDate, con un formato similar al usado en España
		Consola.mostrarMensaje("La fecha es: "+fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

	private LocalDate convertirFecha(int anho, int mes, int dia) {
		//Se convierte en LocalDate los valores obtenidos
		return LocalDate.of(anho, mes, dia);
	}
}
