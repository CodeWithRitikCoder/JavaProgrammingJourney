package _4_com.RitikCoder;

import java.sql.SQLOutput;

class A1{
    void showFun(){
        System.out.println("I'm here in the class A");
    }
}

class B1 extends A1 {
    void showFun(){
        super.showFun();
        System.out.println("I'm here in the class B");
    }
}
public class SuperKeywordExample2InJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Example of Super Keyword in Java with RitikCoder.");

        B1 b1= new B1();
        b1.showFun();
    }
}
