package com.vetias.java.workshop.Standardlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyBinary {
    public static void main(String[] args) {
        
    try (FileInputStream inputStream = new FileInputStream("vijay.jpeg");
    FileOutputStream OutputStream= new FileOutputStream("arthi.jpeg"))
    {
        byte[] chunk = new byte[1000];
        int byteRead;
        while ((byteRead=inputStream.read(chunk))!=-1){
            OutputStream.write(chunk,0,byteRead);
        }
    } catch (IOException e) {
        System.out.println("Error in reading or writting the file");
    }
    }
}
    
        
    

