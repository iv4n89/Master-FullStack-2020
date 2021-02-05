package main;

import java.util.Random;

public class Producto {
	static final String NOMBRE_POR_DEFECTO="--SIN NOMBRE--";
	final String codigo;
	String nombre;
	String descripcion;
	
	{
		Random r=new Random();
		char c=(char)((r.nextInt(26)+'A'));
		int n=r.nextInt(1000-100+1)+100;
		codigo=""+c+n;
	}
	
	public Producto() {
		this (NOMBRE_POR_DEFECTO,"");
	}
	
	public Producto(String nombre, String descripcion) {
		super();
		setNombre(nombre);
		setDescripcion(descripcion);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre==null||nombre.length()==0)	 this.nombre=Producto.NOMBRE_POR_DEFECTO;
		else this.nombre = nombre;
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
		return "Producto "+getCodigo()+": "+getNombre()+", "+getDescripcion();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Producto other = (Producto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
		

}
