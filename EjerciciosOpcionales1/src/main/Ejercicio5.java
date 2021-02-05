package main;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero= obtenerNumero();
		crearEstructura(numero);
	}
	
	private static int obtenerNumero() {
		int numero=0;
		try {
			numero=Consola.leerEntero("Introduce un numero para obtener la estructura: ");
		}catch(Exception ex) {
			Consola.mostrarMensaje("Se ha introducido algo que no es un numero entero");
		}
		
		return numero;
	}
	
	private static void crearEstructura(int n) {
		int letra=65;
		if(n%2==0) n++;
		 for(int i=1;i<=n*2;i+=2) {
			 for(int j=n*2;j>=i+2;j-=2) {
				 System.out.print("  ");
			 }
			 for(int k=0;k<i;k++) {
				 if(k<=i/2-1) {
					 System.out.print(Character.toChars(letra++));
				 }else {
					 System.out.print(Character.toChars(letra--));
				 }
			 }
			 System.out.println();
			 letra=65;
		 }
		 
		 for(int i=n*2-2;i>=1;i-=2) {
			 for(int j=i+2;j<=n*2;j+=2) {
				 System.out.print("  ");
			 }
			 for(int k=i;k>1;k--) {
				 if(k>i/2+1) {
					 System.out.print(Character.toChars(letra++));
				 }else {
					 System.out.print(Character.toChars(letra--));
				 }
			 }
			 System.out.println();
			 letra=65;
		 }
	}
}
