package _5_FileHandlingeInJava;

import java.io.File;

public class FileHandlngInJava_4 {
    public static void main(String[] args) {
        System.out.println("File Handling_4 to Delete a Created File in Java.");

        //Deleting a file in Java.
        File file= new File("MyFileInJava.txt");
        if(file.delete()){
            System.out.println("Your - "+ file.getName()+" - file is deleted successfully in Java.");
        }else{
            System.out.println("There is some Problem occurred while deleting your file in java.");
        }
    }
}
