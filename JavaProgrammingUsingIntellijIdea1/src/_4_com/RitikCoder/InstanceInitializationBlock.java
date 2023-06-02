package _4_com.RitikCoder;

public class InstanceInitializationBlock {
    private int x;
    {
        System.out.println("Instance initialization block x : "+ x);
        x= 5;
    }

    public InstanceInitializationBlock() {
        System.out.println("Constructor x : "+ x);
    }

    public static void main(String[] args) {
        System.out.println("Here I am using instance initialization block in java.");
        InstanceInitializationBlock instanceInitializationBlock= new InstanceInitializationBlock();
        InstanceInitializationBlock instanceInitializationBlock1= new InstanceInitializationBlock();

    }
}
