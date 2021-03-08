package operacion;

public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado=getResultado(args);         //getResultado(args);
		//System.out.println(resultado);
		System.exit(resultado);
	}
	
	private static int getResultado(String[] args) {
		int n1= Integer.parseInt(args[0]);
		int n2= Integer.parseInt(args[1]);
		return n1+n2;
	}

}
