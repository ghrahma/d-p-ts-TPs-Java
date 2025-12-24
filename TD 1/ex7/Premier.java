package ex7;

import java.util.Scanner;

public class Premier {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("entrer l'entier a tester : ");
        int nbr=sc.nextInt();
        boolean test=true;
        for (int i = 2; i < nbr/2; i++) {
            if (nbr%i==0)
            {test=false;}
        }
        if (test==true)
        {System.out.println(nbr+" est premier");}
        if (test==false)
        {System.out.println(nbr+" n'est pas premier");}
    }
}
