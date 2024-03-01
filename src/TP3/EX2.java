package TP3;
import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   /*
        Exercice 2 :
        Écrire un programme qui demande à l’utilisateur de de déclarer
         un tableau de 10 éléments, puis remplir le tableau et l’afficher
      */
        //solution

        System.out.println("entrer la taille de tableau : ");
        int n = sc.nextInt();
        int[] tab = new int[n];
        int k = 0;
        System.out.println("remplir le tablesu : ");
        while (k < tab.length) {
            System.out.println("val " + (k + 1) + " ");
            tab[k] = sc.nextInt();                   // si k de type byte alors k=K+1 erroné
            k = k + 1;
        }
        int i = 0;
        while (i < tab.length) {
            System.out.print(tab[i] + " ");
            i += 1;
        }
    }}