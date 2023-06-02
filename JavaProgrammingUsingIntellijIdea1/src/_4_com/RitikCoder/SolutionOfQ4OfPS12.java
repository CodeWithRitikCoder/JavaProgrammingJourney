//Prove that you cannot access default property but can access protected property from the subclass.

package _4_com.RitikCoder;

import _2_Logos.JavaFile;

public class SolutionOfQ4OfPS12  extends JavaFile{
    public static void main(String[] args) {
        System.out.println("Solution Of Q-4 Of PS-12");

        JavaFile javaFile= new JavaFile();
        System.out.println(""+ javaFile.pubInt);

    }
}
