package cuestion1;

public class Numero implements Expresion {
	Double numero;
	
	public Numero(Double n) {
		this.numero=n;
	}
	
	public Double getNumero() {
		return this.numero;
	}

	@Override
	public Double getValor() {
		return this.getNumero();
	}
}
