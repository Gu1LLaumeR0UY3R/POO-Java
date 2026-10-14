package TP1;

import java.time.LocalDate;

public class Directeur extends Chef {
    private String societe;

    public Directeur(String nom, String prenom, LocalDate dateNaissance,
                     double salaire, String service, String societe) {
        super(nom, prenom, dateNaissance, salaire, service);
        this.societe = societe;
    }

    public String getSociete() { return societe; }
    public void setSociete(String societe) { this.societe = societe; }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Société : " + societe);
    }
}