package _4_com.RitikCoder;
interface AM{
    int a= 10;
    String name= "RitikCoder";
}
class ClassCL implements AM{
    int a= 45;
    void method(){
        System.out.println("I'm method of ClassCL");
    }
}
public class InterfaceVariable {
    public static void main(String[] args) {
        System.out.println("Here I'm using variable of interface.");
        ClassCL classCL= new ClassCL();
        classCL.method();
        System.out.println("The value of A is by using subClass reference : "+ classCL.a);
        AM am= new ClassCL();
        System.out.println("The name is By using interface reference : "+ am.name);
    }
}
