package TP2;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Exercice 3 :
        Calculez la somme des N premiers termes de la série harmonique :
        1 + 1/2 + 1/3 + ... + 1/N
         */
        float sumh=0;
        System.out.println("donner la valeur de N : ");
        int N = sc.nextInt();
        for (int i=1; i<=N ; i++){
            sumh +=(float) 1/i;
        }
        System.out.println("la somme des "+N +"premiers termes de la série harmonique est :"+sumh);

    }
}
