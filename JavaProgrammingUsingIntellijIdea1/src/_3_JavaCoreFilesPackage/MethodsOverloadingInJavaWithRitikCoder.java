package _3_JavaCoreFilesPackage;//Code a software to Methods Overloading in Java with RitikCoder.

//Other classes
class MethodOverloading{
    void MethodOver(String Name){
        System.out.println("Good morning "+ Name+ "Ji.");
    }
    void MethodOver(int n){
        System.out.println("Hello "+ n+ "Ji.");
    }
}

public class MethodsOverloadingInJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Welcome to Methods Overloading in Java With RitikCoder.");
        //Methods Overloading means two or more Methods in a program as Same name.
        MethodOverloading MO= new MethodOverloading();
        MO.MethodOver("RitikCoder");
        MO.MethodOver(10);
    }
}
