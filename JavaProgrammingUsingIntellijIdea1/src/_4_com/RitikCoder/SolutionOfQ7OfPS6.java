//Write a Java program to find the maximum elements in a Java array.
package _4_com.RitikCoder;

public class SolutionOfQ7OfPS6 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q7 Of PS6");

        int []arr= {23, 43, 11, 75, 64};
        int maximum= 0;
        for(int elements: arr){
            if(elements> maximum){
                maximum= elements;
            }
        }
        System.out.println("Maximum value in the array is :- "+ maximum);
    }
}
