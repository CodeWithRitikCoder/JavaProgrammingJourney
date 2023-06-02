//Creation of 3-D array with initialization using naive way in java.
package _4_com.RitikCoder;

public class _3D_Array1InJava {
    public static void main(String[] args) {
        System.out.println("3D Array In Java");

        int [][][]arr= new int[2][3][3];

        arr[0][0][0]= 1;
        arr[0][0][1]= 0;
        arr[0][0][2]= 2;

        arr[0][1][0]= 9;
        arr[0][1][1]= 3;
        arr[0][1][2]= 8;

        arr[0][2][0]= 4;
        arr[0][2][1]= 7;
        arr[0][2][2]= 5;

        arr[1][0][0]= 21;
        arr[1][0][1]= 90;
        arr[1][0][2]= 32;

        arr[1][1][0]= 89;
        arr[1][1][1]= 43;
        arr[1][1][2]= 78;

        arr[1][2][0]= 54;
        arr[1][2][1]= 67;
        arr[1][2][2]= 65;

        for(int i= 0; i<= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                for(int k= 0; k<= 2; k++){
                    System.out.print(" "+ arr[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
