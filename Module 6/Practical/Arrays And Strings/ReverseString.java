package com.demo;

import java.util.Scanner;

public class ReverseString 
{
	 public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder(str);
	        return reversed.reverse().toString();
	    }

	    public static boolean isPalindrome(String str) {
	        String reversed = reverseString(str);
	        return str.equalsIgnoreCase(reversed);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String reversedString = reverseString(input);
	        System.out.println("Reversed String: " + reversedString);

	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	        
	        scanner.close();
	    }
}
