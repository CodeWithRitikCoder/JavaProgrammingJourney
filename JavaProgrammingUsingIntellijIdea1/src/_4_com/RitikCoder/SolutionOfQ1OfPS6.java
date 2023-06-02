//Write a program to Create an Array to 5 floats and calculate their sum.
package _4_com.RitikCoder;

public class SolutionOfQ1OfPS6 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q1 Of PS6");

        float []arr= {2.3f, 23.4f, 54.30f, 8.2f, 23.4f};
        float sum= 0;
        for(int i= 0; i<= 4; i++){
            sum= sum+ arr[i];
        }
        System.out.println(sum);
    }
}
