package main;

public class Cliente {
	public static final int LONGITUD_MAX_NOMBRE=10;
	private static final String MENSAJE_ERROR="Numero de identificacion no valido";
	private final int codigo;//int
	private String nombre;
	private int identificacion;
	
	public Cliente() {
		codigo=(int)(Math.random()*System.currentTimeMillis());
	}
	
	public Cliente(String nombre) {
		codigo=(int)(Math.random()*System.currentTimeMillis());
		setNombre(nombre);
	}
	
	public Cliente(String nombre, int identificacion) {
		codigo=(int)(Math.random()*System.currentTimeMillis());
		setNombre(nombre);
		setIdentificacion(identificacion);
	}

	public String getNombre() {
		return nombre.toUpperCase();
	}

	public void setNombre(String nombre) {
		if(nombre.length()>LONGITUD_MAX_NOMBRE) this.nombre=nombre.substring(0,LONGITUD_MAX_NOMBRE);
		else this.nombre = nombre;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		if(identificacion<1000||identificacion>9999) {
			throw new RuntimeException(MENSAJE_ERROR);
		}else this.identificacion=identificacion;
	}

	public double getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Cliente "+getNombre()+", identificacion "+getIdentificacion();
	}
	
	@Override
	public boolean equals(Object o) {
		Cliente otro=(Cliente) o;
		return codigo==otro.codigo
				&&nombre==otro.nombre
				&&identificacion==otro.identificacion;
	}
		
}
