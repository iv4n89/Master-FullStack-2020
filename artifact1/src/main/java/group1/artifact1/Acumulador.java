package group1.artifact1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Acumulador {
	private Double counter=0.0;

	public void add(int cantidad) {
		counter+=cantidad;
	}
	
	public void add(String expresion) {
		String regex="\\s*(?<n1>\\d+)\\s*(?<operador>\\p{Punct}+)\\s*(?<n2>\\d+)\\s*";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(expresion.trim());
		Double aux=0.0;
		
		if(matcher.matches()) {
			String exp=matcher.group("operador");
			Double n1=Double.valueOf(matcher.group("n1"));
			Double n2=Double.valueOf(matcher.group("n2"));
			if(matcher.matches()) {
				switch(exp) {
					case "+":
						aux=n1+n2;
						break;
					case "-":
						aux=n1-n2;
						break;
					case "*":
						aux=n1*n2;
						break;
					case "/":
						aux=n1/n2;
						break;
					default:
						break;
				}
			}
		}
		
		counter+=aux;
	}
	
	public Double getValue() {
		return counter;
	}

}
