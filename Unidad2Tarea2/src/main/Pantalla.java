package main;

public class Pantalla extends Periferico {
	private int canal;
	private int volumen;

	{
		this.tipoConexion = Conexion.HDMI;
		setCanal(1);
		setVolumen(10);
	}

	public Pantalla(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	@Override
	public boolean conectar() {
		setConectado(true);
		System.out.println("Se ha encendido la pantalla");
		if (!getConectado())
			return false;
		else {
			return true;
		}
	}

	@Override
	public void enviarInformacion(String informacion) {
		if (!this.conectado) {
			throw new RuntimeException("No puede usarse la pantalla mientras esta apagada");
		} else {
			setMensajeInfo(informacion);
			if (informacion.equals(""))
				System.out.println("Se ha borrado la memoria");
			else
				System.out.println("Se ha enviado la informacion");
		}
	}

	@Override
	public String recibirInformacion() {
		if (!this.conectado) {
			throw new RuntimeException("No puede recibir datos si la pantalla esta apagada");
		} else {
			System.out.println("Se recibio la informacion");
			return getMensajeInfo();
		}
	}

	@Override
	public void desconectar() {
		setConectado(false);
		System.out.println("Se ha apagado la pantalla");
	}

	public void aumentarCanal() {
		if (!this.conectado) {
			throw new RuntimeException("No puede usarse la pantalla mientras esta apagada");
		} else {
			setCanal(++this.canal);
			System.out.println("El canal actual es: " + getCanal());
		}
	}

	public void disminuirCanal() {
		if (!this.conectado) {
			throw new RuntimeException("No puede usarse la pantalla mientras esta apagada");
		} else {
			setCanal(--this.canal);
			System.out.println("El canal actual es: " + getCanal());
		}
	}

	public void aumentarVolumen() {
		if (!this.conectado) {
			throw new RuntimeException("No puede usarse la pantalla mientras esta apagada");
		} else {
			setVolumen(++this.volumen);
			System.out.println("El volumen actual es: " + getVolumen());
		}
	}
	
	public void disminuirVolumen() {
		if (!this.conectado) {
			throw new RuntimeException("No puede usarse la pantalla mientras esta apagada");
		} else {
			setVolumen(--this.volumen);
			if(this.getVolumen()<0) this.setVolumen(0);
			System.out.println("El volumen actual es: " + getVolumen());
		}
	}

}
