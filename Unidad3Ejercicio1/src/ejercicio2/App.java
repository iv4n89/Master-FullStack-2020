package ejercicio2;

import java.util.Arrays;

public class App {
	
	public static void main(String[] args) {
		ArticleRepository.addArticle(1234, "Zanahoria", 12.34);
		ArticleRepository.addArticle(1235, "Col", 2.34);
		ArticleRepository.addArticle(1236, "Sal", 0.50);
		System.out.println(ArticleRepository.getAll());
		ArticleRepository.removeArticle(1235);
		System.out.println(ArticleRepository.getAll());
		ArticleRepository.removeArticle(1239);
		System.out.println(ArticleRepository.getAll());
		String[] test= ArticleRepository.findArticle(1234);
		Arrays.stream(test).forEach(System.out::println);
	}

}
