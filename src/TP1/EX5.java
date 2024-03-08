package TP1;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
     /*
        Exercice 5 :
        Écrire un programme retournant la factorielle d’un nombre entier entré
         par l’utilisateur.
      */

//solution :
        Scanner sc = new Scanner(System.in);
        System.out.println("donner un nbr entier : ");
        System.out.println("n = ");
        int n = sc.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println("le factoriel de " + n + "est : " + f);
    }
}