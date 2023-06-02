package _4_com.RitikCoder;
class Base{
    public Base() {
        System.out.println("I'm a constructor of Base Class");
    }
}
class Derived extends Base{
    public Derived() {
        System.out.println("I'm a constructor of Derived Class");
    }
}
public class ConstructorInInheritance1 {
    public static void main(String[] args) {
        System.out.println("Here I'm using constructor in inheritance in java.");
        Derived derived= new Derived();
    }
}