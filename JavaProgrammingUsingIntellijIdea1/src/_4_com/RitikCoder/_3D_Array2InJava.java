package _4_com.RitikCoder;

import java.util.Scanner;

public class _3D_Array2InJava {
    public static void main(String[] args) {
        System.out.println("3D Array2 In Java");

        int [][][]arr= new int[2][3][3];
        Scanner sc= new Scanner(System.in);

        //Assigning the 2-D array elements.
        for(int i= 0; i<= 1; i++){
            for(int j= 0; j<= 2; j++){
                for(int k= 0; k<= 2; k++){
                    System.out.print("Enter your "+ i+ ", "+ j+ ", "+ k+ " element No. :- ");
                    arr[i][j][k]= sc.nextInt();
                }
            }
            System.out.println();
        }

        //Displaying the 2-D array elements.
        for(int i= 0; i<= 1; i++){
            for(int j= 0; j<= 2; j++){
                for(int k= 0; k<= 2; k++){
                    System.out.print(" "+ arr[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
