//Calculate income tax paid by an employee to the government as per the slabs mentioned bellow.
package _4_com.RitikCoder;

import java.util.Scanner;

public class SolutionOfQ3OfPS4 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q3 Of PS4");

        float tax= 0, income;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your income here :- ");
        income= scanner.nextFloat();
        if(income<= 250000.0f){
            tax= tax+ 0.0f;
        }else if(income> 250000.0f && income<= 500000.0f){
            tax= tax+ (05.0f* (income- 250000.0f))/100;
        }else if(income> 500000.0f && income<= 1000000.0f){
            tax= tax+ (5.0f* (500000.0f- 250000.0f))/100;
            tax= tax+ (20.0f* (income- 500000.0f))/100;
        }else{
            tax= tax+ (5.0f* (500000.0f- 250000.0f))/100;
            tax= tax+ (20.0f* (1000000.0f- 500000.0f))/100;
            tax= tax+ (30.0f* (income- 1000000.0f))/100;
        }
        System.out.println(tax);
    }
}
