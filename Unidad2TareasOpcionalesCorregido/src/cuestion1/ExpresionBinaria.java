package cuestion1;

import java.util.function.BiFunction;

public abstract class ExpresionBinaria implements Expresion{
    public interface ICalculo{
        Double ejecutar(Expresion a, Expresion b);
    }
    protected Expresion operando1,operando2;
    private String operacion;
    private BiFunction<Expresion,Expresion,Double> calculo;

    public ExpresionBinaria(Expresion operando1, Expresion operando2, String operacion, BiFunction<Expresion,Expresion,Double> calculo) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.operacion = operacion;
        this.calculo=calculo;
    }

    @Override
    public String toString() {
        return operacion.formatted(operando1,operando2)+getEcuacion();
                //"("+operando1+" "+operacion+" "+operando2+")"+getEcuacion();
    }

    @Override
    public Double getValor() {
        return this.calculo.apply(operando1,operando2);
    }
}
