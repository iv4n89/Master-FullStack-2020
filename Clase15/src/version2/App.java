package version2;

import java.util.Scanner;

public class App {
	private static final String CLAVEBUENA ="Esta";
	private static final int NUMEROINTENTOS=3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginControl logc = LoginControl.newInstance(CLAVEBUENA);
		boolean validado=false;
		do {
			String clave=pedirClave();
			validado=logc.validate(clave);
			mostrarMensaje(validado,logc.quedanIntentos());
		}while(!validado&&logc.quedanIntentos());
		try {
			logc.validate("uuuu");
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		
	}

	private static void mostrarMensaje(boolean validado, boolean quedanIntentos) {
			System.out.println(quedanIntentos&&!validado?"No es valida":!quedanIntentos&&!validado?"No quedan intentos":"Es valida");
	}

	private static String pedirClave() {
		return new Scanner(System.in).nextLine();
	}

}

class LoginControl {
	private static final String ERR_NO_INTENTOS="Ya no hay mas intentos";
	private final String CLAVE_BUENA;
	private final int N_INTENTOS_MAX;
	private int intentos;
	
	private LoginControl(String clavebuena) {
		this(clavebuena, 3);
	}

	private LoginControl(String clavebuena, int numerointentos) {
		this.CLAVE_BUENA=clavebuena;
		this.intentos=this.N_INTENTOS_MAX=numerointentos;
	}
	
	public static LoginControl newInstance(String clavebuena) {
		
		return new LoginControl(clavebuena);
	}
	
	public static LoginControl newInstance(String clavebuena, int numerointentos) {

		return new LoginControl(clavebuena, numerointentos);
	}
	
	public boolean validate(String clave) {
		intentos--;
		
		if(this.intentos<0) {
			throw new RuntimeException(ERR_NO_INTENTOS);
		}
		
		if(clave.equals(CLAVE_BUENA)) {
			this.intentos=0;
			return true;
		}
		return false;
	}
	
	public boolean quedanIntentos() {
		return this.intentos>0;
	}
	
}

class LoginControlFactory{
	public static LoginControl newIntance(String clavebuena, int numerointentos) {
		return LoginControl.newInstance(clavebuena,numerointentos);
	}
}
