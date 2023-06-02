package _3_JavaCoreFilesPackage;//Code a software to use Non_Static Inner Class in java with RitikCoder.

//other classes is here.
class OuterClass4{
    int x= 10;
    class InnerClass4{
        void fun1OfInnerClass4(){
            System.out.println("here I'm in the fun1OfInnerClass4 and X:- "+ x);
        }
    }
}
public class Non_StaticInnerClassExample1InJavaWithRitikCoder {
    public static void main(String[] args) {
        OuterClass4 outerClass4= new OuterClass4();
        OuterClass4.InnerClass4 obj1OfInnerClass4= outerClass4.new InnerClass4();
        obj1OfInnerClass4.fun1OfInnerClass4();
    }
}
