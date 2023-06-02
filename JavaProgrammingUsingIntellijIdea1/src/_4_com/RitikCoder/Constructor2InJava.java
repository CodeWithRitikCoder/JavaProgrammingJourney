package _4_com.RitikCoder;

public class Constructor2InJava {
    private int id;

    public int getId() {
        return id;
    }

    public Constructor2InJava(int id) {
        this.id = id;

    }

    public static void main(String[] args) {
        System.out.println("Here I'm using parameterized constructor in java");
        Constructor2InJava constructor2InJava= new Constructor2InJava(102);
        System.out.println("The id is : "+ constructor2InJava.getId());;

    }
}
