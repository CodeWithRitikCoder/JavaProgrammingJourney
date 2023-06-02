//Using of break statement with for loop.
package _4_com.RitikCoder;

public class BreakKeyWordInJava {
    public static void main(String[] args) {
        System.out.println("Break Keyword in Java.");

        for(int i= 0; i<= 5; i++){
            System.out.println(i+ " RitikCoder is in the for loop.");
            if(i== 3){
                System.out.println("RitikCoder is out of the loop on.");
                break;
            }
        }
        System.out.println("I'm end of the loop.");
    }
}
