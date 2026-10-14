package TP3;

public class Main {
    public static void main(String[] args) {
        // Constructeur vide
        Batiment b1 = new Batiment();
        System.out.println(b1);

        // Constructeur avec adresse
        Batiment b2 = new Batiment("12 rue des Lilas, Brive");
        System.out.println(b2);

        // Modification via mutateur
        b1.setAdresse("5 avenue de Paris, Albi");
        System.out.println(b1);

        // Maison : constructeur vide
        Maison m1 = new Maison();
        System.out.println(m1);

        // Maison : constructeur complet
        Maison m2 = new Maison("8 chemin du Moulin, Castres", 5);
        System.out.println(m2);

        // Mutateurs + accesseurs
        m1.setAdresse("3 impasse des Roses, Tulle");
        m1.setNbPieces(4);
        System.out.println(m1);
        System.out.println("Pièces de m1 : " + m1.getNbPieces());

        // Polymorphisme
        Batiment b3 = m2;
        System.out.println(b3);   // toString de Maison appelé
    }
}
