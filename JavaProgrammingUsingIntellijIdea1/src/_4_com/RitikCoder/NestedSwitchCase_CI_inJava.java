package _4_com.RitikCoder;

import java.util.Scanner;

public class NestedSwitchCase_CI_inJava {
    public static void main(String[] args) {
        System.out.println("Nested Switch Case CI in Java");
        //Code a software to calculate some operations using Nested switch case.
        Scanner sc= new Scanner(System.in);

        System.out.println("B.Tech");
        System.out.println("MCA");
        System.out.println("BCA");
        System.out.print("Select your course :- ");
        String str= sc.next();
        switch(str){
            case ("B.Tech"):{
                System.out.println("1. K.S Collage.");
                System.out.println("2. R.S.D Collage.");
                System.out.print("Select your collage :- ");
                int a= sc.nextInt();
                switch(a){
                    case 1:{
                        System.out.println("K.S Collage.");
                        break;
                    }
                    case 2:{
                        System.out.println("R.S.D Collage.");
                        break;
                    }
                    default:{
                        System.out.println("InValid selection.");
                    }
                }
                break;
            }
            case ("MCA"):{
                System.out.println("MCA");
                break;
            }
            case ("BCA"):{
                System.out.println("BCA");
                break;
            }
            default:{
                System.out.println("default.");
            }
        }
    }
}
