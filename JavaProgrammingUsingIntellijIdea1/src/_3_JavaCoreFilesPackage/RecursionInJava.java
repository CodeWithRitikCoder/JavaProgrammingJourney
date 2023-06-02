package _3_JavaCoreFilesPackage;

import java.util.Scanner;

public class RecursionInJava {

    static int factorialRecursion(int n){

        //calculate factorial using for loop.
//        int fact= 1;
//        for(int i= 1; i<= n; i++){
//            fact= fact* i;
//        }
//        return(fact);

        //First recursive method to calculate factorial.
//        if(n== 0 || n== 1){
//            return(1);
//        }
//
//        int fact= factorialRecursion(n- 1);
//        return (n* fact);

        //Second recursive method to calculate factorial.
        if(n== 1 || n== 0){
            return (1);
        }else{
            return (n* factorialRecursion(n- 1));
        }

    }

    public static void main(String[] args) {
        System.out.println("Recursion in Java With RitikCoder.");

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number here :- ");
        int n= sc.nextInt();
        System.out.println(factorialRecursion(n));
    }
}
