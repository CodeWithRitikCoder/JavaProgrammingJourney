package _3_JavaCoreFilesPackage;

//Code a software to describe 2-D Array in java with RitikCoder.
public class MultidimentionalArray2_DArrayInJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("\t2-D Array in Java With RitikCoder.");
        //Creating of 2-D Array in java.
        int [][] arr1= new int[3][3];
        //Memory allocation of 2-D array.
        arr1[0][0]= 10;
        arr1[0][1]= 20;
        arr1[0][2]= 30;

        arr1[1][0]= 40;
        arr1[1][1]= 50;
        arr1[1][2]= 60;

        arr1[2][0]= 70;
        arr1[2][1]= 80;
        arr1[2][2]= 90;

        //printing of 2-D Array in java.
        for(int i= 0; i<= 2; i++){//printing an Array elements in froward order.
            for(int j= 0; j<= 2; j++){
                System.out.format(arr1[i][j]+ " ");
            }
        }
        System.out.println();
        for(int k= 2; k>= 0; k--){//printing an Array elements in reverse order.
            for(int l= 2; l>= 0; l--) {
                System.out.format(arr1[k][l] + " ");
            }
        }
        System.out.println();
        for(int i= 0; i<= 2; i++){//print some of arr1[0], arr1[1] block of an Array.
            System.out.format((arr1[0][i]+ arr1[1][i])+ " ");
        }
        System.out.println();
        for(int j= 0; j<= 2; j++){
            System.out.format((arr1[0][j]+ arr1[1][j]+ arr1[2][j])+ " ");
        }

    }
}
