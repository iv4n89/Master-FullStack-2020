package cuestion2;

public class Memorando {
	
	public interface IProcesa{
		boolean valida(String art);
	}
	
	private String titulo;
	private int numeroArticulos;
	//private Articulo articulo;
	
	public Memorando(int nArticulos) {
		this.numeroArticulos=nArticulos;
	}
	
	public Memorando(int nArticulos, String titulo) {
		this (nArticulos);
		this.setTitulo(titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroArticulos() {
		return numeroArticulos;
	}
	
	public String[] articulosQueCumplenCon(IProcesa validacion) {
		
	}
	
	
}
