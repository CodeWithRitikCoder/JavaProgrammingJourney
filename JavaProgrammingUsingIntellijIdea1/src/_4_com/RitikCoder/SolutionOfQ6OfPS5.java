//Write a program to repeat “RitikCoder” N number of time using do while loop.
package _4_com.RitikCoder;

import java.util.Scanner;

public class SolutionOfQ6OfPS5 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q6 Of PS5");

        Scanner sc= new Scanner(System.in);
        int n, i= 1;
        System.out.print("Enter a number here :- ");
        n= sc.nextInt();
        do{
            System.out.println(i+ "- RitikCoder");
            i++;
        }while(i<= n);
    }
}
