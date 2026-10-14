package TP1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Personne[] tab = new Personne[8];

        // 5 employés
        tab[0] = new Employe("Martin", "Paul", LocalDate.of(1990, 3, 12), 2100);
        tab[1] = new Employe("Durand", "Lucie", LocalDate.of(1995, 7, 25), 2250);
        tab[2] = new Employe("Petit", "Hugo", LocalDate.of(1988, 11, 2), 2000);
        tab[3] = new Employe("Moreau", "Emma", LocalDate.of(1992, 1, 18), 2300);
        tab[4] = new Employe("Simon", "Louis", LocalDate.of(1998, 9, 30), 1950);

        // 2 chefs
        tab[5] = new Chef("Laurent", "Julie", LocalDate.of(1983, 5, 8), 3200, "Informatique");
        tab[6] = new Chef("Michel", "Marc", LocalDate.of(1980, 12, 14), 3400, "Comptabilité");

        // 1 directeur
        tab[7] = new Directeur("Garcia", "Sophie", LocalDate.of(1975, 4, 21), 5500, "Direction", "TechCorp");

        System.out.println("===== Affichage avec for =====");
        for (int i = 0; i < tab.length; i++) {
            tab[i].afficher();
            System.out.println("-----");
        }

        System.out.println("===== Affichage avec foreach =====");
        for (Personne p : tab) {
            p.afficher();
            System.out.println("-----");
        }
    }
}