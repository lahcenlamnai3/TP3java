package TP1;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         /*
        Exercice 6 :
        Écrire un programme qui résout les équations du premier degré (ax + b = 0).
        Le programme demande a et b  à l’utilisateur puis indique le nombre de solutions
         ainsi que leurs valeurs
         */
        //solution :
        Float a ;
        System.out.println("l'eq est sous forme de ax + b =0 ");
        System.out.println("donner premier nombre a : ");
        do {
            System.out.println("a = ");
            a = sc.nextFloat();
            if (a!=0)
                break;
        }while(a!=0);
        System.out.println("donner  seconde  nombre b: ");
        Float b= sc.nextFloat();
        System.out.println("la solution de l'eq est "+(-b/a));
    }
}
