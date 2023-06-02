package CollectionFramewrokInJava;

import java.util.LinkedList;

public class LinkedListExample1ToAddElementsInJava {
    public static void main(String[] args) {
        System.out.println("Example 1 of LinkedList to Add element in Java.");

        LinkedList<String> linkedList= new LinkedList<>();
        //Adding elements to LinkedList in Java.
        linkedList.add("RitikCoder");
        linkedList.add("AnkitCoder");
        linkedList.add("VipinCoder");
        linkedList.add("SumitCoder");
        linkedList.add("NitinCoder");
        System.out.println(linkedList);

        //Adding elements to another place into the LinkedList.
        linkedList.addFirst("Ritik");
        System.out.println(linkedList);

        linkedList.addLast("Ankit");
        System.out.println(linkedList);

        linkedList.add(3, "VishakhaCoder");
        System.out.println(linkedList);
    }
}
