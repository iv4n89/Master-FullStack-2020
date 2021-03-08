package com.cloudftic.fxapp1;

import java.io.IOException;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {

	@FXML
	Label primaryLabel;
	@FXML
	Button primaryButton;
	
	@FXML
	public void initialize() {
		cambiarIdioma(Locale.getDefault());
	}
	
	private void cambiarIdioma(Locale idioma) {
		ResourceBundle buscador=PropertyResourceBundle.getBundle("com.cloudftic.mensajes.base", idioma);
		
		primaryLabel.setText(buscador.getString("key1"));
		primaryButton.setText(buscador.getString("key2"));
	}
	
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void idiomaES() {
    	cambiarIdioma(new Locale("es","ES"));
    }
    
    @FXML
    private void idiomaEN() {
    	cambiarIdioma(Locale.ENGLISH);
    }
}
