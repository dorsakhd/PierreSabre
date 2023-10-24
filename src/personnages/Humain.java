package personnages;

public class Humain {
	private String nom;
    private String boissonFavorite;
    private int argent;

    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
    }
    public void gagnerArgent(int gain) {
        argent += gain;
        parler("J'ai gagné " + gain + "Maintenant, j'ai " + argent);
    }

    public void perdreArgent(int perte) {
        argent -= perte;
        parler("J'ai perdu " + perte + "Maintenant, il me reste " + argent);
    }

    public void direBonjour() {
        parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite);
    }

    public void boire() {
        parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    public void acheter(String bien, int prix) {
        if (argent >= prix) {
            argent -= prix;
            parler("J'ai acheté " + bien + " pour " + prix + " unités d'argent.");
        } else {
            parler("Je n'ai pas assez d'argent pour acheter " + bien);
        }
    }

    private void parler(String texte) {
        System.out.println(texte);
    }

}
