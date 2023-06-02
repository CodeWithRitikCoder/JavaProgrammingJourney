//7. Write a to repeat your name 5 times using Recursion.
package _4_com.RitikCoder;

import java.util.Scanner;

public class SolutionOfQ7OfPS7 {
    static void printMethod(int n){
        if(n>= 1){
            printMethod(n- 1);
            System.out.println("RitikCoder");
        }
    }
    public static void main(String[] args) {
        System.out.println("Solution Of Q-7 Of PS-7");
        Scanner sc= new Scanner(System.in);
        System.out.print("How many times do you want to print : ");
        int n= sc.nextInt();
        printMethod(n);

    }
}
