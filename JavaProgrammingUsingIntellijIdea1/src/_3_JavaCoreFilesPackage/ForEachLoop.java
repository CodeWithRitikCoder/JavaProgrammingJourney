package _3_JavaCoreFilesPackage;

public class ForEachLoop {
    public static void main(String[] args) {
        System.out.println("Here I am using for loop");
        int []arr= {12, 13, 14, 15, 16};

        //print of an array using for loop
        System.out.println("Printing of an array elements using for loop");
        for(int i= 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        //Printing of an array using for-each loop.
        System.out.println("Printing of an array elements using for-Each loop");
        for(int element: arr){
            System.out.println(element);
        }

        //Printing of an array elements in reverse order using for loop.
        System.out.println("Printing of an array elements in reverse order using for loop");
        for(int j= arr.length -1; j>= 0; j--){
            System.out.println(arr[j]);
        }
    }
}
