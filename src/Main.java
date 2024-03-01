import java.util.Scanner;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* Exercice 1 :
        Écrire un programme dont lequel vous déclarer et
        initialisez un tableau puis vous affichez les éléments du tableau

        */
        //solution
        /*
        String[] tab ={"lahcen","lamnai","gtr"};
        for(int i=0 ; i< tab.length;i++)
            System.out.println(tab[i]);

         */
        /*
        Exercice 2 :
        Écrire un programme qui demande à l’utilisateur de de déclarer
         un tableau de 10 éléments, puis remplir le tableau et l’afficher
      */
        //solution
        /*
        System.out.println("entrer la taille de tableau : ");
        int n = sc.nextInt();
        int[] tab = new int[n];
        int k =0;
        System.out.println("remplir le tablesu : ");
        while(k< tab.length){
            System.out.println("val "+(k+1) +" ");
            tab[k] = sc.nextInt();                   // si k de type byte alors k=K+1 erroné
            k=k+1;
        }
        int i =0;
        while (i< tab.length){
            System.out.print(tab[i]+" ");
            i+=1;
        }
         */
        /*Exercice 3 :
        Écrire un programme qui lit la taille N d'un tableau T du type int (dimension maximale:
        50 vérifier la taille et demandez à l’utilisateur de saisir la taille tant que la valeur n’est pas comprise entre 10 et 50),
        remplit le tableau par des valeurs entrées au clavier et l’afficher.
         */
       /*int taille;
        do{
            System.out.println("enter la taille d'un tableau: ");
            taille = sc.nextInt();
        }while (taille < 10 || taille > 50);
        int[] T = new int[taille];
        for (int i=0;i< T.length;i++){
            System.out.println("val "+(i+1));
            T[i]= sc.nextInt();
        }
//       for (int i=0;i< T.length;i++) {
//            System.out.print(T[i] + " ");
//        }
//
        //System.out.println(Arrays.toString(T));//Arrays.fill(tableau, 0); //pour effacer le contenu
        */
          /*
          Exercice 5 :
  Écrire un programme qui lit la taille N d'un tableau T du type int ,
 remplit le tableau par des valeurs entrées au clavier et affiche le tableau.
 Ranger ensuite les éléments du tableau T dans l'ordre inverse sans utiliser de tableau d'aide.
  Afficher le tableau résultant.

           */
        int n;
        do {
            System.out.println("donner la taille d'un tableau : ");
            n= sc.nextInt();
        }while (n<0);
        int[] T=new int[n];
        System.out.println("remplir votre tableau ");
        for (int i=0 ; i< T.length ;i++){
            System.out.println("val "+(i+1));
            T[i]=sc.nextInt();
        }
        for (int i=0 , int j=T.length;i< T.length , j>0 ; i++){
            for(int j= T.length; j>0 ; j--){
                T[j-1]=T[i];
            }
        }
        for (int i=0 ; i< T.length ;i++){
            System.out.print(T[i]+" ");
        }



















    }
}