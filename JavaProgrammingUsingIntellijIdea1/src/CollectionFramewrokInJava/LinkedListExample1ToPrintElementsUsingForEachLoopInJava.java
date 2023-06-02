package CollectionFramewrokInJava;

import java.util.LinkedList;

public class LinkedListExample1ToPrintElementsUsingForEachLoopInJava {
    public static void main(String[] args) {
        System.out.println("Example 1 of LinkedList to Print elements using For-each loop in java.");

        LinkedList<String> linkedList= new LinkedList<>();
        //Adding elements into LinkedList in java.
        linkedList.add("RitikCoder");
        linkedList.add("AnkitCoder");
        linkedList.add("NitinCoder");
        linkedList.add("SumitCoder");
        System.out.println(linkedList);

        //Printing elements of LinkedList using For-Each loop in java.
        for(String elements: linkedList){
            System.out.println(elements);
        }
    }
}
