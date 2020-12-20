package main;

public class JuegoExt extends Juego{
	
	private int vidasIniciales;
	private static int record=1;
	private static enum Record{
		Igualado,
		Batido,
		Menor
	}

	public JuegoExt(String nombre, int vidas, int duracion) {
		super(nombre, vidas, duracion);
		this.vidasIniciales=this.getVidas();
		// TODO Auto-generated constructor stub
	}
	
	public int getVidasIniciales() {
		return vidasIniciales;
	}
	
	public int getRecord() {
		return record;
	}
	
	public void setRecord() {
		if(this.getVidas()>this.record) this.record=this.getVidas();
	}
	
	public boolean quitaVida() {
		this.setVidas(this.getVidas()-1);
		return this.getVidas()>0;
	}
	
	public void reiniciaPartida() {
		this.setVidas(vidasIniciales);
	}
	
	public Record actualizaRecord() {
		if(this.record==this.getVidas()) return Record.Igualado;
		else if(this.record>this.getVidas()) return Record.Menor;
		else 
		{
			this.setRecord(); 
			return Record.Batido;
		}
	}

}
