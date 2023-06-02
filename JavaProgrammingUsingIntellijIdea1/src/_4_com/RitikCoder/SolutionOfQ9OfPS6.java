//Write a Java program to find whether an array is Sorted or not.
package _4_com.RitikCoder;

public class SolutionOfQ9OfPS6 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q9 Of PS6");

        int []arr= {8, 10, 11, 55, 64};
        boolean isArraySorted= false;
        for(int i= 0; i< arr.length-1; i++){
            if(arr[i]> arr[i+ 1]){
                isArraySorted= true;
                break;
            }
        }
        if(isArraySorted){
            System.out.println("Array is not Sorted.");
        }else{
            System.out.println("Array is Sorted.");
        }
    }
}
