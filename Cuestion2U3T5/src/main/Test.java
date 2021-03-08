package main;

import java.util.Locale;

public class Test {
	public static void main(String[] args) {
		Registro reg=new Registro();
		reg.ingresar(1000);
		reg.gastar(500);
		reg.gastar(200);
		reg.ingresar(1200);
		reg.gastar(240.33);
		reg.gastar(75.43);
		reg.gastar(50.6);
		reg.gastar(170.44);
		System.out.println(reg);
		System.out.println("");
		reg.seleccionarRegion(Locale.US);
		System.out.println(reg);
	}
}
