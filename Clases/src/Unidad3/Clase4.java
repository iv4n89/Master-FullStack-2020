package Unidad3;

import java.util.Enumeration;
import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class Clase4 {
	
	

}

//Se tiene que crear una clase R1 que herede de ResourceBundle
class R1 extends ResourceBundle{

	@Override
	protected Object handleGetObject(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration<String> getKeys() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

//Y clases extra para cada idioma
class R1_es extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		
		return new Object[][] {{"k1","valor"},{"k2","valor"}}; 
	}
	
}
