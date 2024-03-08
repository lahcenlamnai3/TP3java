package TP3;

import java.util.Arrays;
import java.util.Scanner;

public class EX7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // 2. Créer un objet tableau avec la taille entrée par l'utilisateur
        int[] tableau = new int[taille];

        // 3. Demander à l'utilisateur de remplir le tableau
        System.out.println("Remplissez le tableau avec des valeurs :");
        for (int i = 0; i < taille; i++) {
            System.out.print("tableau[" + i + "] = ");
            tableau[i] = scanner.nextInt();
        }

        // 4. Calculer la somme des éléments saisis
        int somme = calculerSomme(tableau);
        System.out.println("Somme des éléments du tableau : " + somme);

        // 5. Calculer la moyenne des éléments
        double moyenne = calculerMoyenne(tableau);
        System.out.println("Moyenne des éléments du tableau : " + moyenne);

        // 6. Copier le tableau dans un deuxième tableau T2 et l'afficher
        int[] T2 = copierTableau(tableau);
        System.out.println("Tableau T2 (copie du tableau original) :");
        afficherTableau(T2);

        // 7. Classer les éléments du tableau dans un ordre croissant
        Arrays.sort(tableau);
        System.out.println("Tableau original après classement croissant :");
        afficherTableau(tableau);
    }

    static int calculerSomme(int[] tableau) {
        int somme = 0;
        for (int valeur : tableau) {
            somme += valeur;
        }
        return somme;
    }

    static double calculerMoyenne(int[] tableau) {
        if (tableau.length == 0) {
            return 0.0;
        }
        int somme = calculerSomme(tableau);
        return (double) somme / tableau.length;
    }

    static int[] copierTableau(int[] tableau) {
        return Arrays.copyOf(tableau, tableau.length);
    }

    static void afficherTableau(int[] tableau) {
        for (int valeur : tableau) {
            System.out.print(valeur + "\t");
        }
        System.out.println();
    }
}



