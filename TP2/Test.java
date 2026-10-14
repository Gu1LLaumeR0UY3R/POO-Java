package TP2;

public class Test {
    public static void main(String[] args) {
        Voiture v1 = new Voiture(2022, 18000);
        Voiture v2 = new Voiture(2020, 12500);
        Camion c1 = new Camion(2019, 45000);

        System.out.println(v1);
        v1.demarrer();
        v1.accelerer();

        System.out.println(v2);
        v2.demarrer();
        v2.accelerer();

        System.out.println(c1);
        c1.demarrer();
        c1.accelerer();

        // Polymorphisme : tableau de Vehicule
        Vehicule[] parc = { v1, v2, c1 };
        System.out.println("===== Parc auto =====");
            for (Vehicule v : parc) {
                System.out.println(v);
                v.demarrer();
        }
    }
}