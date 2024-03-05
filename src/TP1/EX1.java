package TP1;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Exercice 1 :
        Écrire un programme qui saisit 2 entiers et affiche successivement la somme,
         la différence, le produit et le quotient de ces 2 entiers.
     */
        int a,b ;
        System.out.println("donner 2 nombres entiers : ");
        System.out.println("a = ");
        a=sc.nextInt();
        System.out.println("b = ");
        b=sc.nextInt();
        System.out.println("a + B = "+(a+b));
        System.out.println("a - B = "+(a-b));
        System.out.println("a * B = "+(a*b));
        if(b!=0) {
            System.out.println("a / B = " + (a / b));
        }
        else
            System.out.println("la division par 0 est imposible !!");
    }
}
