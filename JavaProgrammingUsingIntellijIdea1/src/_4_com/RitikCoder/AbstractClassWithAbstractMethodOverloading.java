package _4_com.RitikCoder;
abstract class ClassParent{
    abstract public void hello();
    abstract public void helloWithName(String name);
    abstract public void helloWithNameAndAge(String name, int age);
}
class ClassChild extends ClassParent{
    @Override
    public void hello() {
        System.out.println("Hello! by dear");
    }
    @Override
    public void helloWithName(String name) {
        System.out.println("Hello! by dear : "+ name);
    }
    @Override
    public void helloWithNameAndAge(String name, int age) {
        System.out.println("Hello! by dear : "+ name+ " and your age is : "+ age);
    }
}
public class AbstractClassWithAbstractMethodOverloading {
    public static void main(String[] args) {
        System.out.println("Here I'm using Abstract class with abstract method overloading.");
        ClassChild classChild= new ClassChild();
        classChild.hello();
        classChild.helloWithName("RitikCoder");
        classChild.helloWithNameAndAge("RitikCoder", 19);

    }
}

