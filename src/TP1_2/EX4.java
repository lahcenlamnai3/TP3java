package TP1_2;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier entier (n) : ");
        int n = scanner.nextInt();

        System.out.print("Entrez le deuxième entier (m) : ");
        int m = scanner.nextInt();
        if (sontAmis(n, m)) {
            System.out.println(n + " et " + m + " sont des nombres amis.");
        } else {
            System.out.println(n + " et " + m + " ne sont pas des nombres amis.");
        }
    }

    static boolean sontAmis(int n, int m) {
        int sommeDiviseursN = calculerSommeDiviseurs(n);
        int sommeDiviseursM = calculerSommeDiviseurs(m);
        return (sommeDiviseursN == m) && (sommeDiviseursM == n);
    }
    static int calculerSommeDiviseurs(int nombre) {
        if (nombre <= 1) {
            return 0;
        }

        int sommeDiviseurs = 1;

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

        return sommeDiviseurs;
    }
}
