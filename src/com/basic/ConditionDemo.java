package com.basic;

//condition statements
//1. if (if the statement is correct the statement will be print)
//2. if else(if the statement is incorrect else statement part will be executed)
//3. nested if(multiple if conditions can be executed)
//4. else if ladder
//5. switch

public class ConditionDemo {
	public static void main(String[] args) {
		int a=7,b=10,c=20; //if a=11
//		if(a>10) //it will execute only true part of condition
//		{
//			System.out.println("A's value is grater"+a);
//		}
//		else {
//			System.out.println(a+" A's value is lower"); 
//			//if we want to print before statement then write a+, a is variable name
//		}
//		--------------------------------------------------------
//		if(a<b) //if else statement 
//		{
//			System.out.println(a+ " Value is smaller than "+b);
//		}
//		else {
//			System.out.println(b+ "Value is grater than " +a);
//		}
//		--------------------------------------------------------
//		if(a>b) //nested if (if else){ 
//			if (a>c) {
//				System.out.println(a+ " A is grater than C" +c);
//			}
//			else {
//				System.out.println(c+ " C is grater than A "+a);
//			}
//		}
//			else {
//				if (b>c) {
//					System.out.println(b+ " B is grater than C " +c);
//				}
//				else {
//					System.out.println(c+ " C is grater than B " +b);
//				}
//			}
//       --------------------------------------------------------
		if (a>b && a>c) 
		{
			System.out.println("A is grater");
		} else if (b>a && b>c) 
		{
			System.out.println("B is grater");
		}
		else 
		{
			System.out.println("C is grater");
		}
}
		}

			

