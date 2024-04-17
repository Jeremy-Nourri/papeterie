package papeterie.model;

import java.util.HashMap;

public class Article {
    private int id;

    private static HashMap<Integer, Article> articles = new HashMap<>();

    public Article(int id) {
        this.id = id;
    }

    public static Article getArticle(int id) {
        return articles.get(id);
    }

    public static void ajouterArticle(int id, Article article) {
        articles.put(id, article);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
