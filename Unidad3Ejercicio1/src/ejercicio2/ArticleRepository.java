package ejercicio2;

/*
 * 4 primeros caracteres son un codigo de enteros
 *  8 caracteres para el nombre del articulo
 *  8 caracteres para el precio del articulo como un numero en punto flotante
 */

public class ArticleRepository {
	private static StringBuilder articles=new StringBuilder();
	
	public static void addArticle(int code, String name, double price) {
		final String FORMATTER="%-8s";
		String aux=String.format("%-4s", String.valueOf(code))+String.format(FORMATTER, name)+String.format(FORMATTER, String.valueOf(price));
		articles.insert(articles.length(), aux);
	}
	
	public static boolean removeArticle(int code) {
		int index=articles.indexOf(String.valueOf(code));
		//return articles.replace(index, index+12, "") != null;
		return articles.toString().contains(code+"")?articles.delete(index, index+20)!=null:false;
	}
	
	public static String[] findArticle(int code) {
		int index=articles.indexOf(code+"");
		return articles.toString().contains(code+"")?
				new String[] {getCodeString(index,articles),
						getNameString(index, articles),
						getPriceString(index, articles)}:null;
	}
	
	private static String getCodeString(int index, StringBuilder sB) {
		return sB.substring(index, index+4);
	}
	
	private static String getNameString(int index, StringBuilder sB) {
		return sB.substring(index+4, index+13);
	}
	
	private static String getPriceString(int index, StringBuilder sB) {
		return sB.substring(index+13, index+20);
	}
	
	public static StringBuilder getAll() {
		return articles;
	}

}
