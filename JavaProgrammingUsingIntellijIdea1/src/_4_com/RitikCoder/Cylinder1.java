package _4_com.RitikCoder;

public class Cylinder1 {
    private int radius;
    private int height;

    public int getRadius() {return radius; }
    public void setRadius(int radius) {this.radius = radius; }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public static void main(String[] args) {
        System.out.println("This is my Cylinder Class");
        Cylinder1 cylinder1= new Cylinder1();
        cylinder1.setRadius(12);
        cylinder1.setHeight(20);
        System.out.println("The Radius of a Cylinder is : "+ cylinder1.getRadius());
        System.out.println("The Height of a Cylinder is : "+ cylinder1.getHeight());

    }
}
