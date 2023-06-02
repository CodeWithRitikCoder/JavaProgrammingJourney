package _4_com.RitikCoder;

public class ResultingDataType {
    public static void main(String[] args) {
        System.out.println("Resulting Data Type in Java");
        byte a= 5;
        short b= 8;
        int c= 14;
        long d= 18;
        float e= 15.7f;
        double f= 21.4;
        char g= 'R';
        System.out.println("byte + short :- "+ (a+ b));
        System.out.println("short + integer :- "+ (b+ c));
        System.out.println("long + float :- "+ (d+ e));
        System.out.println("integer + float :- "+ (c+ e));
        System.out.println("char + integer :- "+ (g+ c));
        System.out.println("char + short :- "+ (g+ b));
        System.out.println("long + double :- "+ (d+ f));
        System.out.println("float + double :- "+ (e+ f));
    }
}
