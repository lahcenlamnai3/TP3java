package TP1_2;

import java.util.Scanner;

public class EX7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Demander l'âge de l'habitant
        System.out.print("Entrez l'âge : ");
        int age = scanner.nextInt();

        // Demander le sexe de l'habitant (M ou F)
        System.out.print("Entrez le sexe (M pour homme, F pour femme) : ");
        char sexe = scanner.next().charAt(0);

        // Vérifier si l'habitant est imposable
        boolean imposable = estImposable(age, sexe);

        // Afficher le résultat
        if (imposable) {
            System.out.println("L'habitant est imposable.");
        } else {
            System.out.println("L'habitant n'est pas imposable.");
        }
    }

    static boolean estImposable(int age, char sexe) {
        if (sexe == 'M') {
            // Les hommes de plus de 20 ans paient l'impôt
            return age > 20;
        } else if (sexe == 'F') {
            // Les femmes de 18 à 35 ans paient l'impôt
            return age >= 18 && age <= 35;
        } else {
            // Autres ne paient pas d'impôt
            return false;
        }
    }
}

