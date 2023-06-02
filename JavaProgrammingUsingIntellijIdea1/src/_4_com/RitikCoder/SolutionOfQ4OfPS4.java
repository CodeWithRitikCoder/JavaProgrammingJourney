//Write a program to find out the day of the weak given the number [ 1 for Monday, 2 for Tuesday, …………………. ]
        package _4_com.RitikCoder;

import java.util.Scanner;

public class SolutionOfQ4OfPS4 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q4 Of PS4");

        int day;
        Scanner sc= new Scanner(System.in);
        System.out.print("Select your number :- ");
        day= sc.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid choice. try again.");
        }
    }
}
