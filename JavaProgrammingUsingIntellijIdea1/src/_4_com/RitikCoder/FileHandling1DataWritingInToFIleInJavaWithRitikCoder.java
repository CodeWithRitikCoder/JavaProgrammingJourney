package _4_com.RitikCoder;

import java.io.*;
import java.util.Scanner;

public class FileHandling1DataWritingInToFIleInJavaWithRitikCoder {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        System.out.println("Write Data into the file.");
        FileOutputStream fout= new FileOutputStream("./MyFile1.txt", true);
        String str= new String();
        System.out.print("Enter your string here to store into the file. = ");
        str= sc.nextLine();
        char ch[]= str.toCharArray();
        for(int i= 0; i< str.length(); i++){
            fout.write(ch[i]);;
        }
        fout.close();
    }
}
