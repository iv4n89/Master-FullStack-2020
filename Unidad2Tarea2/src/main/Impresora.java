package main;

public class Impresora extends Periferico {
	private int papel;

	public int getPapel() {
		return papel;
	}

	public void setPapel(int papel) {
		this.papel = papel;
	}

	{
		this.tipoConexion = Conexion.USB;
		this.setPapel(0);
	}

	public Impresora(String nombre) {
		super(nombre);
	}

	@Override
	public boolean conectar() {
		setConectado(true);
		System.out.println("Se ha conectado la impresora");
		if (!this.conectado)
			return false;
		else
			return true;
	}

	@Override
	public void enviarInformacion(String informacion) {
		if (!this.conectado) {
			throw new RuntimeException("No puede enviar datos si la impresora esta apagada");
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
			throw new RuntimeException("No puede recibir datos si la impresora esta apagada");
		} else {
			System.out.println("Se recibio la informacion");
			return getMensajeInfo();
		}
	}

	@Override
	public void desconectar() {
		setConectado(false);
		System.out.println("Se ha desconectado la impresora");
	}
	
	public void addPapel(int papel) {
		this.setPapel(papel);
		System.out.println("Se ha añadido "+papel+" hojas de papel");
	}
	
	public void removePapel() {
		this.setPapel(--this.papel);
		if(!tienePapel()) {
			System.out.println("Se ha acabado el papel");
		}else {
			System.out.println("Quedan "+this.getPapel()+" hojas de papel");
		}
		if(getPapel()<=0) this.setPapel(0);
	}

	public boolean tienePapel() {
		if (!this.conectado) {
			throw new RuntimeException("No puede recibir datos si la impresora esta apagada");
		} else {
			if (getPapel() < 1) {
				return false;
			} else {
				return true;
			}
		}
	}

	public boolean preparadaImprimir() {
		if (!this.conectado) {
			return false;
		} else {
			if (recibirInformacion().equals(null)) {
				System.out.println("No hay nada para imprimir, la impresora no hara nada");
				return false;
			} else {
				if (!tienePapel()) {
					System.out.println("No hay papel, no se imprimira nada.");
					return false;
				} else {
					System.out.println(this.getNombre() + " esta preparada para imprimir.");
					return true;
				}
			}
		}
	}

	public void imprimir() {
		if (!this.conectado)
			System.out.println("La impresora no puede imprimir estando apagada");
		else {
			if (!preparadaImprimir())
				System.out.println("La impresora no esta preparada para imprimir, no imprimira");
			else {
				System.out.println("Imprimiendo...\n" + this.recibirInformacion());
				enviarInformacion("");
				this.removePapel();
			}
		}
	}

}
