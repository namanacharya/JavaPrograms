package com.basic;

public class AggrigateMarks {
	public static void main(String[] args) 
	{
		int a=70,b=75,c=50,d=80,e=40,tot,per;
		tot=a+b+c+d+e;
		per=tot/5;
		
		System.out.println("       Marksheet ");
		System.out.println("-----------------------------------");
		System.out.println("Marks of Subject A are     : "+a);
		System.out.println("Marks of Subject B are     : "+b);
		System.out.println("Marks of Subject C are     : "+c);
		System.out.println("Marks of Subject D are     : "+d);
		System.out.println("Marks of Subject E are     : "+e);
		System.out.println("-----------------------------------");
		System.out.println("Total Marks out of 100 are : "+tot);
		System.out.println("Percentage from Marks are  : "+per);
	}
}
