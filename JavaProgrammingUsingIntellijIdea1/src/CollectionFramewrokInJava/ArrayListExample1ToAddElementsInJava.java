package CollectionFramewrokInJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample1ToAddElementsInJava {
    public static void main(String[] args) {
        System.out.println("Example 1 of ArrayList to Add Elements in Java.");

        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("RitikCoder");
        arrayList.add("AnkitCoder");
        arrayList.add("SubhasCoder");

        System.out.println(arrayList);
        arrayList.add("NitinCoder");

        System.out.println(arrayList);
        arrayList.add(1, "KajalCoder");

        System.out.println(arrayList);
        arrayList.add(0, "Ritik");

        System.out.println(arrayList);
    }
}