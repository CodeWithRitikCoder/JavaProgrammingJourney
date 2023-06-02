//Code a software to Write Data into the File in Java.
package _5_FileHandlingeInJava;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingInJava_2 {
    public static void main(String[] args) {
        System.out.println("File Handling_2 to Write data into the File in Java.");

        //Write Data into the File.
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter("MyFileInJava.txt");
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter your String :- ");
            String str= sc.nextLine();
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
