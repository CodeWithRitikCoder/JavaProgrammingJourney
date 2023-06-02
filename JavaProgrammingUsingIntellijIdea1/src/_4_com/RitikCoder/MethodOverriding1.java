package _4_com.RitikCoder;
class SuperClass2{
    public void method1(){
        System.out.println("I'm a method1 of SuperClass2");
    }
    public void method2(){
        System.out.println("I'm a method2 of SuperClass2");
    }
}
class SubClass2 extends SuperClass2{
    @Override
    public void method2(){
        System.out.println("I'm a method2 of SubClass2");
    }
    public void method3(){
        System.out.println("I'm a method3 of SubClass2");
    }
}
public class MethodOverriding1 {
    public static void main(String[] args) {
        System.out.println("Here I'm using method overriding in java.");
        SubClass2 subClass2= new SubClass2();
        subClass2.method1();
        subClass2.method2();
        subClass2.method3();
        System.out.println();

        SuperClass2 superClass2= new SuperClass2();
        superClass2.method1();
        superClass2.method2();

    }
}
