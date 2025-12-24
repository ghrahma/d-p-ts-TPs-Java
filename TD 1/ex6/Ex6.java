package ex6;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer un entier: ");
        int nbr = sc.nextInt();
        int max=nbr;
        for (int i = 1; i < 6; i++) {
            System.out.print("Entrer un entier: ");
            nbr = sc.nextInt();
            if (nbr>max)
                max=nbr;
        }
        System.out.println("Max="+max);
    }
}
