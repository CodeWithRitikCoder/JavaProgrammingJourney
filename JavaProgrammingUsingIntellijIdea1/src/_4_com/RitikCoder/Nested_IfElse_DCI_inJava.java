package _4_com.RitikCoder;

public class Nested_IfElse_DCI_inJava {
    public static void main(String[] args) {
        System.out.println("Nested if else DCI in Java");
        int a= 5, b= 20, c= 10;

        if(a<= c){
            if(c>= b){
                System.out.println("C is Greater.");
            }else{
                System.out.println("B is Greater.");
            }
        }else{
            System.out.println("A is Greater.");
        }
    }
}
