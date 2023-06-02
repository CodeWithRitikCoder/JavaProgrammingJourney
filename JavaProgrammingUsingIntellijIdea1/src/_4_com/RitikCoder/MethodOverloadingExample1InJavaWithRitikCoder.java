//Code a software to use Method overloading in java with RitikCoder.
package _4_com.RitikCoder;

class SuperClass1{
    void fun1(int a, int b){
        System.out.println("Addition of Two numbers :- "+ (a+ b));
    }
}

class SubClass extends SuperClass1 {
    void fun1(int a, int b, int c){
        System.out.println("Addition of three numbers :- "+ (a+ b+ c));
    }
}
public class MethodOverloadingExample1InJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Example 1 of Method overloading in Java With RitikCoder.");

        SubClass subClass= new SubClass();
        subClass.fun1(14, 15);
        subClass.fun1(14, 15, 20);
    }
}
