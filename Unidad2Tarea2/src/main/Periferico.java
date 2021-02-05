package main;

enum Conexion{
	USB,
	HDMI,
	JACK
}

public abstract class Periferico {
	protected String nombre;
	protected Conexion tipoConexion;
	protected boolean conectado;
	protected String mensajeInfo;
	
	public Periferico(String nombre) {
		setNombre(nombre);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Conexion getTipoConexion() {
		return tipoConexion;
	}
	public boolean getConectado() {
		return this.conectado;
	}
	public void setConectado(boolean b) {
		this.conectado=b;
	}
	public String getMensajeInfo() {
		return this.mensajeInfo;
	}
	public void setMensajeInfo(String m) {
		this.mensajeInfo=m;
	}
	
	public abstract boolean conectar();
	public abstract void enviarInformacion(String informacion);
	public abstract String recibirInformacion();
	public abstract void desconectar();
}
