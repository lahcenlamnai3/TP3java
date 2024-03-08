package TP1_2;

import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer un entier
        System.out.print("Entrez un entier positif supérieur à 1 : ");
        int n = scanner.nextInt();

        // Vérifier si le nombre est parfait
        if (estNombreParfait(n)) {
            System.out.println(n + " est un nombre parfait.");
        } else {
            System.out.println(n + " n'est pas un nombre parfait.");
        }
    }

    static boolean estNombreParfait(int nombre) {
        if (nombre <= 1) {
            return false; // On ne considère que les entiers positifs supérieurs à 1
        }

        int sommeDiviseurs = 1; // On initialise la somme à 1 car 1 est toujours diviseur

        // Parcourir les diviseurs potentiels jusqu'à la racine carrée du nombre
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                sommeDiviseurs += i;

                // Si les diviseurs sont différents, ajouter l'autre diviseur
                if (i != nombre / i) {
                    sommeDiviseurs += nombre / i;
                }
            }
        }

        // Vérifier si la somme des diviseurs est égale au nombre
        return sommeDiviseurs == nombre;
    }
}
