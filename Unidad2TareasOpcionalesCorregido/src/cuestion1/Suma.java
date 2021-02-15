package cuestion1;

public class Suma extends ExpresionBinaria{
    public final static String OPERACION="(%s + %s)";

    public Suma(Expresion operando1, Expresion operando2) {
        super(operando1,operando2,OPERACION, (a,b)->a.getValor()+b.getValor());
    }
}
