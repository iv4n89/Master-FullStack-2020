package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class UtilidadesFechas {	
	private String formato;	
	public UtilidadesFechas(String formato) {
		this.formato = formato;
	}	
	public String getFormato() {
		return formato;
	}
	/**
	 * Convierte un objeto Date a una cadena de texto usando
	 * el formato indicado en el constructor	 * 
	 * @param date
	 * @return Cadena de texto con la fecha
	 */
	public String convertirDateAString(Date date) {
		DateFormat df=new SimpleDateFormat(formato);
		return df.format(date);
	}
	
	/**
	 * Convierte una cadena de texto con el formato indicado
	 * en el constructor a un objeto Date	 * 
	 * @param fecha Cadena de texto con la fecha formateada
	 * @return objeto Date
	 */
	public abstract Date convertirStringADate(String fecha);
	
	/**
	 * Valida si el formato de la fecha es el correcto.	 * 
	 * @param fecha Cadena de texto con la fecha formateada
	 * @return true si la fecha está correctamente formateada o false si no lo está
	 */
	public abstract boolean validarFormatoFecha(String fecha);	
	
	/**
	 * Calcula el tiempo transcurrido entre 2 fechas y lo retorna en una
	 * cadena de texto indicando años-meses-días transcurridos
	 * @param fecha1
	 * @param fecha2
	 * @return Cadena de texto con el tiempo transcurrido
	 */
	public abstract String tiempoEntre2Fechas(Date fecha1, Date fecha2); 
}