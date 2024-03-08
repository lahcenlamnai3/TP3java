package TP2;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*
       Exercice 6
 Écrire un programme qui teste si un nombre est premier ou pas,
 puis un programme qui teste tous les nombres entre 1 et N
        */

        // Programme pour tester si un nombre est premier :
       /* System.out.print("Entrez un nombre : ");
        int nombre = sc.nextInt();

        if (estPremier(nombre)) {
            System.out.println(nombre + " est un nombre premier.");
        } else {
            System.out.println(nombre + " n'est pas un nombre premier.");
        }

        */
        // Programme pour tester tous les nombres entre 1 et N :
        System.out.print("Entrez la valeur de N : ");
        int N = sc.nextInt();

        System.out.println("Nombres premiers entre 1 et " + N + " :");
        for (int i = 2; i <= N; i++) {
            if (estPremier(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean estPremier(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

