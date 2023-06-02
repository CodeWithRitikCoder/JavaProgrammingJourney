package _4_com.RitikCoder;
interface AF{
    void sayHello();
}
interface AG{
    void sayHello(String name);
}
interface AH extends AF, AG{
    void sayHii();
}
class Greet1 implements AH{
    @Override
    public void sayHello() {
        System.out.println("Hello! my dear");
    }
    @Override
    public void sayHello(String name) {
        System.out.println("Hello! :- "+ name);
    }
    @Override
    public void sayHii() {
        System.out.println("Hii ! my dear");
    }
}
public class InterfaceWithMultipleInheritance {
    public static void main(String[] args) {
        System.out.println("Here I'm using multiple inheritance");
        Greet1 greet1= new Greet1();
        greet1.sayHello();
        greet1.sayHello("RitikCoder");
        greet1.sayHii();
    }
}
