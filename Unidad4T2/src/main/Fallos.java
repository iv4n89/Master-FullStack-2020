package main;

import java.util.List;

public class Fallos extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6793187940533808876L;
	
	private List<String> validos;
	private List<String> noValidos;
	
	public Fallos(List<String> validos, List<String> noValidos) {
		this.validos=validos;
		this.noValidos=noValidos;
	}

	public List<String> getValidos() {
		// TODO Auto-generated method stub
		return this.validos;
	}

	public List<String> getNoValidos() {
		// TODO Auto-generated method stub
		return this.noValidos;
	}
	
}
