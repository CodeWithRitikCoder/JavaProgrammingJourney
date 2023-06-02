package _4_com.RitikCoder;

import java.util.Scanner;

public class PrimeNoOrNot {
    public static void main(String[] args) {
        System.out.println("Check Prime Number or not");

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter any Number :- ");
        int n= scanner.nextInt();
        int i;
        for(i= 2; i< n; i++) {
            if (n % i == 0) {
                break;
            }
            }
            if (n == i) {
                System.out.println("Number is prime.");
            } else {
                System.out.println("Number is not prime.");
            }

    }
}
