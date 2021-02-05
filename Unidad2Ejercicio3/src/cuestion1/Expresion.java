package cuestion1;

public interface Expresion{

	public Double getValor();
	
	public default String getEcuacion() {
		return toString()+" = "+getValor();
	}
}
