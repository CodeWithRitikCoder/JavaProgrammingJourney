package _3_JavaCoreFilesPackage;//Code a software to solve Question No.4 of Practice Set No.1 in Java with RitikCoder.
import java.util.Scanner;
public class QuestionNo4OfPracticeSetNo1InJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Solution of Question No.4 of Practice set No.1 in Java.");
        /*Code a software to convert kilo meters to miles.*/
        Scanner sc= new Scanner(System.in);
        float kilometer, mile= 0.621371f;
        System.out.format("Enter your Kilo meters here = ");
        kilometer= sc.nextFloat();
        System.out.println("This is your kilo meters to miles comversion = "+ (kilometer* mile));
    }
}