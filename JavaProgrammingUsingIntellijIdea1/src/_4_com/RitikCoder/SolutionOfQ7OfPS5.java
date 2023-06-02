//Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
package _4_com.RitikCoder;

public class SolutionOfQ7OfPS5 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q7 Of PS5");

        int sum= 0;
        for(int i= 1; i<= 10; i++){
            sum= (sum+ (i* 8));
        }
        System.out.println("Sum of multiplication table of 8 :- "+ sum);
    }
}
