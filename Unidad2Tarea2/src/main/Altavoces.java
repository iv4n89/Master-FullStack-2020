package main;

public class Altavoces extends Periferico {
	private int volumen;
	
	{
		this.tipoConexion=Conexion.JACK;
		this.setVolumen(10);
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Altavoces(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean conectar() {
		setConectado(true);
		System.out.println("Se han encendido los altavoces");
		if (!getConectado())
			return false;
		else {
			return true;
		}
	}

	@Override
	public void enviarInformacion(String informacion) {
		if (!this.conectado) {
			throw new RuntimeException("No puede enviar datos si los altavoces estan apagados");
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
			throw new RuntimeException("No puede recibir datos si los altavoces estan apagados");
		} else {
			System.out.println("Se recibio la informacion");
			return getMensajeInfo();
		}
	}

	@Override
	public void desconectar() {
		setConectado(false);
		System.out.println("Se han desconectado los altavoces");
	}
	
	public void aumentarVolumen() {
		if (!this.conectado) {
			throw new RuntimeException("No pueden usarse los altavoces mientras estan apagados");
		} else {
			setVolumen(++this.volumen);
			System.out.println("El volumen actual es: " + getVolumen());
		}
	}
	
	public void disminuirVolumen() {
		if (!this.conectado) {
			throw new RuntimeException("No pueden usarse los altavoces mientras estan apagados");
		} else {
			setVolumen(--this.volumen);
			if(this.getVolumen()<0) this.setVolumen(0);
			System.out.println("El volumen actual es: " + getVolumen());
		}
	}
	
	public void emitirSonido(String sonido){
		if (!this.conectado) {
			throw new RuntimeException("No pueden usarse los altavoces mientras estan apagados");
		} else {
			if(this.getVolumen()<1) {
				System.out.println("El volumen es 0, no se emitirá sonido");
			}else {
				this.enviarInformacion(sonido);
				System.out.println(this.recibirInformacion());
			}
		}
	}
}
