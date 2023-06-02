package _4_com.RitikCoder;

public class RecursionToFactorial {
    static int method1(int n){
        if(n== 1){
            return(1);
        }else {
            return (n* method1(n- 1));
        }
    }
    public static void main(String[] args) {
        System.out.println("Her I'm using Recursive Method to Calculate factorial of N number.");
        System.out.println("The factorial of 5 is : "+ method1(5));

    }
}
