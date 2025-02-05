package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileinputstream_Fileoutputstream {
    public static void main(String[] args) {
       
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            
            inputStream = new FileInputStream(sourceFile);

            
            outputStream = new FileOutputStream(destinationFile);

            int byteData;
            
            
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            try {
                
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing streams: " + e.getMessage());
            }
        }
    }
}
