package _4_com.RitikCoder;

import java.util.Scanner;

public class SolutionOfQ3Of_PS7 {
    static int sumMethod(int n){
        int x= n;
        if(n== 1) {
            return(1);
        }
        return(n+ sumMethod(n- 1));
    }
    public static void main(String[] args) {
        System.out.println("Solution Of Q-3 Of PS-7");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number here = ");
        int n= sc.nextInt();
        System.out.println("The sum of till the "+ n+ " is : "+ sumMethod(n));

    }
}
