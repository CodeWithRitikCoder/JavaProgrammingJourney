package _4_com.RitikCoder;

class A{
    int a= 10;
}

class B extends A {
    int a= 20;
    void showFun(){
        System.out.println(super.a);
    }
}
public class SuperKeywordExample1InJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Example of Super Keyword in Java With RitikCoder");

        B b= new B();
        b.showFun();
    }
}
