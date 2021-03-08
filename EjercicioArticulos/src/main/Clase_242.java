package main;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Clase_242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mes m1=Mes.Jun;
		
		int numDias=solicitarDias();
		Mes[] dias =obtenerDiasCon(numDias);
		imprimir(dias);
	}
	
	private static int solicitarDias() {
		Scanner scanner=new Scanner(System.in);
		return scanner.nextInt();
	}
	
	private static Mes[] obtenerDiasCon(int dias) {
		List<Mes> meses=new ArrayList<>();
		for(Mes m:Mes.values()) if(m.getNumeroDias()==dias) meses.add(m);
		return meses.toArray(Mes[]::new);
	}
	
	private static void imprimir(Mes[] meses) {
		System.out.println("los dias son: "+Arrays.toString(meses));
	}

}

enum Mes{
	Ene,Feb,Mar,Abr,May,Jun,Jul,Ago,Sep,Oct,Nov,Dic;
	
	private int numeroDias;

	public int getNumeroDias() {
		
		return Month.of(this.getOrden()).length(false);
	}
	
	public int getOrden() {
		return this.ordinal()+1;
	}
	
	@Override
	public String toString() {
		return Month.of(this.getOrden()).getDisplayName(TextStyle.FULL, new Locale("es","ES"))+" tiene "+this.getNumeroDias()+" dias";
	}
}
