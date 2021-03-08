package Unidad3.Terea3;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fechas fecha=new Fechas("dd/MM/yyy");
		Date date1=fecha.convertirStringADate("10/10/2020");
		String dateS=fecha.convertirDateAString(date1);
		System.out.println(dateS);
	}

}
