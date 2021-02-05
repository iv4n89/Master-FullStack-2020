package main;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impresora impresora1=new Impresora("impresora oficina");
		impresora1.conectar();
		impresora1.addPapel(10);
		impresora1.enviarInformacion("Imprimir hoja");
		impresora1.imprimir();
		impresora1.desconectar();
		
		Pantalla pantalla1=new Pantalla("pantalla de PC1");
		pantalla1.conectar();
		pantalla1.aumentarCanal();
		pantalla1.aumentarVolumen();
		pantalla1.disminuirCanal();
		pantalla1.disminuirVolumen();
		pantalla1.desconectar();
		//pantalla1.disminuirCanal();

		Altavoces altavoces1=new Altavoces("altavoces PC1");
		altavoces1.conectar();
		altavoces1.aumentarVolumen();
		altavoces1.disminuirVolumen();
		altavoces1.disminuirVolumen();
		altavoces1.disminuirVolumen();
		altavoces1.disminuirVolumen();
		altavoces1.disminuirVolumen();
		altavoces1.disminuirVolumen();
		altavoces1.disminuirVolumen();
		altavoces1.disminuirVolumen();
		altavoces1.disminuirVolumen();
		altavoces1.disminuirVolumen();
		altavoces1.disminuirVolumen();
		altavoces1.disminuirVolumen();
		altavoces1.aumentarVolumen();
		altavoces1.aumentarVolumen();
		altavoces1.aumentarVolumen();
		altavoces1.emitirSonido("Sonido");
		altavoces1.desconectar();
		altavoces1.emitirSonido("Sonido");
	}

}
