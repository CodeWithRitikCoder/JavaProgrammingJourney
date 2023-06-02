package _4_com.RitikCoder;
class OneClass{
    private int a;
    public OneClass(int a) {
        this.a = a;
    }
    public int getA() {return a; }
}
public class ThisKeyword {
    public static void main(String[] args) {
        System.out.println("Here I'm using this keyword in java.");
        OneClass oneClass= new OneClass(22);
        System.out.println("The returned value is : "+ oneClass.getA());
    }
}
