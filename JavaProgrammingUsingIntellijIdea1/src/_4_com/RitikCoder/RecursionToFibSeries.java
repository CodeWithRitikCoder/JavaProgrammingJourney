package _4_com.RitikCoder;

public class RecursionToFibSeries {
    static int fibMethod(int n){
        if(n<= 2){
            return (1);
        }
        return (fibMethod(n- 2)+ fibMethod(n- 1));
    }
    public static void main(String[] args) {
        System.out.println("Here I'm Calculating Fib Series using Recursion");
        System.out.println("The fib series at the 5th index is : "+ fibMethod(6));

    }
}
