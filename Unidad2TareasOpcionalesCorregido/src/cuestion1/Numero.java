package cuestion1;

public class Numero implements Expresion{
    private final Double value;

    public Numero(Double value) {
        this.value = value;
    }

    @Override
    public Double getValor() {
        return this.value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
