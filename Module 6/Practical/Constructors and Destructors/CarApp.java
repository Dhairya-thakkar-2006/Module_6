package com.demo;

class Car {
    // Attributes
    String model;
    String color;
    int year;

    // Parameterized constructor
    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}

public class CarApp {
 public static void main(String[] args) {
     Car car = new Car("Tesla Model 3", "Red", 2023);

     // Display car details
     car.displayDetails();
 }
}
