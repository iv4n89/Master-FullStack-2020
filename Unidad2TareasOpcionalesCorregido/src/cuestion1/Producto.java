package cuestion1;

public class Producto extends ExpresionBinaria{
    public final static String OPERACION="(%s * %s)";

    public Producto(Expresion operando1, Expresion operando2) {
        super(operando1,operando2,OPERACION, (a,b)->a.getValor()*b.getValor());
    }
}
