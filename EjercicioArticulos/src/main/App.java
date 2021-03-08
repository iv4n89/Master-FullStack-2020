package main;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArticleRepository repo=new ArticleRepository();
		repo.addArticle(4,"articulo X",200);
		repo.addArticle(2, "leche", 10.5);
		String[] articulo= repo.findArticle(2);
		System.out.println(Arrays.toString(articulo));
		System.out.println(repo);
		repo.removeArticle(4);
		repo.editArticle(2, "nuevo nombre",50.2);
		
		Object[] code=ArticleRepository.formatArticleObj("0023ksjfhgdkjfhdds");
		System.out.println(Arrays.toString(code));
	}

}
