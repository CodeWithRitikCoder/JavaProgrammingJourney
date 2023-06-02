package _4_com.RitikCoder;

import java.io.*;
import java.util.Scanner;

public class FileHandling1WriteDataIntoFIle {
    public static void main(String[] args) throws IOException {
        System.out.println("Here I'm handling a file to Create a file and Write data in to the file. with RitikCoder.");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your String here = ");
        String str= new String(sc.nextLine());
        FileOutputStream fileOutputStream= new FileOutputStream("MyFile3.txt", true);
        char ch[]= str.toCharArray();
        for(int i= 0; i< str.length(); i++){
            fileOutputStream.write((char) i);
        }

    }
}