package _4_com.RitikCoder;

interface interface1{
    void method1();
    void method2();
}

//class Class1 implements interface1{
//
//    @Override
//    public void method1() {
//        System.out.println("here I'm in the method 1.");
//    }
//
//    @Override
//    public void method2() {
//        System.out.println("Here I'm in the method 2.");
//    }
//}
public class AnonymousClassExample1InJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Example 1 of Annonymous class in Java With RitikCoder");

    interface1 interfaceObj= new interface1(){
        @Override
        public void method1() {
            System.out.println("Here I'm in the Method 1");
        }

        @Override
        public void method2() {
            System.out.println("Here I'm in the Method 2");
        }
    };
    interfaceObj.method1();
    interfaceObj.method2();
    }
}
