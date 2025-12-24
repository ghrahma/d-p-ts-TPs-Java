package ex5;

import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donner l'entier a faire le factoriel : ");
        int nbr = sc.nextInt();
        int res=1;
        if (nbr==0)
        {res=1;}
        else{
            for (int i = 1; i <= nbr; i++) {
            res*=i;
            }
        }
        System.out.println(nbr+"!="+res);
        
        
    }
}
