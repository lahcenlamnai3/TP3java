package TP1_2;
/*
Exercice 2 :
Écrire un programme qui demande à l’utilisateur d’entrer
une heure précise en demandant l’heure puis les minutes et affiche
l’heure qu’il sera une minute plus tard. Par exemple, si l'utilisateur tape 21 puis 32,
le programme doit répondre 21 heure(s) 33. Si l’utilisateur tape 23 puis 59,
la réponse doit alors être 0 heure 00. On considère que les valeurs entrées par l’utilisateur
 sont correctes.

 */
import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'heure (format 24 heures) : ");
        int heures = scanner.nextInt();
        System.out.print("Entrez les minutes : ");
        int minutes = scanner.nextInt();
        int[] heureSuivante = calculerHeureSuivante(heures, minutes);
        System.out.println("L'heure suivante sera : " + heureSuivante[0] + " heure(s) " + heureSuivante[1] + " minute(s).");
    }

    static int[] calculerHeureSuivante(int heures, int minutes) {
        minutes++;
        if (minutes == 60) {
            minutes = 0;
            heures++;
            if (heures == 24) {
                heures = 0;
            }
        }
        int[] heureSuivante = {heures, minutes};
        return heureSuivante;
    }
}

