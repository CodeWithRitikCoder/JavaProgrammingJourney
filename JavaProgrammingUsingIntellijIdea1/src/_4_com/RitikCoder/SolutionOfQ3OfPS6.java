//Write a program to find out whether a given integer is present in an Array or not.
package _4_com.RitikCoder;

import java.util.Scanner;

public class SolutionOfQ3OfPS6 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q3 Of PS6");

        Scanner sc= new Scanner(System.in);
        int []arr= {5, 10, 15, 20, 25};
        System.out.print("Enter your Number :- ");
        int n= sc.nextInt();
        boolean isInArray= false;
        for(int elements: arr){
            if(n== elements){
                isInArray= true;
                break;
            }
        }
        if(isInArray){
            System.out.println("Your Value is present in the Array.");
        }else{
            System.out.println("Your Value isn't present in the Array.");
        }
    }
}
