package main;

import java.util.ArrayList;

import main.Carta.Baraja;
import main.Carta.Figura;
import main.Carta.Palo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carta c = new Carta(Figura.As, Palo.Bastos);

		System.out.println(c);
		
		Baraja baraja=new Baraja();
		
		baraja.barajar();
		
	}

}
