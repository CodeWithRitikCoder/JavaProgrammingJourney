//Use a built-in package in java to write a class which display a message (by using sout) after taking input from the user.

package _4_com.RitikCoder;

import java.util.Scanner;

public class SolutionOfQ2OfPS12 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-2 Of PS-12");

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter your name here: ");
        String name= scanner.nextLine();

        System.out.println("Hello : "+ name);

    }
}
