package TP1;

import java.time.LocalDate;

public class Chef extends Employe {
    private String service;

    public Chef(String nom, String prenom, LocalDate dateNaissance, double salaire, String service) {
        super(nom, prenom, dateNaissance, salaire);
        this.service = service;
    }

    public String getService() { return service; }
    public void setService(String service) { this.service = service; }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Service : " + service);
    }
}