package _4_com.RitikCoder;
class BaseClass2{
    public BaseClass2() {
        System.out.println("I'm a constructor of BaseClass2 with no arguments");
    }
    public BaseClass2(int a, int b) {
        System.out.println("I'm a constructor of BaseClass2 with two arguments");
    }
    public BaseClass2(int a, int b, int c) {
        System.out.println("I'm a constructor of BaseClass2 with three arguments");
    }
}
class ChildClass2 extends BaseClass2{
    public ChildClass2() {
        System.out.println("I'm a constructor of ChildClass2 with no arguments");
    }
    public ChildClass2(int a, int b) {
        System.out.println("I'm a constructor of ChildClass2 with two arguments");
    }
    public ChildClass2(int a, int b, int c) {
        super(a, b);
        System.out.println("I'm a constructor of ChildClass2 with three arguments");
    }
}
class ChildClass3 extends BaseClass2{
    public ChildClass3() {
        System.out.println("I'm a constructor of ChildClass3 with no arguments");
    }
    public ChildClass3(int a, int b) {
        super(a, b, 9);
        System.out.println("I'm a constructor of ChildClass3 with two arguments");
    }
    public ChildClass3(int a, int b, int c) {
        System.out.println("I'm a constructor of ChildClass3 with three arguments");
    }
}
public class ConstructorOverloadingWIthHierarchicalInheritance1 {
    public static void main(String[] args) {
        System.out.println("Here I'm using Constructor overloading with Hierarchical Inheritance");
        ChildClass2 childClass2= new ChildClass2(2, 4, 5);
        System.out.println();
        ChildClass3 childClass3= new ChildClass3();
        System.out.println();
        ChildClass3 childClass4= new ChildClass3(6, 8);
    }
}
