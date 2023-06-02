//For Each loop in java to accessing the elements of an array.
package _4_com.RitikCoder;

public class ForEachLoopInJava {
    public static void main(String[] args) {
        System.out.println("For Each Loop In Java");

        int []arr= {23, 31, 22, 5, 67};
        for(int elements: arr){
            System.out.println(elements);
        }
        System.out.println("Length of an array :- "+ arr.length);
    }
}
