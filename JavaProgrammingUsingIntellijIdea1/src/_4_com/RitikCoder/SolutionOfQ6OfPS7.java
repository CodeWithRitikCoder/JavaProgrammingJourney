//6. Write a Method to find average of a set of numbers passed as arguments.
package _4_com.RitikCoder;

public class SolutionOfQ6OfPS7 {
    static int averageMethod(int ...arr){
        int sum= 0;
        for(int elements: arr){
            sum+= elements;
        }
        return(sum/arr.length);
    }
    public static void main(String[] args) {
        System.out.println("Solution Of Q-6 Of PS-7");
        System.out.println("The average of 200, 250, 400, 500 is : "+ averageMethod(200, 250, 400, 500));

    }
}
