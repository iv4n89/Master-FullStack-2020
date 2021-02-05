package cuestion1;

public class Producto implements Expresion{
    private final Numero n1;
    private final Numero n2;

    public Producto(Double n1, Double n2) {
        this.n1 = new Numero(n1);
        this.n2 = new Numero(n2);
    }

    public Numero getN1() {
        return n1;
    }

    public Numero getN2() {
        return n2;
    }

    @Override
    public Double getValor() {
        return this.getN1().getNumero()*this.getN2().getNumero();
    }

    @Override
    public String getEcuacion() {
        return ""+this.getN1().getNumero()+" * "+this.getN2().getNumero()+" = "+this.getValor();
    }

    @Override
    public String toString() {
        return this.getEcuacion();
    }
}
