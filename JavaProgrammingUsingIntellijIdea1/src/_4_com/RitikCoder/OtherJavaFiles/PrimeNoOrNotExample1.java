package _4_com.RitikCoder.OtherJavaFiles;

import java.util.Scanner;

public class PrimeNoOrNotExample1 {
    public static void main(String[] args) {
        System.out.println("Example 1 to Check a number is Prime or not.");

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Number here :- ");
        int n= sc.nextInt();
        int i;
        for(i= 2; i< n; i++){
            if(n% i== 0){
                break;
            }
        }
        if(n== i){
            System.out.println("Entered No is prime.");
        }else{
            System.out.println("Entered No is not prime.");
        }
    }
}
