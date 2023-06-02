package _4_com.RitikCoder;

import java.util.Scanner;

public class ArrayElements2 {
    public static void main(String[] args) {
        System.out.println("Array Elements");

        int []arr= new int[5];
        Scanner sc= new Scanner(System.in);

        for(int i= 0; i<= 4; i++){
            System.out.print("Enter "+ i+ "th element of array :- ");
            arr[i]= sc.nextInt();
        }
        System.out.println("Array elements");
        for(int i= 0; i<= 4; i++){
            System.out.println(arr[i]);
        }
    }
}
