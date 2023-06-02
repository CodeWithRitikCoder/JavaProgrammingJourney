//Using of Continue statement with for loop.
package _4_com.RitikCoder;

public class ContinueKeywordInJava {
    public static void main(String[] args) {
        System.out.println("Continue Keyword In Java");

        for(int i= 0; i<= 5; i++){
            if(i== 3){
                System.out.println("Continue of the loop on i== 3.");
                continue;
            }
            System.out.println(i+ " RitikCoder is in the for loop.");
        }
        System.out.println("Ending the loop.");
    }
}
