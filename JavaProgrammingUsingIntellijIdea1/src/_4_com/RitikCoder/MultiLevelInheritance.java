package _4_com.RitikCoder;
class X{
    public void methodX(){
        System.out.println("My name is Method1X");
    }
}
class Y extends X{
    public void methodY(){
        System.out.println("My name is Method1Y");
    }
}
class Z extends Y{
    public void methodZ(){
        System.out.println("My name is Method1Z");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        System.out.println("Here I'm using multilevel inheritance in java.");
        X x= new X();
        System.out.print("Using Class X : ");
        x.methodX();
        Y y= new Y();
        System.out.print("Using Class Y : ");
        y.methodX();
        Z z= new Z();
        System.out.print("Using Class Z : ");
        z.methodX();
    }
}
