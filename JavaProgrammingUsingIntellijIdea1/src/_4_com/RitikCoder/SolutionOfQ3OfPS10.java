package _4_com.RitikCoder;
class RectangleClass1{
    public int length, width, height;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAreaOfRectangle(){
        return (length* height* width);
    }
}
class CuboidClass1 extends RectangleClass1{
    public int breath;

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public int getVolumeOfCuboid(){
        return (length* breath* height);
    }
}
public class SolutionOfQ3OfPS10 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-3 Of PS-10");
        CuboidClass1 cuboidClass1= new CuboidClass1();
        cuboidClass1.setBreath(2);
        cuboidClass1.setHeight(3);
        cuboidClass1.setLength(5);
        cuboidClass1.setWidth(8);
        System.out.println("The area of Rectangle is : "+ cuboidClass1.getAreaOfRectangle());
        System.out.println("The volume of Cuboid is : "+ cuboidClass1.getVolumeOfCuboid());
    }
}
