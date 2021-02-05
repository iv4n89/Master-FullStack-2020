package main;

import java.util.Random;

public class Ejercicio6 {
	MesesEjercicio6 m=new MesesEjercicio6();
	Random random=new Random();
	
	public void ejercicio6() {
		double[] arrayMes= crearArrayMes(seleccionarMes(recogerMes()));
		arrayMes= lluviaParaMes(arrayMes);
		mostrarDatos(arrayMes);
	}
	
	private int recogerMes() {
		//Se pide por teclado el mes con el que se quiere trabajar
		m.setMes(Consola.leerEntero("Introduzca el mes con el que se va a trabajar: "));
		return m.getMes();
	}
	
	private int seleccionarMes(int mes) {
		//Se consiguen los dias del mes con el que se va a trabajar
		m.setDiasMes(m.detallarDiasMes(mes));
		return m.getDiasMes();
	}
	
	private double[] crearArrayMes(int diasMes) {
		//Se crea el array del tamaño del numero de dias del mes seleccionado
		// TODO Auto-generated method stub
		double[] arrayMes=new double[diasMes];
		return arrayMes;
	}
	
	private double[] lluviaParaMes(double[] arrayMes) {
		//Se rellena el array de numero de dias del mes seleccionado con numeros aleatorios entre 1 y 10
		for(int i=0;i<arrayMes.length;i++) {
			arrayMes[i]=random.nextDouble()*10;
		}
		return arrayMes;
	}
	
	private String obtenerNombreMes() {
		//Se consigue el nombre del mes que se introdujo anteriormente como numero entero, nombre que ya se guardo anteriormente como enumeracion dentro de la clase de meses
		return m.mostrarMes(m.getMes());
	}
	
	private int[] obtenerDiasLluviosos(double[] arrayMes) {
		//Se consigue el numero de dias total que tendra una cantidad de lluvia mayor a 5.0
			int contador=0;
			int j=0;
			if(arrayMes!=null) {
				for(int i=0;i<arrayMes.length;i++) {
					if(arrayMes[i]>5) contador++;
				}
			}else Consola.mostrarMensaje("Algo salio mal");
			
			//Se crea un array del tamaño del numero de dias cuyo valor sea mayor a 5.0
			int[] diasLluviosos=new int[contador];
			
			//Se guardan las posiciones de los indices del array de los dias del mes dentro del array recien creado, para posterior uso
			for(int i=0;i<arrayMes.length;i++) {
				if(arrayMes[i]>5) {
					diasLluviosos[j]=i+1;
					j++;
				}
			}
			return diasLluviosos;
	}
	
	private void mostrarDatos(double[] arrayMes) {
		//Se guardan en variables el nombre del mes y el array con los indices de los dias mas lluviosos (los numeros de los dias del mes con mas de 5.0 de cantidad de lluvia)
		String mes= obtenerNombreMes();
		int[] diasLluviosos=obtenerDiasLluviosos(arrayMes);
		//Se muestra la informacion
		Consola.mostrarMensaje("Los dias mas lluviosos de "+mes+" seran: ");
		for(int i=0;i<diasLluviosos.length;i++) {
			if(i<diasLluviosos.length-1) System.out.print(diasLluviosos[i]+", ");
			else System.out.print(diasLluviosos[i]);
		}
	}

}
