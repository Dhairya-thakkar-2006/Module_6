package com.example;

class Custom_exception_class {

	static class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }

    static void checkNumber(int num) throws MyException {
        if (num < 0) {
            throw new MyException("Number cannot be negative!");
        } else {
            System.out.println("Valid number: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (MyException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        try {
            checkNumber(10);
        } catch (MyException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
