package _4_com.RitikCoder;

public class StringMethods3 {
    public static void main(String[] args) {
        System.out.println("String Methods 3");
        String str= "RitikCoder";

        System.out.println("LastIndex of your \"i\" string :- "+ str.lastIndexOf("i"));
        System.out.println("LastIndex of your \"ik\" string before index 5 :- "+ str.lastIndexOf("ik", 5));
        System.out.println("LastIndex of your \"o\" string before index 5 :- "+ str.lastIndexOf("o", 5));
        System.out.println("Is your string equals \"RitikCoder\" with match case sensitive :- "+ str.equals("RitikCoder"));
        System.out.println("Is your string equals \"RitikCoder\" with match case sensitive :- "+ str.equals("ritikcoder"));
        System.out.println("Is your string equals \"RitikCoder\" with out match case sensitive :- "+ str.equalsIgnoreCase("ritikcoder"));

        System.out.println("RitikCoder \n");
        System.out.println("\t RitikCoder");
        System.out.println("\\ RitikCoder");
        System.out.println("\" RitikCoder \"");
    }
}
