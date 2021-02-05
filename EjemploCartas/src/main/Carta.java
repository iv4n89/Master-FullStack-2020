package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carta {
	public enum Palo {
		Copas, Espadas, Bastos, Oros
	}
	
	public enum Figura{
		As(11), Dos(2), Tres(3), Cuatro(4), Cinco(5), Seis(6), Siete(7), Sota(10), Caballo(10), Rey(10);
		
		final int[] PUNTUACIONES= {11,2,3,4,5,6,7,10,10,10};
		private final int puntuacion;
		
		Figura(int puntuacion){
			this.puntuacion=PUNTUACIONES[ordinal()];
		}
		
		public int getPuntuacion() {
			return this.puntuacion;
		}
		
		@Override
		public String toString() {
			return (this.ordinal()+1)+" de "+this.name()+" con puntuacion "+this.getPuntuacion();
		}
	}

	private  final Figura figura;
	private final Palo palo;

	public Carta(Figura figura, Palo palo) {
		this.figura=figura;
		this.palo=palo;
	}
	
	public int getPuntuacion() {
		return this.figura.getPuntuacion();
		//return numero==1?11:numero<8?numero:numero>10?null:10;
	}

	public Palo getPalo() {
		return palo;
	}
	
	@Override
	public String toString() {
		return ""+figura;
	}
	
	class Baraja{
		
		public Baraja() {
			
		}
		
		private static final int NUM_CARTAS=40;
		private ArrayList<Carta> mazo=new ArrayList<Carta>(NUM_CARTAS);
		
		public boolean isEmpty() {
			return mazo.isEmpty();
		}
		
		public Carta[] repartir(int numCartas) {
			List<Carta> aux =mazo.subList(0, numCartas);//no retorna una copia, trabaja sobre la lista original
			aux.clear(); //vacia la sublista y a la vez quita las cartas de la lista original
			return aux.toArray(new Carta[0]);
		}
		
		public void poblar() {
			mazo.clear();//Vaciamos la lista
			//generador de nuevas cartas para la lista
			for(Carta.Palo palo : Carta.Palo.values()) {
				for(Carta.Figura figura: Carta.Figura.values()){
					mazo.add(new Carta(figura, palo));
				}
			}
		}
		
		public void barajar() {
			Collections.shuffle(mazo);//Desordena una lista
		}
		
		@Override
		public String toString() {
			return mazo.toString();
		}
	}
	
}
