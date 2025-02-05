
package com.bank;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient funds.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
}


public class UserDefined_Package {
 public static void main(String[] args) {
     BankAccount account = new BankAccount(1000);

     account.deposit(200);
     account.withdraw(100);
     account.checkBalance();
 }
}
