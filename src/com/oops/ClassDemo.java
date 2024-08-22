package com.oops;
/*
 *---------------------------------------
 *oops advantages:
 *---------------------------------------
 *1. Maintainability (maintain code)
 *2. Modularity (Divide code in module) 
 *3. Reusable
 *4. Flexibility
 *---------------------------------------
 *oops concepts:
 *---------------------------------------
 *1. Class: class is a collection of data member and member function
 *2. Object: object gives the permission to access the functional way of class
 *3. Encapsulation: Wrapping of data (bag contain laptop and book, so it contain data in bag) contain multiple data
 *   It contain different type of Access Specifiers those are as follows
 *    - Public
 *    - Private: only accessible within class
 *    - Default
 *    - Protected
 *4. Polymorphism:Polymorphism allows us to perform a single action in different ways. It allows you to define one interface and have multiple implementation.
 *5. Abstraction:
 *6. Inheritance:
 *
 *java doesn't support garbage value, it shows default value int=0, string=null
 */

class StudentDetails
{ //class created 
	int roll_number;
	String name;
	
	public void setData() //function created 
	{
		roll_number=1;
		name="Naman";
	}
	public void showData()//function created 
	{
		System.out.println("Student Details");
		System.out.println("---------------------");
		System.out.println("Roll number  : "+roll_number);
		System.out.println("Student Name : "+name);
	}
}

public class ClassDemo 
{
	public static void main(String[] args) {
		StudentDetails sd=new StudentDetails(); //created object for class
		sd.setData(); //calling the class method
		sd.showData();
	}
}