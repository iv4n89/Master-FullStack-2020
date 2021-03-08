package pregunta2;

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
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public int getNumeroParrafos() {
		return parrafos.size();
	}
	
	private boolean isEmptyParrafo(int index) {
		return this.parrafos.get(index)==null;
	}
	
	private boolean isIndexWithinBounds(int index) {
		if(index<1) return false;
		if(index>getNumeroParrafos()) return false;
		return true;
	}
	
	public boolean setParrafo(int index, String parrafo) {
		if(this.isIndexWithinBounds(index)) {
			this.parrafos.add(parrafo);
			return false;
		}
		this.parrafos.set(index, parrafo);
		return true;
	}
	
	public String getParrafo(int index) {
		return index>=1&&!isEmptyParrafo(index)
				?this.parrafos.get(index)
						:null;
	}
	
}
