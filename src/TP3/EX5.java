package TP3;

import java.util.Scanner;

public class EX5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int N = scanner.nextInt();

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

        // Inverser les éléments du tableau sans utiliser de tableau d'aide
        inverserTableau(T);

        // Afficher le tableau résultant
        System.out.println("Tableau après inversion :");
        afficherTableau(T);
    }

    static void inverserTableau(int[] tableau) {
        int debut = 0;
        int fin = tableau.length - 1;

        while (debut < fin) {
            // Échanger les éléments aux positions debut et fin
            int temp = tableau[debut];
            tableau[debut] = tableau[fin];
            tableau[fin] = temp;

            // Déplacer les indices debut et fin
            debut++;
            fin--;
        }
    }

    static void afficherTableau(int[] tableau) {
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println();
    }
}
