//Create a class Calculator, ScCalculator and HybridCalculator and group them into a package.

package _4_com.RitikCoder;

class Calculator{
    public void calculate(int a, int b){
        System.out.println("The Sum is : "+ a+ b);
    }
}

class SCCalculator{
    public void calculate(int a, int b){
        System.out.println("The Sum is : "+ Math.sin(a+ b));
    }
}

class HYCalculator{
    public void calculate(int a, int b){
        System.out.println("The Sum is : "+ a+ b);
        System.out.println("The Sum is : "+ Math.sin(a+ b));
    }
}

public class SolutionOfQ1OfPS12 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-1 Of PS-12");

    }
}
