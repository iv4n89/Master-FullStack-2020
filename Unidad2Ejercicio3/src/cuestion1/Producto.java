package cuestion1;

public class Producto implements Expresion {
	Numero n1, n2;

	public Producto(Numero n1, Numero n2) {
		setNumeros(n1, n2);
	}

	public void setNumeros(Numero n1, Numero n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	@Override
	public String toString() {
		return n1.getValor() + " * " + n2.getValor();
	}

	@Override
	public Double getValor() {
		return n1.getValor() * n2.getValor();
	}
}
