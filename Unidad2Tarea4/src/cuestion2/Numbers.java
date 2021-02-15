package cuestion2;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Numbers {
	@FunctionalInterface
    public interface INumeroDeArray {
        double obtenerNumero(double[] numeros);
    }

    public static void main (String[] args){
        double[] numbers= {1.2,22.4,65.5,43.8,110.4,4.7};

        double maxNumber= getMaxNumber(numbers);
        System.out.println(maxNumber);

        double minNumber= getMinNumber(numbers);
        System.out.println(minNumber);

        double mean=getMeanOfNumbers(numbers);
        System.out.println(mean);
    }

    private static double getNumber(double[] numbers, INumeroDeArray getNumber){
        return getNumber.obtenerNumero(numbers);
    }

    private static double getMaxNumber(double[] numbers){
        /*return getNumber(numbers, (a-> {
            double b=a[0];
            for (double v : a) {
                b = Double.max(v, b);
            }
            return b;
        }));*/
    	return getNumber(numbers, a->DoubleStream.of(a).max().getAsDouble());
    }

    private static double getMinNumber(double[] numbers){
       /* return getNumber(numbers, (a-> {
            double b=a[0];
            for(double v:a){
                b=Double.min(v,b);
            }
            return b;
        }));*/
    	return getNumber(numbers, a->DoubleStream.of(a).min().getAsDouble());
    }

    private static double getMeanOfNumbers(double[] numbers){
        /*return getNumber(numbers, (a->{
            double b=0;
            for(double v:a){
                b+=v;
            }
            return b/a.length;
        }));*/
    	return getNumber(numbers, a->DoubleStream.of(a).sum()/a.length);
    }
}
