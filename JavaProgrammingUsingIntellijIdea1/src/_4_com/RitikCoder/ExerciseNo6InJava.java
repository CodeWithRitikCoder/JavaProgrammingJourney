//Write a program to print first n Odd natural number in Java.
package _4_com.RitikCoder;

import java.util.Scanner;

public class ExerciseNo6InJava {
    public static void main(String[] args) {
        System.out.println("Exercise No6 In Java");

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number here :- ");
        int n= sc.nextInt();
        for(int i= 1; i<= n; i++){
            System.out.println((i* 2)- 1);



        }
    }
}
