package _3_JavaCoreFilesPackage;//Code a software to use of Methods in Java with RitikCoder.

//importing Statements in Java.

import java.util.Locale;

class MethodOne{
    int sum(int a, int b){
        return (a+ b);
    }
    void name(String name1){
        System.out.println("This is your name = "+ name1.toUpperCase(Locale.ROOT)+ " in the UpperaCase.");
    }
}

public class MethodsInJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Welcome to Method program in Java.");
        MethodOne MO= new MethodOne();
        MO.name("RitikCoder");
        System.out.println("Addition of two number is = "+ MO.sum(50, 50));

    }
}
