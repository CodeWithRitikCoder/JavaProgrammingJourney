package _4_com.RitikCoder;

import java.util.Scanner;

public class EnhanceSwitchCase {
    public static void main(String[] args) {
        System.out.println("Enhance Switch case in Java");

        int bookNo;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Book number :- ");
        bookNo= sc.nextInt();
        switch(bookNo){
            case 1-> System.out.println("C Programming");
            case 2-> System.out.println("C++ Programming");
            case 3-> System.out.println("Java Technology.");
            case 4-> System.out.println("Android Development.");
            default -> System.out.println("Invalid choice.");
        }
    }
}
