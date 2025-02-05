package com.example;

public class Try_Catch_Handling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("This block always runs, regardless of an exception.");
        }

        System.out.println("Program continues to run after exception handling.");
    }
}
