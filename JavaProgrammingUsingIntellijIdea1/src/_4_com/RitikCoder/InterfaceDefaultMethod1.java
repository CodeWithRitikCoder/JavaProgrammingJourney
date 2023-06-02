package _4_com.RitikCoder;
interface MyInterface{
    void sayHello();
    void sayHappyBirthday();
    default void sayHappyDiwali(){
        System.out.println("Happy Diwali");
    }
}
class MyClass implements MyInterface{
    @Override
    public void sayHello() {
        System.out.println("Hello! my dear");
    }
    @Override
    public void sayHappyBirthday() {
        System.out.println("Happy Birthday to you");
    }
}
public class InterfaceDefaultMethod1 {
    public static void main(String[] args) {
        System.out.println("Here I'm using default method of interface in java");
        MyClass myClass= new MyClass();
        myClass.sayHello();
        myClass.sayHappyBirthday();
        myClass.sayHappyDiwali();
    }
}
