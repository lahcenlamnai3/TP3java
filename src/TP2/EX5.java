package TP2;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Exercice 5 :
     Écrire un programme qui calcule n! (factoriel)
     une fois avec un while puis une seconde fois avec un for.
         */
        int k=1;
        System.out.println("donner un nombre entier : ");
        int n = sc.nextInt();
        int factoriel= 1;
        while (k <= n){
            factoriel *=k;
            k++;
        }
        System.out.println("le factoriel est : "+factoriel);
    }
}
