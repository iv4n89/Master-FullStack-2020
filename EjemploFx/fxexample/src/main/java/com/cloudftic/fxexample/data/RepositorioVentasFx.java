package com.cloudftic.fxexample.data;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class RepositorioVentasFx {
	public static RepositorioVentasFx instance() {
        return new RepositorioVentasFx();
    }
	
	// El almacén de ventas
	private static List<VentaFx> innerVentas = new ArrayList<>();
	public ListProperty<VentaFx> ventas;	

	public RepositorioVentasFx() {
		super();
		ObservableList<VentaFx> listw = FXCollections.observableList(innerVentas);
		ventas = new  SimpleListProperty<VentaFx>(this, "ventas", listw);
		ventas.add(new VentaFx(1, "venta 1", 100.9));
		ventas.add(new VentaFx(2, "venta 2", 200.9));
	}

	public final ListProperty<VentaFx> ventasProperty() {
		return this.ventas;
	}
	

	public final ObservableList<VentaFx> getVentas() {
		return this.ventasProperty().get();
	}

}
