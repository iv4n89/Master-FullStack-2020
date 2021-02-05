package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Consumible {
	private String nombre;
	private String descripcion;
	private String proveedor;
	private LocalDate fecha;
	
	/***
	 * 
	 */
	public Consumible() {
		
	}

	/***
	 * Introducir nombre del consumible, descripcion del consumible, proveedor y fecha de caducidad con formato YYYY-MM-DD
	 * @param nombre
	 * @param descripcion
	 * @param proveedor
	 * @param fecha
	 */
	public Consumible(String nombre, String descripcion, String proveedor, String fecha) {
		setNombre(nombre);
		setDescripcion(descripcion);
		setProveedor(proveedor);
		setFecha(fecha);
	}
	
	/***
	 * 
	 * @param nombre
	 * @param descripcion
	 * @param proveedor
	 * @param fecha
	 */
	public Consumible(String nombre, String descripcion, String proveedor, LocalDate fecha) {
		this.nombre=nombre;
		setDescripcion(descripcion);
		setProveedor(proveedor);
		this.fecha=fecha;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setFecha(String fecha) {
		final String FECHA_DEFECTO="1970-01-01";
		if(validarFecha(LocalDate.parse(fecha))) this.fecha=LocalDate.parse(fecha);
		else this.fecha=LocalDate.parse(FECHA_DEFECTO);
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	private boolean validarFecha(LocalDate fecha) {
		return (fecha.compareTo(LocalDate.now())<0)?false:true;
	}
	
	@Override
	public String toString() {
		return "["+nombre+"]\nFecha de caducidad: ["+fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+"]\n";
	}
	
}
