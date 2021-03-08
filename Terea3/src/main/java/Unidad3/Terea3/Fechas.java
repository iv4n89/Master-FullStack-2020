package Unidad3.Terea3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.beans.property.SimpleFloatProperty;

public class Fechas extends UtilidadesFechas {

	public Fechas(String formato) {
		super(formato);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String convertirDateAString(Date date) {
		DateFormat dateFormat=new SimpleDateFormat(this.getFormato());
		return dateFormat.format(date);
	}

	@Override
	public Date convertirStringADate(String fecha) {
		DateFormat dateFormat=new SimpleDateFormat(this.getFormato());
		Date aux;
		try {
			aux= dateFormat.parse(fecha);
		} catch (ParseException e) {
			aux=new Date();
			e.printStackTrace();
		}
		return aux;
	}

	@Override
	public boolean validarFormatoFecha(String fecha) {
		Pattern pattern=Pattern.compile(this.getFormato());
		Matcher matcher=pattern.matcher(fecha);
		return matcher.matches();
	}

	@Override
	public String tiempoEntre2Fechas(Date fecha1, Date fecha2) {
		LocalDate f1=fecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate f2=fecha2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Period between=java.time.Period.between(f1, f2);
		String out=""+(between.getYears()<0?-1*between.getYears():between.getYears())+" años, "+(between.getMonths()<0?-1*between.getMonths():between.getMonths())+" meses, "+(between.getDays()<0?-1*between.getDays():between.getDays())+" dias";
		return out;
	}

}
