package _4_com.RitikCoder;

import java.util.Scanner;

public class FindOut1to100PrimeNumberWithTotal {
    public static void main(String[] args) {
        System.out.println("Find out 1 to 100 Prime Number With Total");

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any Number :- ");
        int n= sc.nextInt();
        for(int i= 2; i< n; i++){
            if(n% i== 0){
                break;
            }
            if(n== i){
                System.out.println();
            }
        }

    }
}
