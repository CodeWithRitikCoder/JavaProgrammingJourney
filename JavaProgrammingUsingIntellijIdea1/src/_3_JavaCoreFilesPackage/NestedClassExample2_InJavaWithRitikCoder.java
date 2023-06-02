package _3_JavaCoreFilesPackage;//Code a software to use How work Nested class in java withRitikCoder.

//other classes is here.
class OuterClass2{
    class InnerClass2{
        void fun1OfInnerClass(){
            System.out.println("Here I am in InnerClass1");
        }
    }
}

public class NestedClassExample2_InJavaWithRitikCoder {
    public static void main(String[] args) {
        OuterClass2 objOfOuterClass2= new OuterClass2();
        OuterClass2.InnerClass2 objOfInnerClass2= objOfOuterClass2.new InnerClass2();
        objOfInnerClass2.fun1OfInnerClass();
    }
}
