package _4_com.RitikCoder;

class A4{
    void fun1(int a){
        System.out.println("Here I'm in the class A4. :- "+ a);
    }
}

class B4 extends A4{
    void fun1(int a){
        System.out.println("Here I'm in the class B4. :- "+ a);
    }
}
public class MethodHidingExample1InJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Example 1 of Method Hiding in Java With RitikCoder.");

        B4 b4= new B4();
        b4.fun1(15);

        A4 a4= new A4();
        a4.fun1(20);
    }
}
