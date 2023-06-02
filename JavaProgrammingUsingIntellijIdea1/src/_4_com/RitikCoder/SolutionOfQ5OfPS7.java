//5. Write a Method to print nth term of Fibonacci series using Recursion.
package _4_com.RitikCoder;

import java.util.Scanner;

public class SolutionOfQ5OfPS7 {
    static int fibSeriesMethod(int n){
        if(n<= 2 && n> 0){
            return(1);
        }else if (n== 0){
            return(0);
        }
        return(fibSeriesMethod(n- 2)+ fibSeriesMethod(n- 1));
    }
    public static void main(String[] args) {
        System.out.println("Solution Of Q-5 Of PS-7");
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter index of fib series : ");
        int n= scanner.nextInt();
        System.out.println("The nth index of fib series is : "+ fibSeriesMethod(n));

    }
}
