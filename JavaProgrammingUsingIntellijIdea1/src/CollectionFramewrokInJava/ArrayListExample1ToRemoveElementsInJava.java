package CollectionFramewrokInJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample1ToRemoveElementsInJava {
    public static void main(String[] args) {
        System.out.println("Example 1 of ArrayList to Remove elements in Java.");

        ArrayList<String> arrayList= new ArrayList<>();
        //Adding of elements in the ArrayList.
        arrayList.add("RitikCoder");
        arrayList.add("AnkitCoder");
        arrayList.add("NitinCoder");
        arrayList.add("kajalCoder");
        System.out.println(arrayList);

        //Elements Removing from the ArrayList in Java.
        arrayList.remove(2);
        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);
    }
}
