package _4_com.RitikCoder;

import java.util.Scanner;

public class FindOutMinToMaxPrimeNumberWithTotal {
    public static void main(String[] args) {
        System.out.println("Find out Minimum to Maximum Prime number with Total.");

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Minimum Number :- ");
        int minimum= sc.nextInt();
        System.out.print("Enter your Maximum Number :- ");
        int maximum= sc.nextInt();
        int sum= 0, j;
        for(int i= minimum; i< maximum; i++){
            for(j= i; j< maximum; j++){
                if(i% j== 0){
                    break;
                }
            }
            if(j== i){
                System.out.println(" "+ i);
                sum= sum+ i;
            }
        }
        System.out.println("Sum is :- "+ sum);
    }
}
