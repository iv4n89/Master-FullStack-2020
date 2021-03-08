package ejercicio1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
	
	static Scanner scan=new Scanner(System.in);
	
	static enum Meses{
		enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dateValidator();
		//mailValidator();
		dirValidator();
	}
	
	private static void dateValidator() {
		System.out.print("Introduce una fecha con formato dd/mm/yyyy o yyyy-mm-dd o dd de mm de yyyy: ");
		System.out.println(validateDate(scan.nextLine()));
	}
	
	private static String validateDate(String date) {
		String mes="";
		for(Meses m:Meses.values()) {
			if(date.contains(m.name())) mes=m.name();
		}
		boolean matchFound1=Pattern.compile("\\d{2}/\\d{2}/\\d{4}").matcher(date).find();
		boolean matchFound2=Pattern.compile("\\d{4}-\\d{2}-\\d{2}").matcher(date).find();
		boolean matchFound3=Pattern.compile("\\d{2} de "+mes+" de \\d{4}").matcher(date).find();
		if(matchFound1||matchFound2||matchFound3) {
			return "ok";
		}else {
			return "no";
		}
	}
	
	private static void mailValidator() {
		System.out.print("Introduce un mail para validar: ");
		System.out.println(validateMail(scan.nextLine()));
	}
	
	private static String validateMail(String mail) {
		boolean matchFound=Pattern.compile("\\p{Alnum}{1,20}@\\w{1,10}.\\w{1,5}").matcher(mail).find();
		if(matchFound) {
			return "ok";
		}else return "no";
	}
	
	private static void dirValidator() {
		System.out.println("Introduce una direccion para validar: ");
		System.out.println(validateDir(scan.nextLine()));
	}
	
	private static String validateDir(String dir) {
		boolean matchFound=Pattern.compile("\\w{1,20}, Nº \\d{1,3}, \\d{1,2}º\\w{1}, (\\d{5}) \\w{1,10}").matcher(dir).find();
		if(matchFound) {
			return "ok";
		}else return "no";
	}

}
