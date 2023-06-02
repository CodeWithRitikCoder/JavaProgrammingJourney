package _4_com.RitikCoder;
class SuperClass{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I'm in the Super Class and Setting X now.");
        this.x = x;
    }
}
class subClass extends SuperClass{
    int y;
    public int getY() {return y; }

    public void setY(int y) {
        System.out.println("I'm in the Sub Class and Setting Y now.");
        this.y = y;
    }
}
public class Inheritance1InJava {
    public static void main(String[] args) {
        System.out.println("Here I'm using inheritance in java.");
        SuperClass superClass= new SuperClass();
        superClass.setX(23);
        System.out.println("The value of X is : "+ superClass.getX());

    }
}
