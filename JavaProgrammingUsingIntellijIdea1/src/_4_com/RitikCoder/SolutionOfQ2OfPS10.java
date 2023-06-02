package _4_com.RitikCoder;
class RectangleClass{
    public int length, width, height;
    public RectangleClass(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("I'm a constructor of RectangleClass, setting length, width & volume");
    }
    public int volumeOfRectangle(){
        return (length* height* width);
    }
}
class CuboidClass extends RectangleClass{
    public int breath;

    public CuboidClass(int breath) {
        super(2, 3, 5);
        this.breath = breath;
        System.out.println("I'm a constructor of CuboidClass, setting breath");
    }
    public int VolumeOfCuboid(){
        return (length* breath* height);
    }
}
public class SolutionOfQ2OfPS10 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-2 Of PS-10");
        CuboidClass cuboidClass= new CuboidClass(4);
        System.out.println("The Volume of Cuboid is : "+ cuboidClass.VolumeOfCuboid());
    }
}
