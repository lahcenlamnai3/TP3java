package TP1;

import java.util.Scanner;
public class EX7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         /*
        Exercice 7 :
    Écrire un programme qui résout les équations du second degré (ax2 + bx + c = 0).
    Le programme demande a, b et c à l’utilisateur puis indique le nombre de solutions
    ainsi que leurs valeurs.
         */
       float a , b ,c , delta ;
        System.out.println("l'eq est sous forme de ax2 + bx + c = 0 ");
        System.out.println("donner les nombres a et b  : ");
        do {
            System.out.println("a = ");
            a = sc.nextFloat();
            if (a!=0)
                break;
        }while(a!=0);
        System.out.println("b = ");
        b = sc.nextFloat();
        System.out.println("donner la valeur de c : ");
        c= sc.nextFloat();
         delta = b*b - 4*a*c ;
        if(delta > 0){
            float srtd = (float) Math.sqrt(delta);
            float x1 = (-b + srtd )/2*a ;
            float x2 = (-b - srtd )/2*a ;
            System.out.println("l'eq admet 2 solution reels sont : "+ x1 +"et "+x2);
        } else if (delta == 0) {
            float x1 = -b/2*a ;
            System.out.println("l'eq admet une  solution reel est : "+ x1);
        }
        else
            System.out.println("eq n'admet aucun solution ");
    }
}
