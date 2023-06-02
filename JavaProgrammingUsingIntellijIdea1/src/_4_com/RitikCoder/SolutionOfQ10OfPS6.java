//Write a Java program to print the following pattern:
// * * * * *
//   * * * *
//     * * *
//       * *
//         *
package _4_com.RitikCoder;

public class SolutionOfQ10OfPS6 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q10 Of PS6");

        for(int i= 1; i<= 5; i++){
            for(int j= 1; j<= 5; j++){
                if(j>= i){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
