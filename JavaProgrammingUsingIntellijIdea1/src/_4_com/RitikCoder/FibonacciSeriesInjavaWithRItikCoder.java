package _4_com.RitikCoder;

import java.util.Scanner;

class fibonacciSeries{
    public int fibRecursion(int n){
        if(n== 1 || n== 2){
            return (n- 1);
        }else{
            return (fibRecursion(n- 1)+ fibRecursion(n-2));
        }
    }
}

public class FibonacciSeriesInjavaWithRItikCoder {

    //We can also print fib series from here, and can also from other class. there is no any problem. while using both methods.
//    static int fibRecursion(int n){
//        if(n== 1 || n== 2){
//            return (n- 1);
//        }else{
//            return (fibRecursion(n- 1)+ fibRecursion(n- 2));
//        }
//    }

    public static void main(String[] args) {
        System.out.println("Printf fibonacci series of N number.");
        Scanner sc= new Scanner(System.in);
        System.out.format("Enter your number here to find out fib series = ");
        int n= sc.nextInt();
//        System.out.println("This is your fib series at "+ n +" indexing = "+ fibRecursion(n));
        fibonacciSeries fS= new fibonacciSeries();
        System.out.println("This is your fib series at "+ n +" indexing = "+ fS.fibRecursion(n));
    }
}
