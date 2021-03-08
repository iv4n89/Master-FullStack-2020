package com.cloudftic.fxapp1;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    	String text=text1.getText();
    	//boolean isNif=nif.matches("\\d{8}[ABD-HJ-KM-PR-TX-Zabd-hj-km-pr-tx-z]+");
    	//boolean isNif=nif.matches(".+@.+");
    	//resultado1.setText(isNif?"OK":"No vale");
    	Pattern patron=Pattern.compile("([^,]+),\\sNº\\s(\\d+),\\s([^,]+),\\s\\((\\d{5})\\)\\s(?<ciudad>[^,]+)");
    	Matcher matcher=patron.matcher(text);
    	boolean vale=matcher.matches();
    	if(vale) {
    		text2.setText(matcher.group(4)+" , "+matcher.group("ciudad"));
    	}else {
    		text2.setText("No vale");
    	}
    }
    @FXML
    private void validarFecha() {
    	String fecha=text1.getText().trim();
    	final String FRM1="((\\d{1,2})/(\\d{1,2})/(\\d{4}))";
    	final String FRM2="((\\d{4})-(\\d{1,2})-(\\d{1,2}))";
    	final String FRM3="(\\d{1,2})\\sde\\s(enero|febrero|marzo|abril|mayo|junio|julio|agosto|septiembre|octubre|noviembre|diciembre)\\sde\\s(\\d{4})";
    	String regex=String.format("(%s)|(%s)|(%s)",FRM1,FRM2,FRM3);
    	boolean vale=fecha.matches(regex);
    	text2.setText(vale?"ok":"no vale");
    }
    @FXML
    private void sustituir() {
    	String input=text1.getText();//Texto completo
    	String sust=text2.getText();//sustituir por '*'
    	//var nuevo= input.replaceAll(sust,"*");
    	//text1.setText(nuevo);
    	Pattern patron=Pattern.compile(sust);
    	Matcher matcher=patron.matcher(input);
    	StringBuilder bufer=new StringBuilder();
    	while(matcher.find()) {
    		matcher.appendReplacement(bufer, "*".repeat(matcher.end()-matcher.start()));
    	}
    	matcher.appendTail(bufer);
    	text1.setText(bufer.toString());
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