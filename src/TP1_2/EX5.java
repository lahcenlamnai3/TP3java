package TP1_2;

import java.util.Scanner;

import java.util.Scanner;

public class EX5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclarer un tableau de 22 éléments pour les buts inscrits par les joueurs
        int[] butsParJoueur = new int[22];

        // Entrer le nombre de buts inscrits par chacun des joueurs
        for (int i = 0; i < 22; i++) {
            System.out.print("Entrez le nombre de buts inscrits par le joueur " + (i + 1) + " : ");
            butsParJoueur[i] = scanner.nextInt();
        }

        // Afficher le numéro du buteur de l'équipe
        int numeroButeur = trouverButeurMax(butsParJoueur);
        System.out.println("Le numéro du buteur de l'équipe est le joueur " + (numeroButeur + 1) + ".");

        // Afficher le nombre total des buts inscrits par l'équipe
        int totalButs = calculerTotalButs(butsParJoueur);
        System.out.println("Le nombre total des buts inscrits par l'équipe est : " + totalButs + " buts.");

        // Afficher le nombre des joueurs qui n'ont pas marqué de buts
        int joueursSansButs = compterJoueursSansButs(butsParJoueur);
        System.out.println("Le nombre de joueurs qui n'ont pas marqué de buts est : " + joueursSansButs + " joueurs.");

        // Mettre à jour le nombre de buts du joueur n°9
        mettreAJourButsJoueur(butsParJoueur, 9, 2);

        // Afficher le tableau mis à jour
        afficherTableau(butsParJoueur);
    }

    static int trouverButeurMax(int[] butsParJoueur) {
        int maxButs = 0;
        int numeroButeur = 0;

        for (int i = 0; i < butsParJoueur.length; i++) {
            if (butsParJoueur[i] > maxButs) {
                maxButs = butsParJoueur[i];
                numeroButeur = i;
            }
        }

        return numeroButeur;
    }

    static int calculerTotalButs(int[] butsParJoueur) {
        int totalButs = 0;

        for (int buts : butsParJoueur) {
            totalButs += buts;
        }

        return totalButs;
    }

    static int compterJoueursSansButs(int[] butsParJoueur) {
        int joueursSansButs = 0;

        for (int buts : butsParJoueur) {
            if (buts == 0) {
                joueursSansButs++;
            }
        }

        return joueursSansButs;
    }

    static void mettreAJourButsJoueur(int[] butsParJoueur, int numeroJoueur, int nouveauxButs) {
        // Vérifier que le numéro de joueur est valide
        if (numeroJoueur >= 1 && numeroJoueur <= butsParJoueur.length) {
            butsParJoueur[numeroJoueur - 1] = nouveauxButs;
        } else {
            System.out.println("Numéro de joueur invalide.");
        }
    }

    static void afficherTableau(int[] tableau) {
        System.out.println("Tableau mis à jour des buts par joueur :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Joueur " + (i + 1) + " : " + tableau[i] + " buts");
        }
    }
}
