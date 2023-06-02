//Write a program to Create an Array to 5 integers and calculate their sum using for each loop.
package _4_com.RitikCoder;

public class SolutionOfQ2OfPS6 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q2 Of PS6");

        int  []arr= {22, 34, 54, 65, 11};
        int sum= 0;
        for(int elements: arr){
            sum= sum+ elements;
        }
        System.out.println(sum);
    }
}
