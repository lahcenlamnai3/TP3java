package TP3;


import java.util.Scanner;

public class EX8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Créer un tableau avec la taille entrée par l'utilisateur
        int[] tableau = new int[taille];

        // Remplir le tableau avec des valeurs entrées au clavier
        System.out.println("Remplissez le tableau avec des valeurs :");
        for (int i = 0; i < taille; i++) {
            System.out.print("tableau[" + i + "] = ");
            tableau[i] = scanner.nextInt();
        }

        // Calculer le plus grand écart dans le tableau
        int plusGrandEcart = calculerPlusGrandEcart(tableau);

        // Afficher le résultat
        System.out.println("Le plus grand écart dans le tableau est : " + plusGrandEcart);
    }

    static int calculerPlusGrandEcart(int[] tableau) {
        if (tableau.length < 2) {
            System.out.println("Le tableau doit avoir au moins deux éléments pour calculer l'écart.");
            return -1;
        }

        int plusGrandEcart = 0;

        for (int i = 1; i < tableau.length; i++) {
            int ecart = Math.abs(tableau[i] - tableau[i - 1]);
            if (ecart > plusGrandEcart) {
                plusGrandEcart = ecart;
            }
        }

        return plusGrandEcart;
    }
}
