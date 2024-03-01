package TP2;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Exercice 2 :
        Calculez par multiplications successives X^N de deux entiers naturels X et N entrés au clavier
         */
        //SOLUTION
        System.out.print("Entrez la valeur de X : ");
        int x = sc.nextInt();
        System.out.print("Entrez la valeur de N : ");
        int n = sc.nextInt();
        long resultat=1;
        for (int i=0 ; i<n ; i++){
            resultat *=x;
        }
        System.out.println(x + " ^ " + n + " = " + resultat);
    }
}
