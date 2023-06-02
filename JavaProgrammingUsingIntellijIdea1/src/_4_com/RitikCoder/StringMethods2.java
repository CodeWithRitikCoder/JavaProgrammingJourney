package _4_com.RitikCoder;

public class StringMethods2 {
    public static void main(String[] args) {
        System.out.println("String Methods 2");
        String str= "RitikCoder";

        System.out.println("Your replaced string :- "+ str.replace("R", "H"));
        System.out.println("Is your string startsWith :- "+ str.startsWith("Ri"));
        System.out.println("Is your string endsWith :- "+ str.endsWith("er"));
        System.out.println("charAt 2 index in your string :- "+ str.charAt(2));
        System.out.println("Index of \"k\" :- "+ str.indexOf("k"));
        System.out.println("Index of \"M\" :- "+ str.indexOf("M"));
        System.out.println("Index of \"i\" :- "+ str.indexOf("i", 2));
        System.out.println("Index of \"k\" :- "+ str.indexOf("k", 5));
    }
}
