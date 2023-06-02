package _4_com.RitikCoder.OtherJavaFiles;

import java.util.Scanner;

public class TakingIntergerInput {
    public static void main(String[] args) {
        System.out.println("Taking Integer type input form the User.");

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your first number :- ");
        int a= sc.nextInt();
        System.out.print("Enter your second number :- ");
        int b= sc.nextInt();
        System.out.print("Enter your Third number :- ");
        int c= sc.nextInt();
        System.out.println("Addition of your Entered numbers is :- "+ (a+ b+ c));
    }
}
