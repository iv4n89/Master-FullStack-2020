package main;

public class Ejercicio1 {
	
	static String cadenaDNI;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cadenaDNI = leerDNI();
		if (!validarDNI(cadenaDNI)) {
			Consola.mostrarMensaje("El DNI " + cadenaDNI + " es inválido.");
		} else
			Consola.mostrarMensaje("El DNI " + cadenaDNI + " es válido.");

	}

	private static String leerDNI() {
		final String MENSAJE = "Introduce un dni con formato 12345678-A: ";
		String dni = "";
		try {
			while (dni.length() != 10) {
				if (dni.length() != 10) {
					dni = Consola.leerString(MENSAJE).toUpperCase();
				} else {
					while (dni.charAt(8) != '-'&& !Character.isLetter(dni.charAt(9)) && !verificarNumeros(dni)) {
						dni = Consola.leerString(MENSAJE).toUpperCase();
					}
				}
			}
			return dni;
		} catch (NumberFormatException ex) {
			dni = "";
			return leerDNI();
		}
	}

	private static boolean validarDNI(String dni) {
		char[] asignacionLetra = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };
		String[] corteDNI = dni.split("-");
		try {
			if (asignacionLetra[Integer.valueOf(corteDNI[0]) % 23] != corteDNI[1].charAt(0)) {
				return false;
			} else
				return true;
		} catch (ArrayIndexOutOfBoundsException ex) {
			return validarDNI(cadenaDNI=leerDNI());
		}catch(NumberFormatException ex) {
			return validarDNI(cadenaDNI=leerDNI());
		}
	}

	private static boolean verificarNumeros(String dni) {
		String numero = "";
		String miDNI = "";
		String sDNI = dni.substring(0, 9);
		String[] unoNueve = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (int i = 0; i < sDNI.length() - 1; i++) {
			numero = sDNI.substring(i, i + 1);

			for (int j = 0; j < unoNueve.length; j++) {
				if (numero.equals(unoNueve[j])) {
					miDNI += unoNueve[j];
				}
			}
		}

		if (miDNI.length() != 8) {
			return false;
		} else {
			return true;
		}
	}

}
