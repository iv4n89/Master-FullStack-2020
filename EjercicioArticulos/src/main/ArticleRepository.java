package main;

import java.util.Scanner;

public class ArticleRepository {
	private final static int LEN_CODE=4;
	private final static int LEN_NAME=8;
	private final static int LEN_PRICE=8;
	private final static int LEN_ARTICULO=LEN_CODE+LEN_NAME+LEN_PRICE;
	private StringBuilder bufer=new StringBuilder();

	public void addArticle(int code, String name, double price) {
		bufer.append(formatedArticle(code,name,price));
	}
	
	private String formatCode(int code) {
		return String.format("%0"+LEN_CODE+"d",code);
	}
	
	private String formatName(String name) {
		if(name.length()>LEN_NAME) name=name.substring(0,LEN_NAME);
		return String.format("%"+LEN_NAME+"s", name);
	}
	
	private String formatPrice(double price) {
		return String.format("%0"+LEN_PRICE+".2f", price);
	}

	private String formatedArticle(int code, String name, double price) {
		return String.format("%s%s%s",formatCode(code),formatName(name),formatPrice(price)); //Los formatos mejor aislarlos en su propio metodo por si queremos cambiarlo luego, que se pueda cambiar en su propio metodo
	}
	
	private String[] formatArticle(String article) {
		return new String[] {article.substring(0,LEN_CODE),article.substring(LEN_CODE,LEN_CODE+LEN_NAME),article.substring(LEN_CODE+LEN_NAME)};
	}
	
	public static Object[] formatArticleObj(String articulo) {
		Scanner scanner=new Scanner(articulo);
		scanner.useDelimiter("\\D");
		int code = scanner.nextInt();
		String name=scanner.next();
		return new Object[] {code,name};
	}
	
	private int findPosArticle(int code) {
		String codef=formatCode(code);
		int pos=0;
		while(pos<bufer.length()) {
			if(bufer.substring(pos,pos+LEN_CODE).equals(codef)) {
				return pos;
			}
			pos+=LEN_ARTICULO;
		}
		return -1;
	}

	public String[] findArticle(int code) {
		int pos=findPosArticle(code);
		if(pos<0) return null;
		String articulo=bufer.substring(pos,pos+LEN_ARTICULO);
		return formatArticle(articulo);
	}

	public boolean removeArticle(int code) {
		int pos=findPosArticle(code);
		if(pos<0) return false;
		bufer.delete(pos, pos+LEN_ARTICULO);
		return true;
	}

	public void editArticle(int code, String newName, double newPrice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return bufer.toString();
	}
	
	

}
