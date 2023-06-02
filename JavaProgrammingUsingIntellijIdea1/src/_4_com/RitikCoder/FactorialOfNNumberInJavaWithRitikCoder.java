package _4_com.RitikCoder;

import java.util.Scanner;
public class FactorialOfNNumberInJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Find Factorial of (N) number. in Java With RitikCoder.");
        Scanner sc= new Scanner(System.in);
        System.out.format("Enter your number here to find factorial = ");
        int n= sc.nextInt();

        //find out factorial of (N) number using First method
//        int fact= 1;
//        for(int i= 1; i<= n; i++){
//            fact= (fact* i);
//        }
//        System.out.println("Factorial of your entered number = "+ fact);

        //find out factorial of (N) number using Second method
//        int fact= 1;
//        for(int i= n; i>= 1; i--){
//            fact= (fact* i);
//        }
//        System.out.println("Factorial of your entered number = "+ fact);

        //find out factorial of (N) number using Third method
//        int fact= n;
//        for(int i= n- 1; i>= 1; i--){
//            fact= (fact* i);
//        }
//        System.out.println("Factorial of your entered number = "+ fact);

        //find out factorial of (N) number using Fourth method
        int fact= n;
        for(int i= n; i>= 1; i--){
            fact= (fact* i);
        }
        fact= fact/ n;
        System.out.println("Factorial of your entered number = "+ fact);
    }
}