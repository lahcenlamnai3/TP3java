package TP2;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         /*
      Exercice 4 :
        Affichez un triangle  formé d'étoiles de N lignes (N est fourni au clavier):
        Nombre de lignes : 5

         */ // Solution :
        System.out.println("Entrer le nombre des lignes : ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }}


