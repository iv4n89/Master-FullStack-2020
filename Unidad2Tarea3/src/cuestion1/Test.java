package cuestion1;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args){
        Expresion suma1=ExpresionManager.createExpresion(ExpresionManager.Expresiones.Suma,10.0,15.0);
        Expresion resta1=ExpresionManager.createExpresion(ExpresionManager.Expresiones.Resta,100.1,50.1);
        Expresion producto1=ExpresionManager.createExpresion(ExpresionManager.Expresiones.Producto,2.5,2.5);
        Expresion division1=ExpresionManager.createExpresion(ExpresionManager.Expresiones.Division,10.0,2.0);

        List<Expresion> expresions=Arrays.asList(suma1, resta1, producto1, division1);

        for(Expresion ex:expresions){
            System.out.println(""+ex.getClass()+": "+ex);
        }

    }
}
