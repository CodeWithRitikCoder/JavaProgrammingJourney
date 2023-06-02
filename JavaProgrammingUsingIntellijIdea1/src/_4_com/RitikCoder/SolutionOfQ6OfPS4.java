//Write a program to find out the type of website from the URL.
package _4_com.RitikCoder;

import java.util.Scanner;

public class SolutionOfQ6OfPS4 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q6 Of PS4");

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Website :- ");
        String website= sc.nextLine();
        if(website.endsWith(".com")) System.out.println("Commercial Website.");
        else if(website.endsWith(".org")) System.out.println("Organization Website.");
        else if(website.endsWith(".in")) System.out.println("Indian Website.");
        else System.out.println("Please enter only (.com), (.org) and (.in).");
    }
}
