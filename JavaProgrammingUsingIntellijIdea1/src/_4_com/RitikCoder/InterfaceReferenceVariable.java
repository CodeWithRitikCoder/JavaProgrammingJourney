package _4_com.RitikCoder;
interface AL{
    void tellJoke();
}
class ChildClass1 implements AL{
    @Override
    public void tellJoke() {
        System.out.println("Joke is : Tit for tat");
    }
    public void method1(){
        System.out.println("I'm method 1 of ChildClass1");
    }
}

public class InterfaceReferenceVariable {
    public static void main(String[] args) {
        System.out.println("Here I'm using Interface reference Variable.");
        AL al= new ChildClass1();
        al.tellJoke();
    }
}
