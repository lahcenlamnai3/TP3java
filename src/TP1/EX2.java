package TP1;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Exercice 2 :
      Écrire un programme qui demande à l’utilisateur de donner le rayon d’un cercle
      et lui affiche sa surface et son périmètre.
         */
        // solution :

        final float pi = 3.14F ;
        System.out.println("donner le rayon d'une cercle :  ");
        float r= sc.nextFloat();
        System.out.println("la surface de cette cercle est "+(r*r*pi));
        System.out.println("le périmètre de cette cercle est : "+(2*pi*r));


    }
}
