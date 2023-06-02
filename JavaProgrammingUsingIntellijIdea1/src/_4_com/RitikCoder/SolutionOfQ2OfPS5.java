//Write a program to sum first N even numbers using while loop.
package _4_com.RitikCoder;

import java.util.Scanner;

public class SolutionOfQ2OfPS5 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q2 Of PS5");

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number here :- ");
        int n= sc.nextInt(), i= 1, sum= 0;
        while(i<= n){
            sum= sum+ (i* 2);
            i++;
        }
        System.out.println("Sum is :- "+ sum);
    }
}
