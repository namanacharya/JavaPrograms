package com.oops;
/*
 * Constructor: it is a special member function, which is initialised by its own
 * Reasons for special
 * 1. Same name as Class name (you can not use different name)
 * 2. No return type (void, double, static are return types so no Return types)
 * 3. Automatically invoked whenever object is created 
 * 
 * Types of Constructor
 * 1. Default Constructor: Without Parameter
 * 2. Parameterised Constructor: With parameter
 * 3. Copy Constructor: object as a parameter
 * 
 * Constructor Overloading: same name but different values
 * 
 * 
 */

class Box
{
	int length,width,height;
	//Default constructor without parameter, called constructor because class name is same as method name, it is by default Public
	public Box() 
	{
		length=5;
		width=10;
		height=10;
		System.out.println("--------------------------");
		System.out.println("Defualt constructor called");
		System.out.println("--------------------------");
	}
	//Parameterised constructor with parameter, values will be passed in the constructor and it will be defined in constructor
	public Box(int l, int w, int h) //considered as Constructor overloading too, because same name but it contain values
	{
		length=l;
		width=w;
		height=h;
		System.out.println("--------------------------");
		System.out.println("Parameterised constructor called");
		System.out.println("--------------------------");
	}
	//Copy Constructor Object as a parameter
	public Box(Box b) //considered as Constructor overloading too, because same name but it contain objects
	{
		System.out.println("-----------------------");
		System.out.println("Copy Constructor called");
		System.out.println("-----------------------");
		length=b.length;
		width=b.width;
		height=b.height;
	}
	public void volumeOfBox() //Function created for calculating and printing the volume 
	{
		System.out.println("Length is        : "+length);
		System.out.println("Width is         : "+width);
		System.out.println("Height is        : "+height);
		System.out.println("Volume of Box is : "+(length*width*height));
	}
}

public class Constructor 
{
	public static void main(String[] args)
	{
		Box b=new Box();//default constructor
		b.volumeOfBox();
		Box pc=new Box(10, 5, 5);//parameterised constructor
		pc.volumeOfBox();
		Box cc=new Box(pc);//copy constructor if we pass b1 (the b1 parameterised constructor called) if we pass b(the b default constructor called)
		cc.volumeOfBox();
	}
}
