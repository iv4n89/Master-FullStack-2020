package main;
 
enum meses{
	Enero,
	Fecbrero,
	Marzo,
	Abril,
	Mayo,
	Junio,
	Julio,
	Agosto,
	Septiembre,
	Octubre,
	Noviembre,
	Diciembre
}

public class MesesEjercicio6 {
	private int mes=0;
	private int diasMes=0;
	
	public int getDiasMes() {
		return diasMes;
	}
	
	public void setDiasMes(int diasMes) {
		this.diasMes=diasMes;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public String mostrarMes(int mes) {
		mes=getMes();
		String m="";
			switch(mes) {
			case 1:
				m= meses.Enero.toString();
				break;
			case 2:
				m=meses.Fecbrero.toString();
				break;
			case 3:
				m=meses.Marzo.toString();
				break;
			case 4:
				m=meses.Abril.toString();
				break;
			case 5:
				m=meses.Mayo.toString();
				break;
			case 6:
				m=meses.Junio.toString();
				break;
			case 7:
				m=meses.Julio.toString();
				break;
			case 8:
				m=meses.Agosto.toString();
				break;
			case 9:
				m=meses.Septiembre.toString();
				break;
			case 10:
				m=meses.Octubre.toString();
				break;
			case 11: 
				m=meses.Noviembre.toString();
				break;
			case 12:
				m=meses.Diciembre.toString();
				break;
			default:
				Consola.mostrarMensaje("Se introdujo un dato incorrecto.");
			}
		return m;
	}
	
	public int detallarDiasMes(int mes) {
		int dias=0;
		switch(mes) {
		case 1,3,5,7,8,10,12:
			dias=31;
		break;
		case 2:
			dias=28;
			break;
		case 4,6,9,11:
			dias=30;
			break;
		default:
			Consola.mostrarMensaje("Se introdujo un dato incorrecto.");
		}
		return dias;
	}
}
