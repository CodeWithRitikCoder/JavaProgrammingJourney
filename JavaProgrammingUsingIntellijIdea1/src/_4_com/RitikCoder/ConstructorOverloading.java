package _4_com.RitikCoder;

public class ConstructorOverloading {
    private String name= "No name";
    private int salary= 0;

    public String getName() {return(name); }
    public int getSalary() {return(salary); }
    public ConstructorOverloading() {
    }
    public ConstructorOverloading(String name) {
        this.name = name;
    }
    public ConstructorOverloading(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        System.out.println("Here I am doing constructor overloading\n");
        ConstructorOverloading constructorOverloading= new ConstructorOverloading();
        System.out.println("The name is using 1st constructor : "+ constructorOverloading.getName());
        System.out.println("The salary is using 1st constructor : "+ constructorOverloading.getSalary());
        ConstructorOverloading constructorOverloading1= new ConstructorOverloading("RitikCoder");
        System.out.println("The name is using 2nd constructor : "+ constructorOverloading1.getName());
        System.out.println("The salary is using 2nd constructor : "+ constructorOverloading1.getSalary());
        ConstructorOverloading constructorOverloading3= new ConstructorOverloading("RitikCoder", 500000);
        System.out.println("The name is using 3rd constructor : "+ constructorOverloading3.getName());
        System.out.println("The salary is using 3rd constructor : "+ constructorOverloading3.getSalary());

    }
}
