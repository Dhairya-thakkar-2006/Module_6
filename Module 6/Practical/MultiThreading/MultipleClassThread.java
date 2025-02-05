package com.example;

public class MultipleClassThread extends Thread { 
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
    }

    public static void main(String[] args) {
        MultipleClassThread t1 = new MultipleClassThread();
        MultipleClassThread t2 = new MultipleClassThread();
        MultipleClassThread t3 = new MultipleClassThread();

        t1.start();
        t2.start();
        t3.start();
    }
}

