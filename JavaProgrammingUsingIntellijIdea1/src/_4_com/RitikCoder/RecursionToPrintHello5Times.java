package _4_com.RitikCoder;

public class RecursionToPrintHello5Times {
    static void printHelloMethod(int n){
        if(n== 0){
            return;
        }
        System.out.println("Hello");
        printHelloMethod(n- 1);
    }
    public static void main(String[] args) {
        System.out.println("Here I'm using Recursion in java.");
        printHelloMethod(5);

    }
}
