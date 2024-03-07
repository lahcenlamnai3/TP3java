package TP1;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          /*Exercice 3 :
        Écrire un programme qui saisit deux entiers a et b et permute la valeur de ces deux entiers.
       */
        // solution :

        int a,b,c ;
        System.out.println("donner 2 nombres entiers : ");
        System.out.println("a = ");
        a=sc.nextInt();
        System.out.println("b = ");
        b= sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("apres la convertion ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
