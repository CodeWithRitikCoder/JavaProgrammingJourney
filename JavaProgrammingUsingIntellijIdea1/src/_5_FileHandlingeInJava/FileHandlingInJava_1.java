package _5_FileHandlingeInJava;

import java.io.File;
import java.io.IOException;

public class FileHandlingInJava_1 {
    public static void main(String[] args) {
        System.out.println("File Handling_1 in Java.");

        //Creation of a File in Java.
        File file= new File("MyFileInJava.txt");
        try {
            file.createNewFile();

        } catch (IOException e) {
            System.out.println("There is some error while creating a file.");
            throw new RuntimeException(e);
        }
    }
}
