//8. Repeat question no- 2 using Recursion.
package _4_com.RitikCoder;

public class SolutionOfQ8OfPS7 {
    static void patternMethod(int n){
        if(n> 0){
            patternMethod(n- 1);
            for(int j= 1; j<= n; j++){
                System.out.print("  *");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Solution Of Q-7 Of PS-7");
        patternMethod(4);

    }
}
