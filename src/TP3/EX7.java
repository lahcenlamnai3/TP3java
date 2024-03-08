package TP3;

import java.util.Scanner;

public class EX7{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int tailleTableau = scanner.nextInt();

        // 2. Créer un objet tableau avec la taille entrée par l'utilisateur
        int[] tableau = new int[tailleTableau];

        // 3. Demander à l'utilisateur de remplir le tableau
        System.out.println("Remplissez le tableau avec des valeurs :");
        for (int i = 0; i < tailleTableau; i++) {
            System.out.print("T[" + i + "] = ");
            tableau[i] = scanner.nextInt();
        }

        // Afficher le tableau
        System.out.println("Tableau rempli :");
        afficherTableau(tableau);
    }

    static void afficherTableau(int[] tableau) {
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println();
    }
}


