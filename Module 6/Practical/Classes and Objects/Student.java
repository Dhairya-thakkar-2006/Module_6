package com.demo;

class Student_d {
    String name;
    int age;

    Student_d(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class Student {
    public static void main(String[] args) {
        Student_d student = new Student_d("Dhairya", 20);

        student.displayDetails();
    }
}
