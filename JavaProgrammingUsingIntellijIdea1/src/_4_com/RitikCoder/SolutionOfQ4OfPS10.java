package _4_com.RitikCoder;
class BaseClass3{
    public BaseClass3() {
        System.out.println("I'm a constructor of BaseClass3");
    }
}
class DerivedClass1 extends BaseClass3{
    public DerivedClass1() {
        System.out.println("I'm a constructor of DerivedClass1");
    }
}
class DerivedClass2 extends DerivedClass1{
    public DerivedClass2() {
        System.out.println("I'm a constructor of DerivedClass2");
    }
}
public class SolutionOfQ4OfPS10 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-4 Of PS-10");
        DerivedClass2 derivedClass2= new DerivedClass2();
    }
}

