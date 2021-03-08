package Unidad3.Ejercicio4;

import java.awt.Color;
import java.awt.Font;
import java.beans.EventHandler;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.prefs.Preferences;

import javax.swing.text.DateFormatter;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Paint;

public class FXMLController implements Initializable {
	
	private static final String CLOSE_STRING="La ultima vez que se cerro fue en: ";
	private static final String PATH_PREFERENCES=System.getProperty("user.home") + "/preferences.properties";
	private static final Map<String, String> DEFAULTS = Map.of("color","RED","font","Arial","closeTime",CLOSE_STRING+"N/A");
	private static Properties preferences;
	private static Preferences pref;
    
    @FXML
    private Label lblOut,formattedText;
    
    @FXML
    private void btnClickAction(ActionEvent event) {
    	String closeTime=LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss")).toString();
    	preferences.setProperty("closeTime", CLOSE_STRING+closeTime);
    	writeSettings(preferences, PATH_PREFERENCES);
        System.exit(0);
    }
    
    @FXML
    private void onChangeTextColor(ActionEvent e) {
    	MenuItem menu=(MenuItem) e.getSource();
    	String color=menu.getId();
    	preferences.setProperty("color", color);
    	writeSettings(preferences,PATH_PREFERENCES);
    	formattedText.setTextFill(Paint.valueOf(color));
    }
    
    @FXML
    private void onChangeTextFont(ActionEvent e) {
    	MenuItem menu=(MenuItem) e.getSource();
    	String font=menu.getId();
    	preferences.setProperty("font", font);
    	writeSettings(preferences,PATH_PREFERENCES);
    	formattedText.setFont(javafx.scene.text.Font.font(font));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    	preferences=readSettings(PATH_PREFERENCES, DEFAULTS);
    	lblOut.setText(preferences.getProperty("closeTime"));
		formattedText.setTextFill(Paint.valueOf(preferences.getProperty("color")));
		formattedText.setFont(javafx.scene.text.Font.font(preferences.getProperty("font")));
    }
    
    private void writeSettings(Properties properties, String path) {
    	try {
			properties.store(new FileWriter(path), null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    private Properties readSettings(String path, Map<String,String> defaults) {
    	Properties p = new Properties();
    	try {
    		p.load(new FileInputStream(path));
    	}catch(IOException e) {
    		p.putAll(defaults);
    	}
    	return p;
    }
}
