import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		
		DBUtil db = new DBUtil();
		
		
		db.updateArticle("안녕하세요");
		
		ArrayList<Article> articles = db.selectArticles();
		
		for (int i = 0; i < articles.size(); i++) {
			System.out.println(articles.get(i).getTitle());
			System.out.println(articles.get(i).getBody());
		}
		

	}

}
