package com.demo;

abstract class BankAccount {
    protected double balance;

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }
}


public class MethodinSubClass 
{
	 public static void main(String[] args) {
	        SavingsAccount myAccount = new SavingsAccount(1000);

	        myAccount.checkBalance();

	        myAccount.deposit(500);

	        myAccount.withdraw(200);

	        myAccount.checkBalance();
	    }
}
