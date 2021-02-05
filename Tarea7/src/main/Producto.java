package main;

import java.util.Random;

//CORREGIR

public class Producto {
	public static final String NOMBRE_POR_DEFECTO="-- SIN NOMBRE --";
	private final String codigo;
	private String nombre;
	private String descripcion;
	
	{
		Random r=new Random();
		char c=(char)((r.nextInt(26)+'A'));
		int n=r.nextInt(1000-100+1)+100;
		codigo=""+c+n;
	}
	
	/***
	 * 
	 * @param nombre del producto
	 * @param descripcion del producto
	 */	
	public Producto(String nombre ,String descripcion) {
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public Producto(String descripcion) {
		setNombre(NOMBRE_POR_DEFECTO);
		setDescripcion(descripcion);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "El producto "+getNombre()+" con codigo "+getCodigo()+" cuya descripcion es: "+getDescripcion();
	}
	
	@Override
	public boolean equals(Object o) {
		Producto otro=(Producto) o;
		return codigo==otro.codigo
				&&nombre==otro.nombre;
	}
	
}
