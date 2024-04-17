package papeterie.model;

import java.time.LocalDate;


public class Facture {
    private int id;
    private String client;
    private LocalDate date;
    private Ligne[] lignes;
    private double quantite;
    private double pourcentageRemise;
    private static final int maxLignes = 10;

    public Facture(Ligne[] lignes, double pourcentageRemise) {
        this.lignes = lignes;
        this.pourcentageRemise = pourcentageRemise;
    }

    public void ajouterUneLigne(int id, int quantite) {
        if (lignes.length >= maxLignes) {
            System.out.println("Limite de lignes atteinte");
            return;
        }

        Article articleSelection = Article.getArticle(id);

        if (articleSelection == null) {
            System.out.println("Article non trouvé");
            return;
        }

        Ligne nouvelleLigne = new Ligne(articleSelection, quantite);

        int longueurTableau = lignes.length;

        lignes[longueurTableau] = nouvelleLigne;

    }

    public double getPrixTotal() {
        double prixTotal = 0;

        for (Ligne ligne : lignes) {
            prixTotal += ligne.getQuantite() * ligne.getArticle().
        }
    }

    public double getPourcentageRemise() {
        return pourcentageRemise;
    }

    public void setPourcentageRemise(double pourcentageRemise) {
        this.pourcentageRemise = pourcentageRemise;
    }
}
