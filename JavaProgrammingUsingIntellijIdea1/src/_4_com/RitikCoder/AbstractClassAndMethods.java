package _4_com.RitikCoder;
abstract class BaseClass4{
    public void method1(){
        System.out.println("I'm method1 of BaseClass4");
    }
    abstract public void methodHello();
    abstract public void methodHii();
}
class DerivedClass4 extends BaseClass4{
    public void method2(){
        System.out.println("I'm method2 of DerivedClass4");
    }

    @Override
    public void methodHello() {
        System.out.println("Hello, I'm abstract method of BaseClass4");
    }

    @Override
    public void methodHii() {
        System.out.println("Hii, I'm abstract method of BaseClass4");
    }
}
public class AbstractClassAndMethods {
    public static void main(String[] args) {
        System.out.println("Here I'm using abstract class and methods in java.");
        DerivedClass4 derivedClass4= new DerivedClass4();
        derivedClass4.method1();
        derivedClass4.method2();
        derivedClass4.methodHello();
        derivedClass4.methodHii();

    }
}
