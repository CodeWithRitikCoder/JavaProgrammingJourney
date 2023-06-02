package CollectionFramewrokInJava;

import java.util.Stack;

public class StackExample1ToAddElementsInJava {
    public static void main(String[] args) {
        System.out.println("Example 1 of Stack to Add elements in Java.");

        Stack<String> stack= new Stack<>();//LIFO
        //Adding of elments into the Stack memory in java.
//        stack.add("RitikCoder");//Both ways are same works to add elements into the Stack.
//        stack.add("AnkitCoder");
//        stack.add("NitnCoder");
        stack.push("RitikCoder");
        stack.push("AnkitCoder");
        stack.push("NitnCoder");
        System.out.println(stack);

        //Removing elements into the Stack.
        stack.pop();
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

//        for(String elements: stack){
//            System.out.print(" "+ elements);
//        }
    }
}
