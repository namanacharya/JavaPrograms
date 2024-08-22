package com.oops;
/* Method Overriding can be used using Inheritance only
 * Method Overriding: Method with same name and same prototype
 * Super Keyword: Call the method of immediate parent
 */
class A //This is Multilevel inheritance, means we have one grandparent, parent and child 
{
	public A() 
	{
		System.out.println("A Class constructor");
	}
	public void show() 
	{
		System.out.println("A Class show");
	}
}
class B extends A //A is the Super class of A
{
	public B() 
	{	
		System.out.println("B Class constructor");
	}
	public void show()
	{
		super.show(); //show the data from class A 
		System.out.println("B Class show");
	}
}
class C extends B //B is the Super class of C
{
	public C() //it is constructor because Class name and function name is similar
	{
		System.out.println("C Class constructor");
		System.out.println("--------------------");
	}
	public void show() 
	{
		super.show(); //if we want to show the data from class B  then we have to initialise super keyword, it will call from its super class 
		System.out.println("C Class show");//it will display the data
	}
}
public class ConstructorChaining 
{
	public static void main(String[] args)
	{
		C c1=new C();
		c1.show();
	}
}
