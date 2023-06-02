package _3_JavaCoreFilesPackage;//Code a software to solve Question No.3 of Practice Set No.1 in Java with RitikCoder.
import java.util.Scanner;
public class QuestionNo3OfPracticeSetNo1InJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Solution of Question No.3 of Practice set No.1 in Java.");
        /*Code a software which ask the user to enter his/her name and Greets them
         with “Hello <name>, have a good day” text.*/
        Scanner sc= new Scanner(System.in);
        System.out.format("Enter your name here = ");
        String name= new String(sc.nextLine());
        System.out.println("Hello "+ name+ ", Have a nice day.");
    }
}
