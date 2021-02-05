package main;

public class test {
	
	static boolean b;
	static void procesa() {
		b=(4>3)&&(b==false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		procesa();
		Consola.mostrarMensaje(""+b);
		int [][] matriz= {{1,2},{3,4,5},{6,7}};
		int i=matriz[2][1];
		Consola.mostrarMensaje(i+"");
	}

}
