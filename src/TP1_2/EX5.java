package TP1_2;

import java.util.Scanner;

public class EX5{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclarer un tableau pour stocker le nombre de buts de chaque joueur
        int[] butsParJoueur = new int[22];

        // Entrer le nombre de buts inscrits par chacun des joueurs
        for (int i = 0; i < 22; i++) {
            System.out.print("Entrer le nombre de buts du joueur " + (i + 1) + " : ");
            butsParJoueur[i] = scanner.nextInt();
        }

        // Afficher le nombre de buts inscrits par chaque joueur
        System.out.println("Nombre de buts inscrits par chaque joueur :");
        for (int i = 0; i < 22; i++) {
            System.out.println("Joueur " + (i + 1) + " : " + butsParJoueur[i] + " but(s)");
        }
    }
}
