package main;

import java.time.LocalDate;

public class Movimiento {
	private final LocalDate fecha;
	enum Tipo{ingreso,gasto};
	private final Tipo tipo;
	private final double cantidad;
	
	{
		this.fecha=LocalDate.now();
	}
	
	private Movimiento(Tipo tipo, double cantidad) {
		this.tipo = tipo;
		this.cantidad=cantidad;
	}
	
	public static Movimiento newIngreso(double cantidad) {
		return new Movimiento(Tipo.ingreso,cantidad);
	}
	
	public static Movimiento newGasto(double cantidad) {
		return new Movimiento(Tipo.gasto, cantidad);
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public double getCantidad() {
		return cantidad;
	}
}
