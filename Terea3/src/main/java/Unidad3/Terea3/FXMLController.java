package Unidad3.Terea3;
/*
Put header here


 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class FXMLController implements Initializable {
	
    private static final String RUTACONFIG =System.getProperty("user.home")+"/app.config";
    @FXML
    private Label lblOut,labelOut1,labelOut2,labelOut3,labelOut4,labelSundays;
    @FXML
    private TextField textDate1,textDate2,textDate3,textFormat,textYear,textMonth;
    @FXML
    private VBox vbox;
    @FXML
    private ColorPicker pickerColor;
    
    @FXML
    private void btnClickAction(ActionEvent event) {
        lblOut.setText("Hello World!");
    }
    
    @FXML
    private void stringToDate() {
    	String format=textFormat.getText();
    	Fechas fechas=new Fechas(format);
    	Date dateAux=fechas.convertirStringADate(textDate1.getText());
    	labelOut1.setText(dateAux.toString());
    	labelOut2.setText(fechas.convertirDateAString(dateAux));
    	
    }
    
    @FXML
    private void timeBetween() {
    	Fechas fecha=new Fechas("dd/MM/yyyy");
    	Date fecha1=fecha.convertirStringADate(textDate2.getText());
    	Date fecha2=fecha.convertirStringADate(textDate3.getText());
    	labelOut4.setText(fecha.tiempoEntre2Fechas(fecha1, fecha2));
    }
    
    @FXML
    private void getSundays() {
    	int years=Integer.valueOf(textYear.getText());
    	int months=Integer.valueOf(textMonth.getText());
    	int days=java.time.Month.of(months).maxLength();
    	int sundays=0;
    	int i=1;
    	LocalDate d1=LocalDate.of(years, months, 1);
    	while(i<days) {
    		if(d1.getDayOfWeek()==java.time.DayOfWeek.SUNDAY) {
    			sundays++;
    		}
    		i++;
    		d1=d1.plusDays(1);
    	}
    	labelSundays.setText("El mes de "+d1.format(DateTimeFormatter.ofPattern("MMMM", Locale.getDefault()))+" del año "+d1.getYear()+" tiene "+sundays+" domingos");
    }
    
    @FXML
    private void cambiarColor() throws IOException {
    	labelOut1.setText(pickerColor.getValue().toString());
    	Properties settings=new Properties();
    	Color color=pickerColor.getValue();
    	String formatoColor=String.format("#%x%x%x%x",(int)color.getRed()*255,(int)color.getGreen()*255,(int)color.getBlue()*255,(int)color.getOpacity()*255);
    	settings.put("color", pickerColor.getValue().toString());
    	//settings.store(new FileWriter(RUTACONFIG), null);
    	settings.storeToXML(new FileOutputStream(RUTACONFIG),null);
    	vbox.setStyle("-fx-background-color: "+color);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	vbox.setStyle("-fx-background-color: "+Color.WHITE);
        // TODO
    }    
    
    private void readSettings() {
    	Properties settings=new Properties();
    	try {
			settings.loadFromXML(new FileInputStream(RUTACONFIG));
			String color=settings.getProperty("color");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
