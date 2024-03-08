package TP1;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Exercice 8 :
        Écrire un programme retournant le PGCD de 2 entiers entrés par l’utilisateur.

         */
        System.out.println("Veuillez entrer deux entiers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] tab_diviseur = new int[Math.min(num1, num2)+1];

        int k = 0;
        while (k < tab_diviseur.length) {
            tab_diviseur[k] = 0;
            k++;
        }
        for (int i = 1; i < Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                tab_diviseur[i ] = i;
            }
        }
        int max = tab_diviseur[0];
        for (int i = 0; i < tab_diviseur.length ; i++) {
            if (tab_diviseur[i] > max) {
                max = tab_diviseur[i];
            }
        }
        System.out.println("Le PGCD entre les deux nombres est " + max);
    }
}
