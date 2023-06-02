package _4_com.RitikCoder;

class Example{
    private static int y;
    public static int meth2(){
        y= 4;
        return (y);
    }
    static class InnerClassTest{
        public static String name= "RitikCoder";
    }
}
public class StaticMemberClass {
    public static void main(String[] args) {
        System.out.println("Here I am using static member class in java.");
        System.out.println("This is the inside of the inner class : "+ Example.InnerClassTest.name);
        System.out.println("The value of Y is : "+ Example.meth2());

    }
}