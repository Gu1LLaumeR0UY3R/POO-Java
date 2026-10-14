package TP3;

public class Maison extends Batiment {
    private int nbPieces;

    public Maison() {
        super();            // appelle Batiment()
        this.nbPieces = 0;
    }

    public Maison(String adresse, int nbPieces) {
        super(adresse);     // appelle Batiment(adresse)
        this.nbPieces = nbPieces;
    }

    public int getNbPieces() { return nbPieces; }
    public void setNbPieces(int nbPieces) { this.nbPieces = nbPieces; }

    @Override
    public String toString() {
        return super.toString() + ", nombre de pièces : " + nbPieces;
    }
}
