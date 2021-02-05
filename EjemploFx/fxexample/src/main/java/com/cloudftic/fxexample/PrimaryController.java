package com.cloudftic.fxexample;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.ResourceBundle;

import com.cloudftic.fxexample.data.RepositorioVentasFx;
import com.cloudftic.fxexample.data.VentaFx;

import javafx.beans.binding.DoubleExpression;
import javafx.beans.binding.ObjectExpression;
import javafx.beans.binding.StringExpression;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

	private VentaFx venta = VentaFx.instance();
	private RepositorioVentasFx repo = RepositorioVentasFx.instance();

	@FXML
	private Label codigoId;
	@FXML
	private Spinner<Double> costeId;
	@FXML
	private TextArea descripcionId;
	@FXML
	private ListView<VentaFx> ventasId;

	@FXML
	private void switchToSecondary() throws IOException {
		App.setRoot("secondary");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ventasId.setCellFactory(lst -> new ClienteListCell());		
		ventasId.setItems(repo.getVentas());
		
		ventasId.getSelectionModel().selectedItemProperty().addListener(
				(obs, previous, next) -> {					
					if (previous !=null) {
						descripcionId.textProperty().unbindBidirectional(previous.descripcionProperty());
						costeId.getValueFactory().valueProperty().unbindBidirectional(previous.costeProperty());
					}
					if (next != null) {
						codigoId.setText(String.valueOf(next.getCodigo()));
						descripcionId.textProperty().bindBidirectional(next.descripcionProperty());
						costeId.getValueFactory().valueProperty().bindBidirectional(next.costeProperty());
					}
				}
				);
	}

	// Clase para personalizar los items del ListView
	private class ClienteListCell extends ListCell<VentaFx> {
		@Override
		protected void updateItem(VentaFx item, boolean empty) {
			super.updateItem(item, empty);
			if (item != null)
				this.textProperty().bind(item.codigoProperty().asString());
		}
	}

}
