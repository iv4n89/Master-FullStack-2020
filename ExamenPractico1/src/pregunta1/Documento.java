package pregunta1;

import java.util.ArrayList;

public class Documento {
	private ArrayList<String> parrafos;
	private String titulo;
	
	public Documento() {
		parrafos=new ArrayList<>();
	}
	
	public Documento(String titulo) {
		this();
		this.titulo=titulo;
	}
	
	public int getNumeroParrafos() {
		return parrafos.size();
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
}
