package _4_com.RitikCoder;
interface MyInterface2{
    void tellYourName();
    private void tellYourPassword(){
        System.out.println("The Password is : 565656578");
    }
    default void defaultMethod(){
        System.out.println("My name default Method");
        tellYourPassword();
    }
}
class MyClass3 implements MyInterface2{
    @Override
    public void tellYourName() {
        System.out.println("My name is RitikCoder");
    }
}
public class InterfacePrivateMethod1 {
    public static void main(String[] args) {
        System.out.println("Here I'm using Private method of interface.");
        MyClass3 myClass3= new MyClass3();
        myClass3.tellYourName();
        myClass3.defaultMethod();
    }
}
