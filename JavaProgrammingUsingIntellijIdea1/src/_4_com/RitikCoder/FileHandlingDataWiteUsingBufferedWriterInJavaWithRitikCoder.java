package _4_com.RitikCoder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDataWiteUsingBufferedWriterInJavaWithRitikCoder {
    public static void main(String[] args) throws IOException {
        System.out.println("File Handling Data Write in to file using BufferedWriter.");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your string here = ");
        String str= new String(sc.nextLine());
//        FileWriter fileWriter= new FileWriter("./MyFile1.txt");
        FileWriter fileWriter= new FileWriter("MyFile3.txt", true);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.write("\n\t"+ str);
        bufferedWriter.close();
    }
}
