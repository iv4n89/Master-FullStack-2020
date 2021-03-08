package main;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registro r1=new Registro();
		r1.add("01 Primer registro");
		r1.add("2 Segundo registro");
		r1.add("03 Tercer registro");
		r1.add("04 Cuarto registro");
		r1.add("05 quinto registro");
		try {
			System.out.println(Arrays.toString(r1.getRegistros()));
		} catch (Fallos e) {
			// TODO Auto-generated catch block
			System.out.println(String.format("Registros válidos: %s",e.getValidos()));
			System.out.println(String.format("Registros no válidos: %s",e.getNoValidos()));
		}
	}

}
