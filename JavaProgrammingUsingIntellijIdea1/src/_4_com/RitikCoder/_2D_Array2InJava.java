package _4_com.RitikCoder;

import java.util.Scanner;

public class _2D_Array2InJava {
    public static void main(String[] args) {
        System.out.println("2D Array2 In Java");

        int [][]arr= new int[2][3];
        Scanner sc= new Scanner(System.in);

        //Assigning the 2-D array elements.
        for(int i= 0; i<= 1; i++){
            for(int j= 0; j<= 2; j++){
                System.out.print("Enter your "+ i+ ", "+ j+ " element No. :- ");
                arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }

        //Displaying the 2-D array elements.
        for(int i= 0; i<= 1; i++){
            for(int j= 0; j<= 2; j++){
                System.out.print(" "+ arr[i][j]);
            }
            System.out.println();
        }
    }
}
