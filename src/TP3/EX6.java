package TP3;

import java.util.Scanner;

import java.util.Scanner;

public class EX6 {

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

        // Créer les tableaux TP et TN
        int[] TP = copierPositifs(T);
        int[] TN = copierNegatifs(T);

        // Afficher les tableaux TP et TN
        System.out.println("Tableau des valeurs positives (TP) :");
        afficherTableau(TP);

        System.out.println("Tableau des valeurs négatives (TN) :");
        afficherTableau(TN);
    }

    static void afficherTableau(int[] tableau) {
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println();
    }

    static int[] copierPositifs(int[] tableau) {
        int countPositifs = 0;

        // Compter le nombre de composantes strictement positives
        for (int valeur : tableau) {
            if (valeur > 0) {
                countPositifs++;
            }
        }

        // Créer le tableau TP
        int[] TP = new int[countPositifs];
        int indexTP = 0;

        // Copier les composantes strictement positives
        for (int valeur : tableau) {
            if (valeur > 0) {
                TP[indexTP++] = valeur;
            }
        }

        return TP;
    }

    static int[] copierNegatifs(int[] tableau) {
        int countNegatifs = 0;

        // Compter le nombre de valeurs strictement négatives
        for (int valeur : tableau) {
            if (valeur < 0) {
                countNegatifs++;
            }
        }

        // Créer le tableau TN
        int[] TN = new int[countNegatifs];
        int indexTN = 0;

        // Copier les valeurs strictement négatives
        for (int valeur : tableau) {
            if (valeur < 0) {
                TN[indexTN++] = valeur;
            }
        }

        return TN;
    }
}
