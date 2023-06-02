package _4_com.RitikCoder;

public class StringMethods1 {
    public static void main(String[] args) {
        System.out.println("String methods 1");
        String str= "RitikCoder";

        System.out.println("Length out your string :- "+ str.length());
        System.out.println("LowerCase of your string :- "+ str.toLowerCase());
        System.out.println("UpperCase of your string :- "+ str.toUpperCase());
        String str1= "      RitikCoder    ";//this is non trim string.
        System.out.println("Your Trimed string :- "+ str1.trim());
        System.out.println("Your SubString :- "+ str.substring(5));
        System.out.println("Your SubString :- "+ str.substring(3, 7));
    }
}
