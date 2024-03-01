package TP3;

import java.util.Arrays;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Exercice 3 :
        Écrire un programme qui lit la taille N d'un tableau T du type int (dimension maximale:
        50 vérifier la taille et demandez à l’utilisateur de saisir la taille tant que la valeur n’est pas comprise entre 10 et 50),
        remplit le tableau par des valeurs entrées au clavier et l’afficher.
         */
       int taille;
        do{
            System.out.println("enter la taille d'un tableau: ");
            taille = sc.nextInt();
        }while (taille < 10 || taille > 50);
        int[] T = new int[taille];
        for (int i=0;i< T.length;i++){
            System.out.println("val "+(i+1));
            T[i]= sc.nextInt();
        }
       for (int i=0;i< T.length;i++) {
            System.out.print(T[i] + " ");
        }
        System.out.println(" 11");
        Arrays.fill( T ,0,5,0);
        for (int i=0;i< T.length;i++) {
            System.out.print(T[i] + " ");
        }

    }
}
