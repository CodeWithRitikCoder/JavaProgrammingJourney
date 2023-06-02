package _4_com.RitikCoder;

public class WaysOfPrintInJava {
    public static void main(String[] args) {
        System.out.println("Ways of Print In java.\n");

        int a= 5;
        float b= 6.4f;
        System.out.println("The value of A= "+ a+ " and the value of B= "+ b);
        System.out.print("RitikCoder\n");//This will not break a line.
        System.out.printf("The value of A= %d and the value of B= %f\n", a, b);
        System.out.format("The value of A= %d and the value of B= %f\n", a, b);
    }
}