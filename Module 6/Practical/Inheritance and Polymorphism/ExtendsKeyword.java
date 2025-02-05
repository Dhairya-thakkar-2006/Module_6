package com.demo;

class Vehicle {
    void move() {
        System.out.println("Vehicles can move.");
    }
}

class Truck extends Vehicle {
    void move() {
        System.out.println("Car drives on roads.");
    }
}

class Bike extends Vehicle {
    void move() {
        System.out.println("Bike rides on two wheels.");
    }
}

public class ExtendsKeyword 
{
	 public static void main(String[] args) {
	        Vehicle myVehicle = new Vehicle();
	        myVehicle.move();
	        
	        Truck myCar = new Truck();
	        myCar.move();
	        
	        Bike myBike = new Bike();
	        myBike.move();
	    }
}
