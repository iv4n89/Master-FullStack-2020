package com.cloudftic.fxapp1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SecondaryController {

	@FXML
	private TextField text1;
	@FXML
	private TextField text2;
	@FXML
	private Label resultado1;
	
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void hacerAlgo() {
    	//Validamos un nif.
    	String nif=text1.getText();
    	//boolean isNif=nif.matches("\\d{8}[ABD-HJ-KM-PR-TX-Zabd-hj-km-pr-tx-z]+");
    	boolean isNif=nif.matches(".+@.+");
    	resultado1.setText(isNif?"OK":"No vale");
    }
    
    /*
     *  Método de inialización de la vista (necesario porque la
     *  inyección de @FMXL se produce despues de ejecutarse el
     *   constructor).
    */
    @FXML
    public void initialize() {
        resultado1.setText("<sin resultados>");
    }
}