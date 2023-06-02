package _4_com.RitikCoder;

class A2{
    public A2(int a) {
        System.out.println("Here I'm in the Class A2."+ a);
    }
}

class B2 extends A2{
    public B2() {
        super(500);
        System.out.println("Here I'm in the Class B2.");
    }
}
public class SuperKeyWordInConstructorInJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Example of Super Keyword in Constructor in java");

        B2 b2= new B2();
    }
}
