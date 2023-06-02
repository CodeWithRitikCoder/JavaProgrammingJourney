//Write a program to print multiplication table of a given number N.
package _4_com.RitikCoder;

import java.util.Scanner;

public class SolutionOfQ3OfPS5 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q3 Of PS5");

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number here :- ");
        int n= sc.nextInt();
        for(int i= 1; i<= 10; i++){
            System.out.println(n+ " x "+ i+ " = "+ (i* n));
        }
    }
}
