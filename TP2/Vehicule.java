package TP2;

public abstract class Vehicule {
    private static int compteur = 0;   // partagé par toutes les instances

    private int matricule;
    private int anneeModele;
    private double prix;

    public Vehicule(int anneeModele, double prix) {
        compteur++;
        this.matricule = compteur;     // auto-incrémenté
        this.anneeModele = anneeModele;
        this.prix = prix;
    }

    public int getMatricule() { return matricule; }

    public int getAnneeModele() { return anneeModele; }
    public void setAnneeModele(int anneeModele) { this.anneeModele = anneeModele; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }

    public abstract void demarrer();
    public abstract void accelerer();

    @Override
    public String toString() {
        return "Matricule : " + matricule
                + ", année modèle : " + anneeModele
                + ", prix : " + prix;
    }
}