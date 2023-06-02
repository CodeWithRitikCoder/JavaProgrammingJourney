package _4_com.RitikCoder;

import java.util.Scanner;

class AdditionOfN_Numbers{
    public int AddRecursion(int n){
        if(n== 0){
            return (0);
        }else{
            return (n+ AddRecursion(n- 1));
        }
    }
}
public class RecursionInJava {
    public static void main(String[] args) {
        System.out.println("Here I'm using Recursion in Java.");

        AdditionOfN_Numbers additionOfNNumbers= new AdditionOfN_Numbers();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Number here :- ");
        int n= sc.nextInt();
        System.out.println(additionOfNNumbers.AddRecursion(n));
    }
}
