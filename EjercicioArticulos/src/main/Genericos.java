package main;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.util.Date;

public class Genericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona juan=new Persona();
		Persona ana=new Persona();
		Cita<LocalDate> cita1=new Cita<>(juan,ana,LocalDate.parse("2021-03-12"));
		//Cita<String> cita2=new Cita<>(juan,ana,"2021-03-12");
		//Cita<Date> cita3=new Cita<>(juan, ana,new Date());
	}

}

class Persona{
	
}

class Cita<T extends Temporal>{
	private Persona persona1;
	private Persona persona2;
	T fecha;
	public Cita(Persona persona1, Persona persona2, T fecha) {
		super();
		this.persona1 = persona1;
		this.persona2 = persona2;
		this.fecha = fecha;
	}
	
	public int getDia() {
		return fecha.get(ChronoField.DAY_OF_MONTH);
	}
	
	public int getMes() {
		return fecha.get(ChronoField.MONTH_OF_YEAR);
	}
	
	public int getAnho() {
		return fecha.get(ChronoField.YEAR);
	}
	
	public int getHora() {
		return fecha.get(ChronoField.HOUR_OF_DAY);
	}
	
	public int getMinutos() {
		return fecha.get(ChronoField.MINUTE_OF_HOUR);
	}
	
	public int getSegundos() {
		return fecha.get(ChronoField.SECOND_OF_MINUTE);
	}
}