//Write a program to calculate the average marks from an array containing marks of 5
//     students in physics using for-each loop.

package _4_com.RitikCoder;

public class SolutionOfQ4OfPS6 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q4 Of PS6");

        int []marksOfPhysic= {78, 85, 98, 88, 99};
        int sum= 0;
        for(int elements: marksOfPhysic){
            sum= sum+ elements;
        }
        System.out.println("Average is :- "+ sum/ marksOfPhysic.length);
    }
}
