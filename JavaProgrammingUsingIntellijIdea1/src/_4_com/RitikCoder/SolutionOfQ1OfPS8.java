package _4_com.RitikCoder;
class Employee1{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class SolutionOfQ1OfPS8 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-1 Of PS-8");
        Employee1 employee1= new Employee1();
        Employee1 employee2= new Employee1();
        employee1.setSalary(60000);
        employee1.setName("Rohan");
        System.out.println("Employee 1 salary is : "+ employee1.getSalary());
        System.out.println("Employee 1 name is : "+ employee1.getName());
        employee2.setSalary(100000);
        employee2.setName("Shivam");
        System.out.println("Employee 2 salary is : "+ employee2.getSalary());
        System.out.println("Employee 2 name is : "+ employee2.getName());

    }
}
