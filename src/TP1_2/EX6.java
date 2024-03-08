package TP1_2;

import java.util.Scanner;

public class EX6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir le poids, la taille et le sexe de la personne
        System.out.print("Entrez le poids (en kg) : ");
        double poids = scanner.nextDouble();

        System.out.print("Entrez la taille (en m) : ");
        double taille = scanner.nextDouble();

        System.out.print("Entrez le sexe (F pour femme, M pour homme) : ");
        char sexe = scanner.next().charAt(0);

        // Calculer l'IMC
        double imc = calculerIMC(poids, taille);

        // Afficher l'IMC
        System.out.println("L'IMC est : " + imc);

        // Déterminer l'état de poids en fonction du sexe
        String etatPoids = determinerEtatPoids(imc, sexe);

        // Afficher l'état de poids
        System.out.println("État de poids : " + etatPoids);
    }

    static double calculerIMC(double poids, double taille) {
        return poids / (taille * taille);
    }

    static String determinerEtatPoids(double imc, char sexe) {
        if (sexe == 'F') {
            return determinerEtatPoidsFemme(imc);
        } else if (sexe == 'M') {
            return determinerEtatPoidsHomme(imc);
        } else {
            return "Sexe non valide.";
        }
    }

    static String determinerEtatPoidsFemme(double imc) {
        if (imc < 19) {
            return "Maigreur";
        } else if (imc >= 19 && imc <= 24) {
            return "Poids normal";
        } else if (imc >= 24 && imc <= 30) {
            return "Surcharge pondérale";
        } else if (imc >= 30 && imc <= 40) {
            return "Adiposité";
        } else {
            return "Obésité";
        }
    }
    static String determinerEtatPoidsHomme(double imc) {
        if (imc < 20) {
            return "Maigreur";
        } else if (imc >= 20 && imc <= 25) {
            return "Poids normal";
        } else if (imc >= 25 && imc <= 30) {
            return "Surcharge pondérale";
        } else if (imc >= 30 && imc <= 40) {
            return "Adiposité";
        } else {
            return "Obésité";
        }
    }
}
