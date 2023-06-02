//Write a program to print first N natural numbers in reverse order using while loop in Java.
package _4_com.RitikCoder;

import java.util.Scanner;

public class ExerciseNo7InJava {
    public static void main(String[] args) {
        System.out.println("Exercise No7 In Java");

//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter your Number here :- ");
//        int n= sc.nextInt(), i= n;
//        while(i>= 1){
//            System.out.println(i);
//            i--;

            for(int i= 1; i<= 4; i++){
                for(int j= i; j<= 4; j++){
                    System.out.print(" *");
                }
                System.out.println();
        }
    }
}
