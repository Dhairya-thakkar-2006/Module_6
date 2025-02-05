package com.example;

public class Multiple_Catch 
{
	public static void main(String[] args) 
	{
		try {
	        int[] numbers = new int[5];
	        numbers[10] = 25;
	        int result = 10 / 0;

	        String str = null;
	        int length = str.length();

	    } catch (ArrayIndexOutOfBoundsException e)
		{
	        System.out.println("Error: Array index out of bounds.");
	    } catch (ArithmeticException e) {
	        System.out.println("Error: Division by zero.");
	    } catch (NullPointerException e) {
	        System.out.println("Error: Null pointer exception.");
	    } catch (Exception e) {
	        System.out.println("An unknown error occurred.");
	    } finally {
	        System.out.println("This block always runs, regardless of an exception.");
	    }

	    System.out.println("Program continues to run after exception handling.");
	}

}
