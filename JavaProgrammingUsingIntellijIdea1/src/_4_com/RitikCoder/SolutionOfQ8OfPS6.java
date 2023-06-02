//Write a Java program to find the minimum elements in a Java array.
package _4_com.RitikCoder;

public class SolutionOfQ8OfPS6 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q8 Of PS6");

        int []arr= {53, 43, 11, 75, 64};
        int minimum= Integer.MAX_VALUE;
        for(int elements: arr){
            if(elements< minimum){
                minimum= elements;
            }
        }
        System.out.println("Maximum value in the array is :- "+ minimum);
    }
}
