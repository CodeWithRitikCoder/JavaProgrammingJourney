package _4_com.RitikCoder;

class SuperClassA{
    public SuperClassA() {
        System.out.println("I'm in the SuperClassA");
    }
}

class SubClassB extends SuperClassA {
    public SubClassB() {
        System.out.println("I'm in the SubClassB");
    }
}
public class ConstructorCallingInJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Example of Constructor calling in Java WithRitikCoder");

        SubClassB subClassB= new SubClassB();
    }
}
