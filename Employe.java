import java.time.LocalDate;

public class Employe extends Personne {
    private double salaire;

    public Employe(String nom, String prenom, LocalDate dateNaissance, double salaire) {
        super(nom, prenom, dateNaissance);
        this.salaire = salaire;
    }

    public double getSalaire() { return salaire; }
    public void setSalaire(double salaire) { this.salaire = salaire; }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Salaire : " + salaire);
    }
}