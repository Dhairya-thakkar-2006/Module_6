package com.demo;

import java.util.Scanner;

public class Evenodd_exercise 
{
	public static void main(String[] args) 
	{
		// Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd using if-else
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        // Close the scanner
        scanner.close();
	}
}
