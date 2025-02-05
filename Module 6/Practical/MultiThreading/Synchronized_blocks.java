package com.example;

class BankAccount {
    private int balance = 100;

    // Using synchronized block to protect shared resource
    void withdraw(int amount) {
        synchronized (this) {  // Synchronized block
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("Not enough balance for " + Thread.currentThread().getName());
            }
        }
    }
}

class Customer extends Thread {
    BankAccount account;
    int amount;

    Customer(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

public class Synchronized_blocks {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Customer c1 = new Customer(account, 70);
        Customer c2 = new Customer(account, 50);

        c1.start();
        c2.start();
    }
}
