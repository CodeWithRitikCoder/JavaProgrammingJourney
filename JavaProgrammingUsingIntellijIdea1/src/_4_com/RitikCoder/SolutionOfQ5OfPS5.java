//Write a program to find factorial of a given number N using for loop.
package _4_com.RitikCoder;

import java.util.Scanner;

public class SolutionOfQ5OfPS5 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q5 Of PS5");

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number here :- ");
        int n= sc.nextInt(), fact= 1;
        for(int i= 1; i<= n; i++){
            fact= (fact* i);
        }
        System.out.println("Factorial of given number :- "+ fact);
    }
}
