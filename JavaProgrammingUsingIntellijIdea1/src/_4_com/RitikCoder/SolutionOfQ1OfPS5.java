//Write a program to print the following pattern.
//* * * *
//* * *
//* *
//*
package _4_com.RitikCoder;

public class SolutionOfQ1OfPS5 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q1 Of PS5");

        for(int i= 1; i<= 4; i++){
            for(int j= i; j<= 4; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
