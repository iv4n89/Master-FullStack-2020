package main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

import javax.management.RuntimeErrorException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date fechaActual = new Date();
		UtilidadesFechas1 uf1= new UtilidadesFechas1("dd, MM, yyyy");
		System.out.println(uf1.convertirDateAString(fechaActual));
		System.out.println(uf1.tiempoEntre2Fechas(fechaActual, new Date(200000)));
	}

}


