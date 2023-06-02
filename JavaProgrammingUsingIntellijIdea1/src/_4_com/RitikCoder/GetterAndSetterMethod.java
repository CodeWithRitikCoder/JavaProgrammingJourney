package _4_com.RitikCoder;
class Class2{
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class GetterAndSetterMethod {
    public static void main(String[] args) {
        System.out.println("Here I'm using Getter and setter method in java.");
        Class2 class2= new Class2();
        class2.setId(102);
        class2.setName("RitikCoder");
        System.out.println("ID is : "+ class2.getId());
        System.out.println("Name is : "+ class2.getName());

    }
}
