package _4_com.RitikCoder;

import java.io.*;
import java.util.Scanner;

public class FileHandlingExample1 {
    public static void main(String[] args) throws IOException {
        System.out.println("File Handling Example 1 in Java with RitikCoder.");
        Scanner sc=new Scanner(System.in);
        FileOutputStream fileOutputStream= new FileOutputStream("MyFile2.txt",true);
        System.out.format("Enter your String here = ");
        String Str= new String(sc.nextLine());
        char ch[]= Str.toCharArray();
        for(int i= 0; i< Str.length(); i++){
            fileOutputStream.write(ch[i]);
        }
        fileOutputStream.close();
    }
}
