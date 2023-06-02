//Create a class Circle and use inheritance to create another class Cylinder form it.
package _4_com.RitikCoder;
class CircleClass{
    public int radius;

    public CircleClass(int radius) {
        this.radius = radius;
        System.out.println("I'm a Constructor of CircleClass, setting radius now");
    }
    public double area(){
        return (Math.PI* this.radius* this.radius);
    }
}
class CylinderClass extends CircleClass{
    public int height;

    public CylinderClass(int radius, int height) {
        super(radius);
        this.height = height;
        System.out.println("I'm a Constructor of CylinderClass, setting radius and height now");
    }
    public double volume(){
        return (Math.PI* this.radius* this.radius* this.height);
    }
}
public class SolutionOfQ1OfPS10 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-1 Of PS-10");
        //CircleClass circleClass= new CircleClass(6);
        //System.out.println("The area of Circle is : "+ circleClass.area());
        CylinderClass cylinderClass= new CylinderClass(3, 5);
        System.out.println("The volume of Cylinder is : "+ cylinderClass.volume());


    }
}
