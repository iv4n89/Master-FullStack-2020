package pregunta3;

import java.util.ArrayList;

public class Documento {
	private final ArrayList<Parrafo> parrafos;
	private String titulo;
	
	public Documento() {
		parrafos=new ArrayList<>();
		parrafos.add(new Parrafo(0,null));
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
		return parrafos.size()-1;
	}
	
	private boolean isEmptyParrafo(int index) {
		return this.parrafos.get(index)==null;
	}
	
	private boolean isWithinBounds(int index) {
		if(index<1) return false;
		if(index >getNumeroParrafos()) return false;
		return true;
	}
	
	public boolean setParrafo(int index, String parrafo) {
		if(!isWithinBounds(index)) {
			index=getNumeroParrafos()+1;
			this.parrafos.add(new Parrafo(index,parrafo));
			return false;
		}
		this.parrafos.set(index, new Parrafo(index,parrafo));
		return true;
	}
	
	public void agregarParrafo(String texto) {
		this.parrafos.add(new Parrafo(getNumeroParrafos()+1, texto));
	}
	
	public String getParrafo(int index) {
		return isWithinBounds(index)&&!isEmptyParrafo(index)
				?this.parrafos.get(index).toString()
						:null;
	}
	
}
