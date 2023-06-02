package _4_com.RitikCoder.OtherJavaFiles;

import java.util.Scanner;

public class TakingStringInput {
    public static void main(String[] args) {
        System.out.println("Taking String Type input form the User.");

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name here :- ");
        String name= sc.nextLine();
        String uprCase;
        int length= name.length();
        uprCase= name.toUpperCase();
        System.out.println("Your Entered name is :- "+ name);
        System.out.println("This is the length of your string is :- "+ length);
        System.out.println("UPR_Case of your entered name is :- "+ uprCase);
    }
}
