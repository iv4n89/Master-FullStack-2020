package com.cloudftic.fxexample.data;

import javafx.beans.property.*;

public class VentaFx {
	public static VentaFx instance() {
        return new VentaFx(0, "", 0.0);
    }
	
	private IntegerProperty codigo = new SimpleIntegerProperty(this, "codigo", 0);
	private StringProperty descripcion = new SimpleStringProperty(this, "descripcion", "");
	private ObjectProperty<Double> coste = new SimpleObjectProperty<Double>(this, "coste", 0.0);
	
	public VentaFx() {
	}
	
	public VentaFx(int codigo, String descripcion, double coste) {
		super();
		this.codigo.set(codigo); 
		this.descripcion.set(descripcion);
		this.coste.set(coste);
	}

	public final IntegerProperty codigoProperty() {
		return this.codigo;
	}
	
	public final int getCodigo() {
		return this.codigo.get();
	}
	
	public final void setCodigo(final int codigo) {
		this.codigo.set(codigo);
	}
	
	public final StringProperty descripcionProperty() {
		return this.descripcion;
	}
	
	public final String getDescripcion() {
		return this.descripcion.get();
	}
	
	public final void setDescripcion(final String descripcion) {
		this.descripcion.set(descripcion);
	}
	
	public final  ObjectProperty<Double> costeProperty() {
		return this.coste;
	}
	
	public final double getCoste() {
		return this.coste.get();
	}
	
	public final void setCoste(final double coste) {
		this.coste.set(coste);
	}	
	
}
