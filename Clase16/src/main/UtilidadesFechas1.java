package main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

import javax.management.RuntimeErrorException;

class UtilidadesFechas1 extends UtilidadesFechas{

	public UtilidadesFechas1(String formato) {
		super(formato);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Date convertirStringADate(String fecha) {
		DateFormat df=new SimpleDateFormat(super.getFormato());
		try {
			return df.parse(fecha);
		} catch (ParseException e) {
			throw new RuntimeErrorException(null);
		}
	}

	@Override
	public boolean validarFormatoFecha(String fecha) {
		try {
			convertirStringADate( fecha);
			return true;
		}catch(RuntimeErrorException ex) {
			return false;
		}
	}

	@Override
	public String tiempoEntre2Fechas(Date fecha1, Date fecha2) {
		Duration timeBetween=Duration.between(LocalDate.ofInstant(fecha1.toInstant(),java.time.ZoneId.systemDefault()), LocalDate.ofInstant(fecha2.toInstant(),java.time.ZoneId.systemDefault()));
		return timeBetween.toString();
	}
	
}
