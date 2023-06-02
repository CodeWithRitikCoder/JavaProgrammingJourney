package _4_com.RitikCoder;

public class StaticInitializationBlock {
    private static int y;
    static {
        System.out.println("Static initialization block y : "+ y);
        y++;
    }
    public StaticInitializationBlock() {
        System.out.println("Constructor x : "+ y);
        y= 10;
    }
    public static void main(String[] args) {
        System.out.println("Here I'm using Static initialization block in java.");
        StaticInitializationBlock staticInitializationBlock= new StaticInitializationBlock();
        StaticInitializationBlock staticInitializationBlock1= new StaticInitializationBlock();

    }
}
