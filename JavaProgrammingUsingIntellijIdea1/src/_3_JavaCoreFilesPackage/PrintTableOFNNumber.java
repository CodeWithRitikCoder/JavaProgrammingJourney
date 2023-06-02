package _3_JavaCoreFilesPackage;//Code a Software to print Table of (N) Number using loops with RitikCoder in Java.
//Package importing section is here..
import java.util.Scanner;

public class PrintTableOFNNumber {
    public static void main(String [] arguments){
        System.out.println("\t\t\tWelcome to Table Printing Software with RitikCoder in Java.");
        Scanner sc= new Scanner(System.in);
        System.out.print("\n\n\t\t Enter your (N) number to find out table = ");
        int tableNumber= sc.nextInt();
        for(int i= 1; i<= 10; i++){
            System.out.println(tableNumber+ " * "+ i +" = "+ i*tableNumber);
        }
    }
}