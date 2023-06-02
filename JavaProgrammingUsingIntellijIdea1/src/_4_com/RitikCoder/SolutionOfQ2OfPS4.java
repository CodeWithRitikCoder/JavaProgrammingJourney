//Write a program to find out whether a student is pass or fail; if it requires total 40% and at least
//     33% in each subject to pass Assume 3 subjects and take marks as an input from the user.
package _4_com.RitikCoder;

import java.util.Scanner;

public class SolutionOfQ2OfPS4 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q2 Of PS4");

        Scanner sc= new Scanner(System.in);
        byte sub1, sub2, sub3;
        System.out.print("Enter Maths marks :- ");
        sub1= sc.nextByte();
        System.out.print("Enter English marks :- ");
        sub2= sc.nextByte();
        System.out.print("Enter Computer marks :- ");
        sub3= sc.nextByte();
        float average= ((sub1+ sub2+ sub3)/ 3.0f);
        System.out.println("Your over all percentages is :- "+ average+ "%");
        if(average>= 40 && sub1>= 33 && sub2>= 33 && sub3>= 33){
            System.out.println("Congratulation your have been passed.");
        }else{
            System.out.println("Sorry! your have not been passed");
        }
    }
}

