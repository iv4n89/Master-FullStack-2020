package group1.artifact1;
/*
Put header here


 */

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class FXMLController implements Initializable {
	
	Acumulador acumulador=new Acumulador();
    
    @FXML
    private Label lblOut;
    
    @FXML
    private TextField text1,text2,text3;
    
    @FXML 
    private Label label1,label2,label3;
    
    @FXML
    private Button valFecha,valCorr,valDir;
    
    @FXML
    private void btnClickAction(ActionEvent event) {
        lblOut.setText("Hello World!");
    }
    
    @FXML
    private void validarFecha() {
    	String date=text1.getText();
    	final String regexDate1="(\\d{1,2})/(\\d{1,2})/(\\d{4})";
    	final String regexDate2="(\\d{4})-(\\d{1,2})-(\\d{1,2})";
    	final String regexDate3="(\\d{1,2}) de (enero|febrero|marzo|abril|marzo|abril|mayo|junio|julio|agosto|septiembre|octubre|noviembre|diciembre) de (\\d{4})";
    	String regex=String.format("(%s)|(%s)|(%s)",regexDate1,regexDate2,regexDate3);
    	if(date.matches(regex)) {
    		label1.setText("Es válida la fecha");
    	}else label1.setText("No es válida la fecha");
    }
    
    @FXML
    private void validarCorreo() {
    	String correo=text1.getText();
    	final String regex=".+@.+";
    	Pattern pattern=Pattern.compile(regex);
    	Matcher matcher=pattern.matcher(correo);
    	if(matcher.matches()) {
    		label1.setText("El correo es correcto");
    	}else {
    		label1.setText("El correo es incorrecto");
    	}
    }
    
    @FXML
    private void validarDir() {
    	String dir=text1.getText().trim();
    	final String REGEX="([^,]+),\\s+Nº\\s+(\\d+),\\s+([^,]+),\\s+\\((\\d{5})\\)\\s+([^,]+)";
    	Pattern pattern=Pattern.compile(REGEX);
    	Matcher matcher=pattern.matcher(dir);
    	if(matcher.matches()) {
    		label1.setText("La direccion es correcta");
    	}else {
    		label1.setText("NO es un direccion correcta");
    	}
    }
    
    @FXML
    private void switchToLabelFecha() {
    	label1.setText(valFecha.getText());
    }
    
    @FXML
    private void switchToLabelCorr() {
    	label1.setText(valCorr.getText());
    }
    
    @FXML
    private void switchToLabelDir() {
    	label1.setText(valDir.getText());
    }
    
    @FXML
    private void labelNeutral() {
    	final String TEXT="Selecciona un boton";
    	label1.setText(TEXT);
    }
    
    @FXML
    private void sustituirPuntos() {
    	String number=text2.getText();
    	number=number.replaceAll("\\.", ",");
    	text2.setText(number);
    }
    
    @FXML
    private void acumulador() {
    	var number=text3.getText();
    	if(number.matches("[-]*\\d+")) {
    		acumulador.add(Integer.parseInt(number));
    	}else {
    		acumulador.add(number);
    	}
    	
    	label3.setText(acumulador.getValue().toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
