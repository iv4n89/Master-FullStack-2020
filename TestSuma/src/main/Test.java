package main;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Runtime run = Runtime.getRuntime();
		Process resultado= run.exec("java -jar resources/Suma.jar 30 404");
		resultado.waitFor();
		System.out.println(resultado.exitValue());
	}

}
