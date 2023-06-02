package _4_com.RitikCoder;

class BaseClass{
    private int ID;
    private String Name;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

class DrivedClass extends BaseClass{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class InheritanceInJava {

    public static void main(String[] args) {
        System.out.println("Inheritance in java.");
        BaseClass baseClass= new BaseClass();
        DrivedClass drivedClass= new DrivedClass();

        //Set Data in to Base class.
        baseClass.setID(102);
        baseClass.setName("RitikCoder");

        //Set Data in to Drived class.
        drivedClass.setSalary(150000);

        //get Data for Drived and Base class using Drived class object only.
        System.out.println("ID is :- "+ drivedClass.getID());
        System.out.println("Name is :- "+ drivedClass.getName());
        System.out.println("Salary is :- "+ drivedClass.getSalary());

    }
}
