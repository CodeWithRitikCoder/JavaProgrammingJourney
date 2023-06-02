package _5_FileHandlingeInJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandlingInJava_3 {
    public static void main(String[] args) {
        System.out.println("File Handling_3 to Read data form the File in Java.");

        //Read data from the file in Java.
        File file= new File("MyFileInJava.txt");
        try {
            Scanner sc= new Scanner(file);
            while(sc.hasNextLine()) {
                String str= sc.nextLine();
                System.out.println(str);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
