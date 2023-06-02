package _4_com.RitikCoder;
interface AI{
    void add(int a, int b);
    void subtract(int a, int b);
}
interface AJ extends AI{
    void multiply(int a, int b);
}
class Calculation implements AJ{
    @Override
    public void add(int a, int b) {
        System.out.println("The addition is : "+ (a+ b));
    }
    @Override
    public void subtract(int a, int b) {
        System.out.println("The subtraction is : "+ (a- b));
    }
    @Override
    public void multiply(int a, int b) {
        System.out.println("The multiplication is : "+ (a* b));
    }
}
public class InterfaceWithSingleInheritance {
    public static void main(String[] args) {
        System.out.println("Here I'm using single interface inheritance");
        Calculation calculation= new Calculation();
        calculation.add(2,4);
        calculation.subtract(4, 2);
        calculation.multiply(4, 5);
    }
}
