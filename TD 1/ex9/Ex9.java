package ex9;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // sc.nextLine(); 

        System.out.print("Donner l'entier 1 : ");
        String x1 = sc.nextLine();
        System.out.print("Donner l'entier 2 : ");
        String x2 = sc.nextLine();
        int a1=Integer.parseInt(x1);
        int a2=Integer.parseInt(x2);
        System.out.println(x1+"*"+x2+"="+a1*a2);
    }
}
