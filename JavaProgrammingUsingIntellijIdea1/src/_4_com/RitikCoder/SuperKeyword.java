package _4_com.RitikCoder;

import java.nio.file.NoSuchFileException;

class ParentClass{
    public ParentClass() {
        System.out.println("I'm a default constructor of Parent Class");
    }

    public ParentClass(int a) {
        System.out.println("I'm a constructor of Parent Class : "+ a);
    }
}
class ChildClass extends ParentClass{
    public ChildClass(int b) {
        super(b); //this will invoke parameterized constructor of parent class
        System.out.println("I'm a constructor of Child Class : "+ b);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        System.out.println("Here I'm using super keyword in java.");
        ChildClass childClass= new ChildClass(50);
    }
}
