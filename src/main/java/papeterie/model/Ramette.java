package papeterie.model;

public class Ramette extends ArticleUnitaire {
    private double grammage;

    public Ramette(int id, String nom, double prix, double grammage) {
        super(id, nom, prix);
        this.grammage = grammage;

    }

    public double getGrammage() {
        return grammage;
    }

    public void setGrammage(double grammage) {
        this.grammage = grammage;
    }
}
