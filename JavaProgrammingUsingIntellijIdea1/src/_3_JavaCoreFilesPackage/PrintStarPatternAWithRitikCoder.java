package _3_JavaCoreFilesPackage;//Code a Software to print Star Pattern (A) using for loop in Java with RitikCoder.
//Package import section is here...
import java.util.Scanner;

public class PrintStarPatternAWithRitikCoder {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("\t\t\t Welcome to Java Programming with RitikCoder.");
            int rows, i, j;
            System.out.print("Enter your Rows here = ");
            rows= sc.nextInt();

            for(i= 1; i<= rows; i++){
                for(j= 1; j<= i; j++){
                    System.out.println(" * ");
                }
                System.out.print("\n");
            }
        }
}