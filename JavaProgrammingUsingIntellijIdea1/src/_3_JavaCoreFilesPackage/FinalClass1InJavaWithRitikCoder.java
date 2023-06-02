package _3_JavaCoreFilesPackage;//Code a software to use final keyword class in java;

//other classes is here.
final class FinalClass{//this is my final class.
    private int a;
    public void fun1(){
        System.out.println("I am in fun1 of final class");
    }
}

public class FinalClass1InJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Here I am using final class in java");
        FinalClass finalClass= new FinalClass();
        finalClass.fun1();
    }
}
