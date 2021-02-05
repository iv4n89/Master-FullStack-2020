package main;

import java.time.LocalDate;
import java.util.ArrayList;

public class RepositorioConsumible {

private static ArrayList<Consumible> consumibles;
	
	static {
		consumibles=new ArrayList<>();
	}
	
	static void addConsumible(Consumible...cons) {
		for(Consumible con:cons) consumibles.add(con);
	}
	
	static void editConsumible(int posicion, Consumible cons) {
		consumibles.remove(posicion);
		consumibles.add(posicion, cons);
	}
	
	static void removeConsumible(Consumible...cons) {
		for(Consumible con:cons) consumibles.remove(con);
	}
	
	static Consumible getConsumible(int posicion) {
		return consumibles.get(posicion);
	}
	
	static int findConsumible(Consumible cons) {
		return consumibles.indexOf(cons);
	}
	
	static Consumible[] findAllConsumibles() {
		return consumibles.toArray(new Consumible[0]);
	}
	
	static Consumible[] findConsumibleByNombre(String nombre) {
		ArrayList<Consumible> nombreSimilar=new ArrayList<>();
		for(Consumible cons:consumibles) {
			if(cons.getNombre().contains(nombre)) {
				nombreSimilar.add(cons);
			}
		}
		return nombreSimilar.toArray(new Consumible[0]);
	}
	
	static Consumible[] findAllCaducados() {
		ArrayList<Consumible> caducados=new ArrayList<>();
		for(Consumible con:consumibles) if(con.getFecha().compareTo(LocalDate.now())<0) caducados.add(con);
		return caducados.toArray(new Consumible[0]);
	}
	
	static Consumible[] findAllGuardarEnNevera() {
		ArrayList<Consumible> nevera=new ArrayList<>();
		for(Consumible con:consumibles) {
			if(con instanceof Refresco) {
				Refresco conR=(Refresco) con;
				if(conR.getNevera()) nevera.add(conR);
			}
		}
		return nevera.toArray(new Consumible[0]);
	}
}
