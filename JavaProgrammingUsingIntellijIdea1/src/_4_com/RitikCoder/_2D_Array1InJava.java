//Creation of 2-D array with initialization using naive way in java.
package _4_com.RitikCoder;

public class _2D_Array1InJava {
    public static void main(String[] args) {
        System.out.println("2-D Array In Java");

        int [][]arr= new int[2][3];

        arr[0][0]= 4;
        arr[0][1]= 2;
        arr[0][2]= 6;

        arr[1][0]= 8;
        arr[1][1]= 9;
        arr[1][2]= 1;

        for(int i= 0; i<= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(" "+ arr[i][j]);
            }
            System.out.println();
        }
    }
}
