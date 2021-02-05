package cuestion1;

import java.util.Locale;

public class ExpresionManager {
    public static enum Expresiones{
        Suma, Resta, Producto, Division
    }

    public static Expresion createExpresion(Expresiones expresion, Double n1, Double n2){
        Expresion ex = switch (expresion) {
            case Suma -> new Suma(n1, n2);
            case Resta -> new Resta(n1, n2);
            case Producto -> new Producto(n1, n2);
            case Division -> new Division(n1, n2);
            default -> null;
        };
        return ex;
    }
}
