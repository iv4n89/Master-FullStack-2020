package main;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseConMetodo clase = new ClaseConMetodo();
		
		int n= (Integer)FrameWorkNoNulls.executeNoNulls(ClaseConMetodo.class, clase , "sumar",1,2,3);
		System.out.println(n);
	}
	
}
