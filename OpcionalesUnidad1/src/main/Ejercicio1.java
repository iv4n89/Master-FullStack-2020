package main;

public class Ejercicio1 {

	public static void main(String[] args) {
		String cadenaDNI=Consola.leerString("Introduzca un dni: ");
		boolean validado=validar(cadenaDNI);
		if(!validado) {
			Consola.mostrarMensaje("No es correcto");
		}else Consola.mostrarMensaje("Es correcto.");
	}

	private static boolean validar(String dni) {
		String letraMayuscula="";
		if(dni.length()!=9||Character.isLetter(dni.charAt(8))==false) {
			return false;
		}
		
		letraMayuscula=(dni.substring(8)).toUpperCase();
		if(soloNumeros(dni)==true&&letraDNI(dni).equals(letraMayuscula)) {
			return true;
		}else {
			return false;
		}
	}
	
	private static boolean soloNumeros(String dni) {
		String numero="";
		String miDNI="";
		String[] unoNueve= {"0","1","2","3","4","5","6","7","8","9"};
		
		for(int i=0; i<dni.length()-1;i++) {
			numero=dni.substring(i,i+1);
			
			for(int j=0;j<unoNueve.length;j++) {
				if(numero.equals(unoNueve[j])) {
					miDNI+=unoNueve[j];
				}
			}
		}
		
		if(miDNI.length()!=8) {
			return false;
		}else {
			return true;
		}
	}
	
	private static String letraDNI(String dni) {
		int miDNI=Integer.parseInt(dni.substring(0, 8));
		int resto=0;
		String miLetra="";
		String[] asignacionLetra= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		
		resto=miDNI%23;
		
		miLetra=asignacionLetra[resto];
		
		return miLetra;
	}
}
