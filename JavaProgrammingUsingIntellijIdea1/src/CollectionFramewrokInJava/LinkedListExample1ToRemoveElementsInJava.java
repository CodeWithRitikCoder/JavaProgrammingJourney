package CollectionFramewrokInJava;

import java.util.LinkedList;

public class LinkedListExample1ToRemoveElementsInJava {
    public static void main(String[] args) {
        System.out.println("Example 1 of LinkedList to Remove elements in java.");
        //Adding elements into LinkedList in java.
        LinkedList<String> linkedList= new LinkedList<>();
        linkedList.add("RitikCoder");
        linkedList.add("AnkitCoder");
        linkedList.add("VipinCoder");
        linkedList.add("SumitCoder");
        linkedList.add("NitinCoder");
        System.out.println(linkedList);

        //Removing elements into the LinkedList in Java.
        linkedList.remove(3);
        System.out.println(linkedList);

        linkedList.remove();
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
