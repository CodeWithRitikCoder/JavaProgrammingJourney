package _3_JavaCoreFilesPackage;//Code a software to Add two matrix using 2-D Array in java with RitikCoder.
//Importing statements.
import java.util.Scanner;
public class AddTwoMatrixUsing2_DArrayInJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Addition of two Matrix using 2-D Array in java with RitikCoder.");
        Scanner sc = new Scanner(System.in);
        int[][] matrixA = new int[3][3];
        int[][] matrixB = new int[3][3];
        int[][] matrixC = new int[3][3];
        System.out.format("Enter your nine element to first matrix is = ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                matrixA [i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter your  nine elements to second matrix is = ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                matrixB [i][j]= sc.nextInt();
            }
        }
        System.out.println("Addition of you matrixA [][]+ matrixB [][] is down bellow.");
        for(int m= 0; m<= 2; m++){
            for(int n= 0; n<= 2; n++){
                matrixC [m][n]= matrixA [m][n]+ matrixB [m][n];
                System.out.format(matrixC [m][n]+ " ");
            }
            System.out.println();
        }
    }
}
