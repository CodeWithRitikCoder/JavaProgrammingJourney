package _4_com.RitikCoder;

public class Constructor1InJava {
    private int id;
    private String name;
    public int getId() {return id; }
    public String getName() {return name; }
    public Constructor1InJava() {
        id= 102;
        name= "RitikCoder";
    }

    public static void main(String[] args) {
        System.out.println("Here I'm using constructor in java");
        Constructor1InJava constructor1InJava= new Constructor1InJava();
        System.out.println("The id is : "+ constructor1InJava.getId());
        System.out.println("The name is : "+ constructor1InJava.getName());

    }
}
