package CollectionFramewrokInJava;
import java.util.ArrayList;
public class ArrayListExample1ToReplaceElementsInJava {
    public static void main(String[] args) {
        System.out.println("Example 1 of Replace elements from the ArrayList.");

        ArrayList<String> arrayList= new ArrayList<>();
        //Adding of elements into ArrayList in java.
        arrayList.add("RitikCoder");
        arrayList.add("AnkitCoder");
        arrayList.add("NitinCoder");
        arrayList.add("kajalCoder");
        arrayList.add("SumitCoder");
        arrayList.add("viratCoder");
        System.out.println(arrayList);

        //Replacing elements form the ArrayList in java.
        arrayList.set(3, "VishakhaCoder");
        System.out.println(arrayList);

        arrayList.set(5, "VipinCoder");
        System.out.println(arrayList);

        arrayList.set(2, "KapilCoder");
        System.out.println(arrayList);

        //Replacing elements form the ArrayList.
        arrayList.set(2, "VishakhaCoder");
        System.out.println(arrayList);

        for(int i= 0; i<= 5; i++){
            System.out.print(" "+ arrayList.get(i));
        }
    }
}
