package main;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Contrase�a pasada como argumento para probar la aplicacion: 1234
		comprobarPass(args);
	}
	
	public static String pedirPass(String...mensaje) {
		String m="";
		if(mensaje.length>0) m=mensaje[0];
		return Consola.leerString(m);
	}

	private static void comprobarPass(String[] args) {
		int intentos = 2;
		String pass =pedirPass("Introduzca la contrase�a. Tiene 3 intentos "+"(Contrase�a pasada como argumento: "+args[0]+") ");
		for(int i=2;i>0;i--) {
			if(!passCorrecta(pass, args[0])) {
				intentos--;
				Consola.mostrarMensaje("La contrase�a no es correcta. Tiene " + i + " intentos.");
				pass = pedirPass();
			}
		}
		if (intentos ==0&&!passCorrecta(pass, args[0]))	Consola.mostrarMensaje("No le quedan intentos, no introdujo la contrase�a correcta.");
		if(passCorrecta(pass, args[0])) Consola.mostrarMensaje("Contrase�a correcta.");
	}

	private static boolean passCorrecta(String pass, String args) {
		return pass.equals(args) ? true : false;
	}

}
