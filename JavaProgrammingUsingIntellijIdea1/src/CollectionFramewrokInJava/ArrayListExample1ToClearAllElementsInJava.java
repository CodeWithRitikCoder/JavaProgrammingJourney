package CollectionFramewrokInJava;

import java.util.ArrayList;

public class ArrayListExample1ToClearAllElementsInJava {
    public static void main(String[] args) {
        System.out.println("Example 1 of ArrayList to Clear all elements at a time in Java.");

        ArrayList<String> arrayList= new ArrayList<>();
        //Adding of elements into ArrayList.
        arrayList.add("RitikCoder");
        arrayList.add("AnkitCoder");
        arrayList.add("SumitCoder");
        arrayList.add("NitinCoder");
        arrayList.add("VipinCoder");
        arrayList.add("kajalCoder");
        System.out.println(arrayList);

        //Clear All elements of an ArrayList.
        arrayList.clear();
        System.out.println(arrayList);
    }
}
