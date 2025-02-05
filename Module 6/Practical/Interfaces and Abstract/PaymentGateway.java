package com.demo;

interface PaymentProcessor  {
    void processPayment(double amount);

    void refundPayment(double amount);
}

class CreditCardPayment implements PaymentProcessor  {

    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }

    public void refundPayment(double amount) {
        System.out.println("Refunding Credit Card payment of $" + amount);
    }
}

class PayPalPayment implements PaymentProcessor  {

    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }

    public void refundPayment(double amount) {
        System.out.println("Refunding PayPal payment of $" + amount);
    }
}


public class PaymentGateway 
{
	public static void main(String[] args) {
		PaymentProcessor  creditCard = new CreditCardPayment();
		PaymentProcessor  payPal = new PayPalPayment();

        creditCard.processPayment(100.50);
        payPal.processPayment(200.75);

        creditCard.refundPayment(50.00);
        payPal.refundPayment(100.00);
    }
}
