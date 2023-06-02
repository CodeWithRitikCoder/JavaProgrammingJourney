package _3_JavaCoreFilesPackage;//Code a software to user of Anonymous Class in java with RitikCoder.

//other classes is here.
class Hello{
    public void sayHello(){
        System.out.println("How have you been.");
    }
}
class Hii{
    Hello hello= new Hello(){
        public void sayHello(){
            System.out.println("I'm well and good.");
        }
    };
}

public class AnonymousClass1InJavaWithRitikCoderExample1 {
    public static void main(String[] args) {
        Hii hii= new Hii();
        hii.hello.sayHello();
    }
}
