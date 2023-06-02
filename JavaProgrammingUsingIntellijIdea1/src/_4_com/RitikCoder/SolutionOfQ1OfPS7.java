package _4_com.RitikCoder;

import java.util.Scanner;

public class SolutionOfQ1OfPS7 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q1 Of PS7");
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number here to get Table : ");
        int n= scanner.nextInt();
        for(int i= 1; i<= 10; i++){
            System.out.println(n+ " x "+ i+ " = "+ (i* n));
        }

    }
}
