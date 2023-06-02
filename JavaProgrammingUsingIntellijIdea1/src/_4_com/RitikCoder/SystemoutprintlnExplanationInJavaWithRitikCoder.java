package _4_com.RitikCoder;
import java.util.*;
class PrintScreen1{
    void fun(int a, int b){
        System.out.println("Addition of two number = "+ (a+ b));
    }
    void fun1(String String1){
        System.out.println("Length of your string is = "+ String1.length());
    }
}
class System1 {
    static PrintScreen1 out1= new PrintScreen1();
}
public class SystemoutprintlnExplanationInJavaWithRitikCoder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a, b;
        System.out.print("Enter the value of A = ");
        a= sc.nextInt();
        System.out.print("Enter the value of B = ");
        b= sc.nextInt();
        System1.out1.fun(a, b);
        System1.out1.fun1("RitikCoder");
    }
}
