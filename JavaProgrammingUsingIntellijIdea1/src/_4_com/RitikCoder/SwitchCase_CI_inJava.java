package _4_com.RitikCoder;

import java.util.Scanner;

public class SwitchCase_CI_inJava {
    public static void main(String[] args) {
        System.out.println("Switch Case CI in Java");
        //Code a software to calculate some operations using switch case.
        Scanner sc= new Scanner(System.in);

        System.out.println("1. Addition.");
        System.out.println("2. Subtraction.");
        System.out.println("3. Multiplication.");
        System.out.print("Select your number :- ");
        int a= sc.nextInt();
        switch(a){
            case 1:{
                System.out.println("Addition");
                break;
            }
            case 2:{
                System.out.println("Subtraction.");
                break;
            }
            case 3:{
                System.out.println("Multiplication.");
                break;
            }
            default:{
                System.out.println("default.");
            }
        }
    }
}
