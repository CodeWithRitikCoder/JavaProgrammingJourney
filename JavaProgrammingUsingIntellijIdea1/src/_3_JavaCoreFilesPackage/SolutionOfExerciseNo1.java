package _3_JavaCoreFilesPackage;//Code a Software to Solve Exercise No. 1 in Java witḣ RitikCoder.
import java.util.Scanner;
public class SolutionOfExerciseNo1 {
    public static void main(String[] args) {
        /*Code a Software to calculate percentage of a given student in
        CBSE board exam. His marks from 5 subjects must be taken
        as input from the keyboard.(Marks are out of – 100).*/
        Scanner sc= new Scanner(System.in);
        System.out.println("Solution of Exercise No. 1 in Java.");
        float hindi, english, maths, computer, physic;
        System.out.format("Enter Hindi number = ");
        hindi= sc.nextFloat();
        System.out.format("Enter English number = ");
        english= sc.nextFloat();
        System.out.format("Enter Maths number = ");
        maths= sc.nextFloat();
        System.out.format("Enter Computer number = ");
        computer= sc.nextFloat();
        System.out.format("Enter Physic number = ");
        physic= sc.nextFloat();
        float result= ((hindi+ english+ maths+ computer+ physic)/ 5);
        System.out.println("Your got = "+ result+ "% percentages");
    }
}
