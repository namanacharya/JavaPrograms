package com.oops;
/* Polymorphism 
 * Function: Does something
 * 1. Function without parameter without return type
 * 2. Function with parameter without return type
 * 3. Function without parameter with return type 
 * 4. Function with parameter with return type
 */
class calculator
{
	int a=20,b=5;
	
	//1. Function without parameter without return type
	public void sum() 
	{
		System.out.println("Function without paramenter without return type");
		System.out.println("Summation is : "+(a+b));
		System.out.println("------------------------------------------------");
	}
	
	//2. Function with parameter without return type
	public void sum(int no1,int no2)
	{
		System.out.println("Function with parameter without return type");
		System.out.println("Summation is : "+(no1+no2));
		System.out.println("------------------------------------------------");
	}
	
	//3. Function without parameter with return type 
	public double div() //if any value has been return then other datatype has been called, void is used only for default
	{
		System.out.println("Function without parameter with return type");
		return(double)a/b;
	}
	
	//4.Function with parameter with return type
	public double div(double no1, double no2)
	{
		System.out.println("Function with parameter with return type");
		return (double)no1/no2;
	}
}
public class MethodOverloading{
public static void main(String[] args)
{
	calculator c=new calculator();
	c.sum();
	c.sum(10,20);
	System.out.println("Division is : "+c.div());
	System.out.println("--------------------------");
	System.out.println("Division is : "+c.div(250, 30));
	System.out.println("--------------------------");
}
}