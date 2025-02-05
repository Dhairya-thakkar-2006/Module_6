package com.demo;


class Device {
    public void powerOn() {
        System.out.println("Device is powering on");
    }
}

class Phone extends Device {
    @Override
    public void powerOn() {
        System.out.println("Phone booting up: Welcome to Android!");
    }
}

class Laptop extends Device {
    @Override
    public void powerOn() {
        System.out.println("Laptop starting: Windows login screen appears");
    }
}

public class ChildClass {
    public static void main(String[] args) {
        Device myDevice;
        
        myDevice = new Phone();
        myDevice.powerOn();
        
        myDevice = new Laptop();
        myDevice.powerOn();
    }
}