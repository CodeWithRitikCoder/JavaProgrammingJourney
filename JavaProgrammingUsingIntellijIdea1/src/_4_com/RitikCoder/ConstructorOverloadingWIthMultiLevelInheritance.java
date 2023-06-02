package _4_com.RitikCoder;
class BaseClass1{
    public BaseClass1() {
        System.out.println("I'm a constructor of BaseClass1 with no parameters");
    }
    public BaseClass1(int a, int b) {
        System.out.println("I'm a constructor of BaseClass1 with two parameters");
    }
}
class ChileClass1 extends BaseClass1{
    public ChileClass1() {
        System.out.println("I'm a constructor of ChileClass1 with no parameters");
    }
    public ChileClass1(int a , int b) {
        System.out.println("I'm a constructor of ChileClass1 with two parameters");
    }
}
class GrandChildClass1 extends ChileClass1{
    public GrandChildClass1() {
        System.out.println("I'm a constructor of GrandChildClass1 with no parameters");
    }
    public GrandChildClass1(int a, int b) {
        super(a, b);
        System.out.println("I'm a constructor of GrandChildClass1 with two parameters");
    }
}
public class ConstructorOverloadingWIthMultiLevelInheritance {
    public static void main(String[] args) {
        System.out.println("Here I'm using Constructor overloading with multiLevel inheritance");
        GrandChildClass1 grandChildClass1= new GrandChildClass1(2, 3);
    }
}
