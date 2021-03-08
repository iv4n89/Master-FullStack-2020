package main;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class EjercicioScanner {

	public static void main(String[] args) throws Exception {
		Date fecha=new Date();
		Formatter fmt=new Formatter();//Actua como un bufer
		fmt.format(Locale.CANADA,"%1$td-%1$tB-%1$tY\n",fecha);//Añade elementos con formato a un StringBuilder
		fmt.format("%+,.2f\n", 23423534345.345325342);
		System.out.println(fmt.toString());
		
		NumberFormat nf=NumberFormat.getPercentInstance();
		System.out.println(nf.format(0.21));
		nf=NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(23));
		
		
		//Para ejecutar programas externos
		Runtime runtime =Runtime.getRuntime();
		System.out.println("Se va a lanzar el bloc de notas");
		Process proceso=runtime.exec(new String[] {"notepad.exe","fichero.txt"});
		proceso.waitFor();
		System.out.println("Se ha lanzado el bloc de notas");
	}

}
