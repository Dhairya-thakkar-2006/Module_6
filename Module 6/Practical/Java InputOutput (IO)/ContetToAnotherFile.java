package com.example;

import java.io.*;

public class ContetToAnotherFile 
{
	 public static void main(String[] args) {
	        try (BufferedReader reader = new BufferedReader(new FileReader("source.txt"));
	             BufferedWriter writer = new BufferedWriter(new FileWriter("destination.txt"))) {
	            
	            String line;
	            
	            while ((line = reader.readLine()) != null) {
	                writer.write(line);
	                writer.newLine();
	            }
	            
	            System.out.println("Content has been copied to the destination file.");
	            
	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
}
