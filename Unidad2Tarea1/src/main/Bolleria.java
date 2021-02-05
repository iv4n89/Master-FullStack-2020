package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bolleria extends Consumible {
	private boolean fresca;
	
	{
		setFecha(String.valueOf(LocalDate.now().plusDays(1)));
	}
	
	/***
	 * 
	 */
	public Bolleria() {super();}
	
	/***
	 * Introducir nombre de la bolleria, descripcion de la bolleria, proveedor y (opcional) si es fresca. La fecha de caducidad será un día después de la fecha de introduccion del producto.
	 * @param nombre
	 * @param descripcion
	 * @param proveedor
	 * @param fresca
	 */
	public Bolleria(String nombre, String descripcion, String proveedor, String...fresca) {
		super();
		setNombre(nombre);
		setDescripcion(descripcion);
		setProveedor(proveedor);
		if(fresca.length>0) setFresca(fresca[0]);
	}
	
	public void setFresca(String fresca) {
		this.fresca=(fresca.toUpperCase().equals("FRESCA"))?true:false;
	}
	
	public boolean getFresca() {
		return this.fresca;
	}
	
	@Override
	public String toString() {
		String fresca=(this.fresca)?"[Es fresca!]":"";
		return "["+this.getNombre()+
				"]\nFecha de caducidad: ["+this.getFecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+
				"]\n"+fresca+"\n";
	}
	
}
