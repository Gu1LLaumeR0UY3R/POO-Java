package TP2;

public class Voiture extends Vehicule {

    public Voiture(int anneeModele, double prix) {
        super(anneeModele, prix);
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture démarre en douceur.");
    }

    @Override
    public void accelerer() {
        System.out.println("La voiture accélère.");
    }
}