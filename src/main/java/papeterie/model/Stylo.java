package papeterie.model;

import papeterie.enums.Couleur;

public class Stylo extends ArticleUnitaire{
    private Couleur couleur;


    public Stylo(int id, String nom, double prix, String couleur) {
        super(id, nom, prix);
        this.couleur = Couleur.valueOf(couleur);
    }


    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }
}
