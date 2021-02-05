package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

enum Mes {
	ENERO(31), FEBRERO(28), MARZO(31), ABRIL(30), MAYO(31), JUNIO(30), JULIO(31), AGOSTO(31), SEPTIEMBRE(30),
	OCTUBRE(31), NOVIEMBRE(30), DICIEMBRE(31);

	private final int numeroDias;

	private Mes(int numeroDias) {
		this.numeroDias = numeroDias;

	}

	public int getOrden() {
		return (this.ordinal() + 1);
	}

	public int getNumeroDias() {
		return numeroDias;
	}

	@Override
	public String toString() {
		return "" + this.name() + ": mes " + this.getOrden();
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un numero de dias: ");
		int dias = entrada.nextInt();
		ArrayList<Mes> lMeses = new ArrayList<>();
		for (Mes m : Mes.values()) {
			if (m.getNumeroDias() == dias) {
				lMeses.add(m);
			}
		}
		System.out.println("Meses que tienen " + dias + " dias: ");
		if (lMeses.isEmpty()) {
			throw new RuntimeException("No hay meses con " + dias + " dias.");
		} else {
			System.out.println(Arrays.toString(mesesConDias(dias,lMeses)));
		}
	}

	private static Mes[] mesesConDias(int dias, ArrayList<Mes> meses) {
		if (meses.isEmpty()) {
			throw new RuntimeException("No hay meses con " + dias + " dias.");
		} else {
			return meses.toArray(n -> new Mes[n]);
		}
	}

}
