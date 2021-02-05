package tarea2.arrays;

public class OperacionC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Verificar si hay algo incorrecto
		
		
		if(verificarDatos(args)) procesarDatos(args[0], Integer.parseInt(args[1]));
		
		
		/*
		if(args.length==2) {
			String nombre=args[0];
			int edad=Integer.valueOf(args[1]);
			System.out.println(nombre+" tiene "+edad+" años.");
		}else System.out.println("Faltan datos");
	}*/

}
	private static boolean verificarDatos(String[] args) {
		if(args.length<2) {
			System.out.println("Faltan datos.");
			return false;
		}
		try {
			Integer.parseInt(args[1]);
			return true;
		}catch(NumberFormatException ex) {
			System.out.println("La edad no es valida");
			return false;
		}
	}
	private static void procesarDatos(String nombre, int edad) {
		System.out.println(nombre+" tiene "+edad+" años.");
		
	}

}
