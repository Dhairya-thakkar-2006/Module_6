package com.demo;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Display implements Printable, Showable {

    public void print() {
        System.out.println("Printing something...");
    }

    public void show() {
        System.out.println("Showing something...");
    }
}


public class MultipleInterfaces_SingleClass 
{
	public static void main(String[] args) {
        Display display = new Display();

        display.print();
        display.show();
    }
}
