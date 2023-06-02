//write a program to add more numbers using one Method in java using varargs in java.
package _4_com.RitikCoder;

public class VarargsInJava {
    static int Method1(int a, int ...arr){
        int sum= a;
        for(int elements: arr){
            sum += elements;
        }
        return(sum);
    }

    public static void main(String[] args) {
        System.out.println("Here I am using varargs in java.");
       // System.out.println("The sum of nothing is : "+ Method1());
        System.out.println("The sum of 2 is : "+ Method1(2));
        System.out.println("The sum of 2, 3 is : "+ Method1(2, 3));
        System.out.println("The sum of 2, 3, 4 is : "+ Method1(2, 3, 4));
        System.out.println("The sum of 2, 3, 4, 5 is : "+ Method1(2, 3, 4, 5));

    }
}
