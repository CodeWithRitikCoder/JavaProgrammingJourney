package _4_com.RitikCoder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingReadingDataUsingBufferedClassInJavaWithRitiKCoder {
    public static void main(String[] args) throws IOException {
        System.out.println("File handing Read data from file using BufferedReader Class.");
        BufferedReader bufferedReader= new BufferedReader(new FileReader("MyFile3.txt"));
        char []s= new char[77];
        bufferedReader.read(s);
        System.out.println(s);
        bufferedReader.close();
    }
}
