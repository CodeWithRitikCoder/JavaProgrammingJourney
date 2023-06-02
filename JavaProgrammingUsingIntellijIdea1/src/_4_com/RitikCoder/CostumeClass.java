package _4_com.RitikCoder;

class Employee{
    int id;
    String name;
}
public class CostumeClass {
    public static void main(String[] args) {
        System.out.println("Here I'm creating costume class in java.");
        Employee employee= new Employee();
        //Setting the Attributes of member variable of The Employee class.
        employee.id= 12;
        employee.name= "RitikCoder";
        System.out.println(employee.id);
        System.out.println(employee.name);

    }
}
