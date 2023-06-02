package _4_com.RitikCoder;

import java.util.Scanner;

public class ArmStronNumber {
    public static void main(String[] args) {
        System.out.println("Checking of Arm Strong number.");

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number :- ");
        int n= sc.nextInt();
        int c, reminder, armStrongNumber= 0;
        c= n;
        while(n> 0){
            reminder= n% 10;
            armStrongNumber= (reminder* reminder* reminder)+ armStrongNumber;
            n= n/ 10;
        }
        if(c== armStrongNumber){
            System.out.println("This is an ArmStrong Number.");
        }else{
            System.out.println("This is not an ArmStrong Number.");
        }
    }
}
