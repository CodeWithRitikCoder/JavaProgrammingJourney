package _4_com.RitikCoder;

public class SolutionOfQ4OfPS3 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q4 Of PS3");
        String str= new String("Rit  ikCo   der");

        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));

        String str1= new String("Rit  ikCoder");
        System.out.println(str1.indexOf("   "));//No triple space in this String.
    }
}
