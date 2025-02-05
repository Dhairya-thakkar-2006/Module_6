package com.demo;

class Person {
    Person() {
        System.out.println("Person constructor called.");
    }
    
    void speak() {
        System.out.println("People can speak.");
    }
}

class Engineer extends Person {
    Engineer() {
        super(); // Call parent class constructor
        System.out.println("Engineer constructor called.");
    }
    
    @Override
    void speak() {
        super.speak(); // Call parent class method
        System.out.println("Engineer is designing and speaking.");
    }
}

class Teacher extends Person {
    Teacher() {
        super();        System.out.println("Teacher constructor called.");
    }
    
    @Override
    void speak() {
        super.speak();
        System.out.println("Teacher is teaching and speaking.");
    }
}


public class Superkeyword_Parentclass 
{
	 public static void main(String[] args) {
	        Person myPerson;
	        
	        myPerson = new Engineer();
	        myPerson.speak();
	        
	        myPerson = new Teacher();
	        myPerson.speak();
	    }
}
