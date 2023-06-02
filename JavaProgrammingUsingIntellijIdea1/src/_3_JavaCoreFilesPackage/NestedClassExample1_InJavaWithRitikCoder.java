package _3_JavaCoreFilesPackage;//Code a software to use how to work Nested class (inner class).

//other class is here.
class OuterClass1{
    static class InnerClass1{
        void fun1OfInnerClass(){
            System.out.println("I am in InnerClass1");
        }
    }
}

public class NestedClassExample1_InJavaWithRitikCoder {
    public static void main(String[] args) {
        OuterClass1.InnerClass1 OIobj1= new OuterClass1.InnerClass1();
        OIobj1.fun1OfInnerClass();
    }
}
