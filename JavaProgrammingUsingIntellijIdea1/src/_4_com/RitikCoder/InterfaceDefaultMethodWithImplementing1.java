package _4_com.RitikCoder;
interface MyInterface1{
    void sayHappyBirthday();
    default void sayHappyDiwali(){
        System.out.println("Happy Diwali");
    }
}
class MyClass1 implements MyInterface1{
    @Override
    public void sayHappyBirthday() {
        System.out.println("Happy Birthday to you my dear");
    }
    @Override
    public void sayHappyDiwali() {
        System.out.println("Happy Diwali in MyClass1");
    }
}
public class InterfaceDefaultMethodWithImplementing1 {
    public static void main(String[] args) {
        System.out.println("Here I'm using default method in interface");
        MyClass1 myClass1= new MyClass1();
        myClass1.sayHappyBirthday();
        myClass1.sayHappyDiwali();
    }
}
