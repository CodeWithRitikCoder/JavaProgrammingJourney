//4. Create a class Rectangle & repeat question no- 3.
package _4_com.RitikCoder;
class Rectangle{
    int length, width;


    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int areaOfRectangle(){
        return(width* length);
    }
    public int perimeterOfRectangle(){
        return(2* (length+ width));
    }
}
public class SolutionOfQ4OfPS8 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-4 Of PS-8");
        Rectangle rectangle= new Rectangle();
        rectangle.setLength(12);
        rectangle.setWidth(20);
        System.out.println("The Area of Rectangle is : "+ rectangle.areaOfRectangle());
        System.out.println("The Perimeter of Rectangle is : "+ rectangle.perimeterOfRectangle());

    }
}
