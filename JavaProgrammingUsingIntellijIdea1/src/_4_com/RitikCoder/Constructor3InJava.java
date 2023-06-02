package _4_com.RitikCoder;

public class Constructor3InJava {
    private int id;
    private String name;

    public int getId() {return id; }

    public String getName() {return name; }

    public Constructor3InJava(int myId, String myName) {
        id= myId;
        name= myName;

    }

    public static void main(String[] args) {
        System.out.println("Here I'm using parameterized constructor in java");
        Constructor3InJava constructor3InJava= new Constructor3InJava(102, "RitikCoder");
        System.out.println("The id is : "+ constructor3InJava.getId());
        System.out.println("The name is : "+ constructor3InJava.getName());

    }
}