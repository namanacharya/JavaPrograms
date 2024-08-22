package com.commonclass;
/*
 * Object Class: Root class of java, Parent class is known as Root Class. bydefault Parent class
 * 
 */
class A
{
	public void display()
	{
		System.out.println("This is Class A");
	}
}
public class ObjectClass 
{
	public static void main(String[] args)
	{
		A a=new A();
		a.display(); //if we write a. then we can see other objects which are by default 
	}
}
