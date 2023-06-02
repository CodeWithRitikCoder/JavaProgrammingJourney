package _4_com.RitikCoder;
class Base2{
    public Base2() {
        System.out.println("I'm a constructor of Base 2 Class");
    }
    public Base2(int a) {
        System.out.println("I'm a constructor of Base 2 Class with A = "+ a);
    }
    public Base2(int a, int b) {
        System.out.println("I'm a constructor of Base 2 Class with A = "+ a +" & B = "+ b);
    }
}
class Child2 extends Base2{
    public Child2() {
        super(23);
        System.out.println("I'm constructor of Child 2 Class");
    }
    public Child2(int a, int b) {
        super(a, b);
        System.out.println("I'm constructor of Child 2 Class with A = "+ a +" & B = "+ b);
    }
}
public class ConstructorOverloadingWIthSingleInheritance1 {
    public static void main(String[] args) {
        System.out.println("Here I'm using Constructor overloading with single inheritance");
        Child2 child2= new Child2(4, 7);
    }
}
