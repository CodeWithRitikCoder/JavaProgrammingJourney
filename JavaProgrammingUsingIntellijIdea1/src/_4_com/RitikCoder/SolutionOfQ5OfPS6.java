//Write a program to Add two matrices of size (2 X 3).
package _4_com.RitikCoder;

public class SolutionOfQ5OfPS6 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q5 Of PS6");

        int [][]matrix1= {{4, 3, 6},{8, 2, 5}};
        int [][]matrix2= {{3, 5, 4},{2, 2, 3}};
        int [][]matrix3= new int[2][3];

        for(int i= 0; i<= 1; i++){
            for(int j= 0; j<= 2; j++){
             matrix3[i][j]= matrix1[i][j]+ matrix2[i][j];
            }
        }
        for(int i= 0; i<= 1; i++){
            for(int j= 0; j<= 2; j++){
                System.out.print(" "+ matrix3[i][j]);
            }
            System.out.println();
        }
    }
}