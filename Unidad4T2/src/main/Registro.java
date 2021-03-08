package main;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Registro {
	private List<String> registros = new ArrayList<>();
	private List<String> noValidos=new ArrayList<>();
	private final String FORMAT = "\\d{2}\\s\\p{Upper}\\p{Lower}+\\s\\p{Lower}+";

	public void add(String registro) {
		// Hay que comprobar que es un registro valido antes de añadir
		if(isValidRegistro(registro)) {
			registros.add(registro);
		} else {
			noValidos.add(registro);
		}
			
	}

	private boolean isValidRegistro(String registro) {
		if(!Pattern.matches(FORMAT, registro)) {
			return false;
		}
		return true;
	}

	public String[] getRegistros() throws Fallos {
		//return this.registros.toArray(String[]::new);
		if(!noValidos.isEmpty()) throw new Fallos(registros, noValidos);
		return this.registros.toArray(String[]::new);
	}

	public void vaciar() {
		registros.clear();
	}
}
