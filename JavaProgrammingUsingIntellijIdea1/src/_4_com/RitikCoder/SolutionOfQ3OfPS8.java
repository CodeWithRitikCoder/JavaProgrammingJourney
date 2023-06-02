//3. Create a class Square with a method to initialize its side, calculate area, perimeter etc.
package _4_com.RitikCoder;
class Square{
    int side;

    public void setSide(int side) {
        this.side = side;
    }
    public int areaOfSquare(){
        return(side* side);
    }
    public int perimeterOfSquare(){
        return(4* side);
    }
}
public class SolutionOfQ3OfPS8 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-3 Of PS-8");
        Square square= new Square();
        square.setSide(20);
        System.out.println("The area of Square is : "+ square.areaOfSquare());
        System.out.println("The Perimeter of Square is : "+ square.perimeterOfSquare());

    }
}
