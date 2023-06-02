package _4_com.RitikCoder;
class Base1{
    public Base1() {
        System.out.println("I'm a constructor of Base 1 Class");
    }
    public Base1(int a) {
        System.out.println("I'm a constructor of Base 1 Class with A = "+ a);
    }
}
class Child1 extends Base1{
    public Child1() {
        super(23);
        System.out.println("I'm constructor of Child 1 Class");
    }
}
public class ConstructorOverloadingWIthSingleInheritance {
    public static void main(String[] args) {
        System.out.println("Here I'm using constructor overloading with single inheritance");
        Child1 child1= new Child1();

    }
}
