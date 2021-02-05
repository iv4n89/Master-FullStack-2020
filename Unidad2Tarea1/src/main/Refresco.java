package main;

import java.time.format.DateTimeFormatter;

enum Tipo {
	LATA(33), BOTELLA(50), BRICK(100), NO_VALIDO(0);

	private int volumen;

	Tipo(int volumen) {
		this.volumen = volumen;
	}

	int getVolumen() {
		return this.volumen;
	}
}

public class Refresco extends Consumible {
	private Tipo tipo;
	private int volumen;
	private boolean nevera;
	
	/***
	 * 
	 */
	public Refresco() {super();}

	/***
	 * Introducir nombre del refresco, descripcion del refresco, proveedor, fecha de caducidad con formato YYYY-MM-DD, tipo (lata, botella o brick) y (opcional) si se tiene que guardar en nevera.
	 * @param nombre
	 * @param descripcion
	 * @param proveedor
	 * @param fecha
	 * @param tipo
	 * @param nevera
	 */
	public Refresco(String nombre, String descripcion, String proveedor, String fecha, String tipo, String...nevera) {
		super(nombre, descripcion, proveedor, fecha);
		setTipo(tipo);
		this.volumen=this.tipo.getVolumen();
		if(nevera.length>0) setNevera(nevera[0]);
	}
	
	public void setTipo(String tipo) {
		try {
			this.tipo=Tipo.valueOf(tipo.toUpperCase());
		}catch(IllegalArgumentException ex) {
			System.out.print("No es un tipo valido");
			this.tipo=Tipo.NO_VALIDO;
		}
	}

	public String getTipo() {
		return this.tipo.name();
	}
	
	public void setVolumen(int volumen) {
		this.volumen=volumen;
	}

	public int getVolumen() {
		return this.volumen;
	}

	public boolean getNevera() {
		return nevera;
	}
	
	public void setNevera(String nevera) {
		if(nevera.toUpperCase().equals("SI")) this.nevera=true;
		else this.nevera=false;
	}

	@Override
	public String toString() {
		String n = (getNevera() ? "[Guardar en nevera!]" : "");
		return "[" + this.getNombre() + "]\nFecha de caducidad: ["
				+ this.getFecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "]\nTipo de envase: ["
				+ this.tipo.name() + "]\nVolumen: [" + this.volumen + "cl]\n" + n+"\n";
	}

}
