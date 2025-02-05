package com.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {
        String filename = "example.txt";
        String content = "Hello, this is a file handling example in Java!";
        

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        

        try (FileReader reader = new FileReader(filename)) {
            int character;
            System.out.print("File content: ");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
