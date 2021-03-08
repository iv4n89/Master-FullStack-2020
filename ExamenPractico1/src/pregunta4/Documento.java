package pregunta4;

import java.util.ArrayList;

public class Documento {
	private final ArrayList<Parrafo> parrafos;
	private String titulo;
	private Tipo tipo;
	
	public Documento() {
		parrafos=new ArrayList<>();
		parrafos.add(new Parrafo(0,null));
	}
	
	public Documento(String titulo) {
		this();
		this.titulo=titulo;
	}
	
	public Documento(Tipo tipo) {
		this();
		this.tipo=tipo;
	}
	
	public Documento(String titulo, Tipo tipo) {
		this();
		this.tipo=tipo;
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
	
	public void setTipo(Tipo tipo) {
		this.tipo=tipo;
	}
	
	public Tipo getTipo() {
		return this.tipo;
	}
	
	public String getTipoMay() {
		return formatTipoName(this.tipo);
	}
	
	private String formatTipoName(Tipo tipo) {
		return tipo.name().toUpperCase();
	}
	
	private String getAllParrafosText() {
		String aux="";
		for(int i=1;i<parrafos.size();i++) {
			aux+=parrafos.get(i).toString()+"\n";
		}
		return aux;
	}
	
	@Override
	public String toString() {
		//return "Título: "+getTitulo()+"\nTipo: "+getTipoMay()+"\n"+getAllParrafosText();
		return String.format("Titulo: %s \nTipo: %s \n%s", getTitulo(),getTipoMay(),getAllParrafosText());
	}
	
}
