package _4_com.RitikCoder;
interface AK{
    void rest();
    void work();
}
abstract class ABClass implements AK{
    abstract void method();
    public void className(){
        System.out.println("My name is Abstract class");
    }
}
class BasicClass extends ABClass{
    @Override
    public void rest() {
        System.out.println("I am doing Rest");
    }
    @Override
    public void work() {
        System.out.println("I am working");
    }
    @Override
    void method() {
        System.out.println("I am method of abstract ABClass");
    }
}
public class InterfaceWithAbstractClass {
    public static void main(String[] args) {
        System.out.println("Here I'm using interface with Abstract class");
        BasicClass basicClass= new BasicClass();
        basicClass.rest();
        basicClass.work();
        basicClass.className();
        basicClass.method();
    }
}
