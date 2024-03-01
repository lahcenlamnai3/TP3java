package TP2;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* Exercice 1 :
        Écrivez un programme qui lit N nombres entiers au clavier et qui affiche leur somme,
        leur produit et leur moyenne. Choisissez un type approprié pour les valeurs à afficher. Le nombre N est à entrer au clavier.
         Résolvez ce problème
•	En utilisant while,
•	En utilisant do - while,
•	En utilisant for.

        */
        //SOLUTION :
        byte sum=0 , p=1 , n, i;
        int k=0;
        System.out.println("donner la valeur de n  : ");
        n = sc.nextByte();
        do{
            System.out.println("donner un nombre entier ");
            i = sc.nextByte();
            sum +=i;
            p *=i;
            k = k+1;
        }while (k<n);
        System.out.println("la sommes de ces nombres est  : "+sum);
        System.out.println("le produit des ces nombres est : "+p);

    }
}
