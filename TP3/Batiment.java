package TP3;

public class Batiment {
    private String adresse;

    public Batiment() {
        this.adresse = "Non renseignée";
    }

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    @Override
    public String toString() {
        return "Bâtiment situé à l'adresse : " + adresse;
    }
}