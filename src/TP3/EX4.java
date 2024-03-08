package TP3;

import java.util.Scanner;

public class EX4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille du tableau entre 10 et 50
        int N;
        do {
            System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
            N = scanner.nextInt();
        } while (N < 10 || N > 50);

        // Créer le tableau T de taille N
        int[] T = new int[N];

        // Remplir le tableau avec des valeurs entrées au clavier
        System.out.println("Remplissez le tableau avec des valeurs :");
        for (int i = 0; i < N; i++) {
            System.out.print("T[" + i + "] = ");
            T[i] = scanner.nextInt();
        }

        // Afficher le tableau original
        System.out.println("Tableau original :");
        afficherTableau(T);

        // Effacer les occurrences de 5 et tasser les éléments restants
        effacerOccurrencesEtTasser(T);

        // Afficher le tableau résultant
        System.out.println("Tableau après effacement des occurrences de 5 et tassement :");
        afficherTableau(T);
    }

    static void effacerOccurrencesEtTasser(int[] tableau) {
        int nouvelleTaille = 0;

        // Effacer les occurrences de 5 et tasser les éléments restants
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] != 5) {
                tableau[nouvelleTaille] = tableau[i];
                nouvelleTaille++;
            }
        }

        // Réduire la taille du tableau
        int[] nouveauTableau = new int[nouvelleTaille];
        System.arraycopy(tableau, 0, nouveauTableau, 0, nouvelleTaille);
        System.arraycopy(nouveauTableau, 0, tableau, 0, nouvelleTaille);
    }

    static void afficherTableau(int[] tableau) {
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println();
    }
}

