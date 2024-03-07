package TP1;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Exercice 4 :
         Écrire un programme qui saisit un réel x et un entier n et affiche x à la puissance n.
         */
        // solution :

        System.out.println("donner un nbr reel  : ");
        System.out.println("x = ");
        float x=sc.nextFloat();
        System.out.println("donner un nbr entier : ");
        System.out.println("n = ");
        int n= sc.nextInt();
        float p=(float) Math.pow(x,n);
        System.out.println("la puissance de x par n est : "+p);
    }
}
