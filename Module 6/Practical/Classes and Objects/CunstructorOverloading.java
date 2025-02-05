package com.demo;

class Cunstructor
{
	String name ;
	int age;
	
	Cunstructor()
	{
		System.out.println("This is constructor");
	}
	Cunstructor(String name , int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name is "+name);
		System.out.println("age is age"+age);
	}
}
public class CunstructorOverloading 
{
	public static void main(String[] args) 
	{
		Cunstructor obj = new Cunstructor();
		Cunstructor obj1 = new Cunstructor("dhairya", 20);
		
	}
}
