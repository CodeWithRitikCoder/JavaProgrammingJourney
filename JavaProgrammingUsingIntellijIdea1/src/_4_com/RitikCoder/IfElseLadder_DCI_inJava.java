package _4_com.RitikCoder;

import java.util.Scanner;

public class IfElseLadder_DCI_inJava {
    public static void main(String[] args) {
        System.out.println("If Else Ladder DCI in Java");

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age here :- ");
        int age= sc.nextInt();
        if(age>= 18 && age<= 70){
            System.out.println("You can Drive.");
        }else if(age< 18 && age>= 8){
            System.out.println("You can't Drive.");
        }else if(age<= 8){
            System.out.println("You are child now.");
        }else{
            System.out.println("You shouldn't Drive");
//        System.out.println((age>= 18)? "Your can boat" : "Your can't boat");
        }
    }
}
