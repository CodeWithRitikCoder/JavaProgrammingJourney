package _4_com.RitikCoder;

import java.io.FileInputStream;
import java.io.IOException;

public class FileHandling1DataReadIntoFileInJavaWithRitikCoder {
    public static void main(String[] args) throws IOException {
//        FileInputStream fin= new FileInputStream("./MyFile1.txt");
        FileInputStream fin= new FileInputStream("MyFile3.txt");
        int i;
        do {
            i= fin.read();
            if(i!= -1)
                System.out.print((char) i);
        }while(i!= -1);
        fin.close();
    }
}