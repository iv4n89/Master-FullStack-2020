package cuestion1;

public interface Expresion {
    public Double getValor();
    default public String getEcuacion(){
        return " = "+ this.getValor();
    }
}
