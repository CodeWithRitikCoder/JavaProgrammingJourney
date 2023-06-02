package _4_com.RitikCoder;
class Circle{
    int radius;
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int areaOfCircle(){
        return (int) (3.144* (radius* radius));
    }
    public int perimeterOfCircle(){
        return (int) (2* 3.144* radius);
    }
}
public class SolutionOfQ6OfPS8 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-6 Of PS-8");
        Circle circle1= new Circle();
        circle1.setRadius(20);
        System.out.println("The Area of Circle is : "+ circle1.areaOfCircle());
        System.out.println("The Perimeter of Circle is : "+ circle1.perimeterOfCircle());
    }
}
