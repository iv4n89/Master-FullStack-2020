package cuestion1;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma s1= new Suma(new Numero(1.2), new Numero(2.3));
		Resta r1= new Resta(new Numero(10.5), new Numero(2.3));
		Producto p1= new Producto(new Numero(1.2), new Numero(2.3));
		Division d1= new Division(new Numero(10.0), new Numero(5.0));
		
		List<Expresion> expresiones=Arrays.asList(s1,r1,p1,d1);
		for(Expresion ex:expresiones) System.out.println(ex.getEcuacion());
	}

}
