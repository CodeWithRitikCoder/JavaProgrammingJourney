package _3_JavaCoreFilesPackage;

//Code a Software to use all Logical operators in Java with RitikCoder.
public class LogicalOperatorsInJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("\tThese all are Logical operators in Java with RitikCoder.");
        int a= 5, b= 2;
        System.out.println("1. This (&&)-AND condition is = "+ ((a== b)&&(a> b)));
        System.out.println("2. This (&&)-AND condition is = "+ ((a>= b)&&(a> b)));
        System.out.println("3. This (||)-OR condition is = "+ ((a< b)||(a== b)));
        System.out.println("4. This (||)-OR condition is = "+ ((a< b)||(a!= b)));
        System.out.println("5. This (!)-NOT condition is = "+ !(a>= b));
        System.out.println("6. This (!)-NOT condition is = "+ !(a< b));
    }
}
