package TP3;

import java.util.Scanner;

public class EX6{

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

        // Copier toutes les composantes strictement
        int[] copieTableau = copierTableau(T);

        // Afficher la copie du tableau
        System.out.println("Copie du tableau :");
        afficherTableau(copieTableau);
    }

    static int[] copierTableau(int[] original) {
        int[] copie = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copie[i] = original[i];
        }

        return copie;
    }

    static void afficherTableau(int[] tableau) {
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println();
    }
}

