package ex8;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("entrer le nbr des lignes : ");
        int nbr=sc.nextInt();
        for (int i = 1; i <= nbr; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
