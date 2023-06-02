package _4_com.RitikCoder.OtherJavaFiles;

import java.util.Scanner;

public class PrimeNoOrNotFromMinToMaxExample1 {
    public static void main(String[] args) {
        System.out.println("Example 1 to check Min to Max numbers How many numbers are prime with Total.");

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Min Value :- ");
        int min= sc.nextInt();
        System.out.print("Enter your Max value :- ");
        int max= sc.nextInt();
        int i, j, sum= 0, count= 0;
        for(i= min+ 1; i< max; i++){
            for(j= 2; j< i; j++){
                if(i% j== 0){
                    break;
                }
            }
            if(i== j){
                System.out.println(" ,"+ i);
                count= count+ 1;
                sum= sum+ i;
            }
        }
        System.out.println("Counting of your prime Numbers is :- "+ count);
        System.out.println("The Sum of your Prime Numbers is :- "+ sum);
    }
}
