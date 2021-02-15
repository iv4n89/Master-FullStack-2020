package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) throws FileNotFoundException {
		String text=getFileToString("c:/palabras.txt");
		System.out.println(text);
		int counterQue= countOccurrencies(text, "que");
		int counterTas= countEndsWithOccurrencies(text, "tas");
		System.out.println("Numero de veces que aparece 'que': "+counterQue);
		System.out.println("Numero de palabras que acaban en 'tas': "+counterTas);
	}
	
	private static String getFileToString(String pathfile) throws FileNotFoundException {
		Scanner scan=new Scanner(new File("c:/palabras.txt"));
		String text="";
		while(scan.hasNext()) {
			String next=scan.next();
			if(Character.isUpperCase(next.charAt(0))) {
				next=". "+next;
			}
			text+=next+" ";
		}
		scan.close();
		return text;
	}
	
	private static int countOccurrencies(String text, String toFind) {
		int index=0,counter=0;
		index=text.indexOf(toFind);
		while (index!=-1) {
		      index=text.indexOf(toFind, index+1);
		      counter++;
		}
		return counter;
	}
	
	private static int countEndsWithOccurrencies(String text, String toFind) {
		int index=0,counter=0;
		String[] aux= text.split(" ");
		for(String s:aux) if(s.endsWith(toFind)) counter++;
		return counter;
	}

}
