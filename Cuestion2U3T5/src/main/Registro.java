package main;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class Registro {
	private final String MOV_FORMAT="\n    %s # %s # %s ";
	private final String DATE_FORMAT="dd/MM/yyyy";
	private Locale region;
	private double cantidadAcumulada;
	private List<Movimiento> movimientos=new ArrayList<>();
	private ResourceBundle bundle;
	
	public Registro() {
		this.region=new Locale("es","ES");
		this.cantidadAcumulada=0.0;
		bundle=PropertyResourceBundle.getBundle("resources/base_es");
	}

	public void ingresar(double cantidad) {
		cantidad=getNumeroPositivo(cantidad);
		cantidadAcumulada+=cantidad;
		movimientos.add(Movimiento.newIngreso(cantidad));
	}
	
	public void gastar(double cantidad) {
		cantidad=getNumeroPositivo(cantidad);
		cantidadAcumulada-=cantidad;
		movimientos.add(Movimiento.newGasto(cantidad));
	}
	
	public void seleccionarRegion(Locale region) {
		this.region=region;
		switch(region.toLanguageTag()) {
		case "es-ES":
			bundle=PropertyResourceBundle.getBundle("resources/base_es");
			break;
		case "en-EN":
			bundle=PropertyResourceBundle.getBundle("resources/base_en");
			break;
		case "en-US":
			bundle=PropertyResourceBundle.getBundle("resources/base_us");
			break;
		default:
			bundle=PropertyResourceBundle.getBundle("resurces/base_es");
			break;
		}
	}
	
	private double getNumeroPositivo(double cantidad) {
		return cantidad<0?cantidad*-1:cantidad;
	}
	
	private String getListaMovimientos() {
		String aux="";
		for(Movimiento m:movimientos) {
			aux+=formatMovimiento(m);
		}
		return aux;
	}
	
	private String formatMovimiento(Movimiento m) {
		return String.format(region,MOV_FORMAT,formatTimeMovimiento(m.getFecha()),formatTipoMovimiento(m),formatCantidad(m.getCantidad()));
	}
	
	private String formatTimeMovimiento(LocalDate fecha) {
		DateTimeFormatter format=DateTimeFormatter.ofPattern(DATE_FORMAT);
		return fecha.format(format);
	}
	
	private String formatTipoMovimiento(Movimiento m) {
		return bundle.getString(m.getTipo().name());
	}
	
	private String formatCantidad(double cantidad) {
		return DecimalFormat.getCurrencyInstance(region).format(cantidad);		
	}

	@Override
	public String toString() {
		return bundle.getString("header")+"\n"+
				bundle.getString("list")+
				getListaMovimientos()+"\n"+
				bundle.getString("total")+formatCantidad(cantidadAcumulada);
	}
	
	
	
}
