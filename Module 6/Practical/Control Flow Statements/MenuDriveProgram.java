package com.demo;

import java.util.Scanner;

public class MenuDriveProgram 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Menu:");
        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Multiply two numbers");
        System.out.println("4. Divide two numbers");
        System.out.println("5. Exit");

        System.out.print("\nEnter your choice (1-5): ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int num2 = scanner.nextInt();
                System.out.println("Result: " + (num1 + num2));
                break;

            case 2:
                System.out.print("Enter first number: ");
                num1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                num2 = scanner.nextInt();
                System.out.println("Result: " + (num1 - num2));
                break;

            case 3:
                System.out.print("Enter first number: ");
                num1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                num2 = scanner.nextInt();
                System.out.println("Result: " + (num1 * num2));
                break;

            case 4:
                System.out.print("Enter first number: ");
                num1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                num2 = scanner.nextInt();
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                }
                break;

            case 5:
                System.out.println("Exiting the program. Goodbye!");
                break;

            default:
                System.out.println("Invalid choice! Please choose a valid option.");
        }

        scanner.close();
	}
}
