package ex4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner le nbr de repetition de votre phrase : ");
        int nbr = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Donner une phrase a repeter : ");
        String phrase = sc.nextLine();
        for (int i = 0; i < nbr; i++) {
            System.out.println(phrase);
        }
}}
