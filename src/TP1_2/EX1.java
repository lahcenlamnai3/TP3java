package TP1_2;
/*
Exercice 1 :
Écrire un programme qui demande à l’utilisateur d’entrer un entier positif et ensuite d’afficher :
-	Les diviseurs de ce nombre.
-	Le nombre de ces diviseurs.
-	La somme de ces diviseurs

 */
import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer un entier positif
        System.out.print("Entrez un entier positif : ");
        int nombre = scanner.nextInt();

        if (nombre <= 0) {
            System.out.println("Veuillez entrer un entier positif.");
            return;
        }

        // Afficher les diviseurs du nombre
        System.out.println("Les diviseurs de " + nombre + " sont :");
        afficherDiviseurs(nombre);

        // Afficher le nombre de diviseurs
        System.out.println("Le nombre de diviseurs est : " + compterDiviseurs(nombre));

        // Afficher la somme des diviseurs
        System.out.println("La somme des diviseurs est : " + sommeDiviseurs(nombre));
    }

    static void afficherDiviseurs(int nombre) {
        for (int i = 1; i <= nombre; i++) {
            if (nombre % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static int compterDiviseurs(int nombre) {
        int compte = 0;
        for (int i = 1; i <= nombre; i++) {
            if (nombre % i == 0) {
                compte++;
            }
        }
        return compte;
    }

    static int sommeDiviseurs(int nombre) {
        int somme = 0;
        for (int i = 1; i <= nombre; i++) {
            if (nombre % i == 0) {
                somme += i;
            }
        }
        return somme;
    }
}
