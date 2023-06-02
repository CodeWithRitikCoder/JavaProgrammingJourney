package _4_com.RitikCoder;
class X1{
    public void method1(){
        System.out.println("My name is Method1 of class X1");
    }
}
class Y1 extends X1{
    public void method2(){
        System.out.println("My name is Method2 of class Y1");
    }
}
class Z1 extends X1{
    public void method3(){
        System.out.println("My name is Method3 of class Z1");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        System.out.println("Here I'm using Hierarchical inheritance in java.");
        X1 x1= new X1();
        System.out.print("Using Class X1 : ");
        x1.method1();
        Y1 y1= new Y1();
        System.out.print("Using Class Y1 : ");
        y1.method1();
        Z1 z1= new Z1();
        System.out.print("Using Class Z1 : ");
        z1.method1();
    }
}
