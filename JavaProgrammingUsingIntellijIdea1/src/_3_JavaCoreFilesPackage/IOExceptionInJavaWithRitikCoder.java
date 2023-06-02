package _3_JavaCoreFilesPackage;

import java.io.IOException;

public class IOExceptionInJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("IO Exception Example");
        try{
            throw new IOException();
//            System.out.println("After Exception");
        }
        catch (IOException e){
            System.out.println("Exception = "+ e.getMessage());
        }

    }
}