package _3_JavaCoreFilesPackage;

//Code a software to implement 1 - D Array in java program with RitikCoder.
public class ArrayInJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("\t1-D Array program in Java.");
        int [] marks1= {10, 20, 30, 40, 50, 60};//first method to create an Array with memory allocation in java.
        //printing of an Array elements
        System.out.println("Printing of an Array elements created by first method.");
        for(int i= 0; i<= 4; i++) {
            System.out.format(marks1[i] + " ");
        }
        int [] marks2= new int[5];//second method
        marks2[0]= 11;//second method
        marks2[1]= 22;//second method
        marks2[2]= 33;//second method
        marks2[3]= 44;//second method
        marks2[4]= 55;//second method to create an Array with memory allocation in java.
        //printing of an Array elements created by second method.
        System.out.println("\nPrinting of an Array elements created by second method.");
        for(int j= 0; j<=4; j++){
            System.out.format(marks2[j]+ " ");
        }
        int [] marks3;//third method
        marks3= new int[5];//third method
        marks3[0]= 100;//third method
        marks3[1]= 200;//third method
        marks3[2]= 300;//third method
        marks3[3]= 400;//third method
        marks3[4]= 500;//third method to create an Array with memory allocation in java.
        //printing of an Array elements created by third method.
        System.out.println("\nPrinting of an Array elements created by third method.");
        for(int k= 0; k<=4; k++){
            System.out.format(marks3[k]+ " ");
        }
    }
}
