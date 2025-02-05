package com.example;

public class Inter_thread_communication {
    private int number;
    private boolean hasValue = false;


    synchronized void produce(int num) {
        while (hasValue) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number = num;
        hasValue = true;
        System.out.println("Produced: " + number);
        notify();
    }


    synchronized void consume() {
        while (!hasValue) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + number);
        hasValue = false;
        notify();
    }

    public static void main(String[] args) {
        Inter_thread_communication obj = new Inter_thread_communication();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                obj.produce(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                obj.consume();
                try {
                	Thread.sleep(700);  // Simulating delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}

                 
