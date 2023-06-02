package _3_JavaCoreFilesPackage;//Code a software to use static inner class in java with RitikCoder.

//other classes is here.
class OuterClass3{
    static class InnerClass3{
        void fun1OfInnerClass3(){
            System.out.println("here I'm in the fun1OfInnerClass3 of static InnerClass3");
        }
    }
}
public class StaticInnerClassExample1InJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Here I'm using Static Inner class");
        OuterClass3.InnerClass3 objOfInnerClass3= new OuterClass3.InnerClass3();
        objOfInnerClass3.fun1OfInnerClass3();
    }
}
