package _4_com.RitikCoder;
interface AB{
    void sayHello();
    void sayHii(String name);
}
class Greet implements AB{
    @Override
    public void sayHello() {
        System.out.println("Hello! my dear");
    }
    @Override
    public void sayHii(String name) {
        System.out.println("Hii-! :- "+ name);
    }
}
public class InterfaceExample1 {
    public static void main(String[] args) {
        System.out.println("Here This is my Second example of interface");
        Greet greet= new Greet();
        greet.sayHello();
        greet.sayHii("RitikCoder");
    }
}

