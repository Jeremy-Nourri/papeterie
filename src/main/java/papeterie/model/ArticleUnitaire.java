package papeterie.model;

public class ArticleUnitaire extends Article {
    private String nom;
    private double prix;

    public ArticleUnitaire(int id, String nom, double prix) {
        super(id);
        this.nom = nom;
        this.prix = prix;
    }
    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
            this.prix = prix;
        }
    public String getNom() {
            return nom;
        }

    public void setNom(String nom) {
            this.nom = nom;
        }


}