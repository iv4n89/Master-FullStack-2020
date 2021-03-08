package cuestion1;

import java.util.regex.Pattern;

public class Empleado {
	
	private final String nif;
	private final String nombre;
	private double sueldo;
	
	public Empleado(String nif, String nombre) {
		this.nif=nifValidated(nif);
		this.nombre=nombre;
	}
	
	public Empleado(String nif, String nombre, double sueldo) {
		this(nif, nombre);
		this.sueldo=sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getNif() {
		return nif;
	}

	public String getNombre() {
		return nombre;
	}
	
	private boolean validateNif(String nif) {
		final String FORMAT="\\d{8}\\w{1}";
		return Pattern.matches(FORMAT, nif);
	}
	
	private String nifValidated(String nif) {
		final String MESSAGE="Nif incorrecto";
		if(!validateNif(nif)) throw new RuntimeException(MESSAGE);
		return nif;
	}

	@Override
	public String toString() {
		return String.format("Empleado con nif: %s \n %s. \nSueldo: %.2f €",getNif(), getNombre(), getSueldo());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nif == null) ? 0 : nif.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (nif == null) {
			if (other.nif != null)
				return false;
		} else if (!nif.equals(other.nif))
			return false;
		return true;
	}
	
	
	
}
