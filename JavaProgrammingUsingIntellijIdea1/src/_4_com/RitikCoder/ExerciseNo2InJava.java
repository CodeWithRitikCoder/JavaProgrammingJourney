package _4_com.RitikCoder;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExerciseNo2InJava {
    public static void main(String[] args) {
        System.out.println("Exercise No. 2 in Java");
        int a, b;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your First number here :- ");
        a= sc.nextInt();
        System.out.print("Enter your second number here :- ");
        b= sc.nextInt();
        System.out.print("Multiply of "+ a+ " and "+ b+ " is :- "+ (a* b));
    }
}
