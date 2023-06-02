package _4_com.RitikCoder;

public class SolutionOfQ3OfPS9 {
    private int radius;
    private int height;
    public SolutionOfQ3OfPS9(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public int getRadius() {return radius; }
    public int getHeight() {return height; }

    public static void main(String[] args) {
        System.out.println("Solution Of Q-3 Of PS-9");
        SolutionOfQ3OfPS9 solutionOfQ3OfPS9= new SolutionOfQ3OfPS9(15, 20);
        System.out.println("The radius is : "+ solutionOfQ3OfPS9.getRadius());
        System.out.println("The height is : "+ solutionOfQ3OfPS9.getHeight());
    }
}
