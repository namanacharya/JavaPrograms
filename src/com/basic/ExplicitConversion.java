package com.basic;
// known as typecasting, we can change the datatypes of value
//ex integer become float, float become double, character become integer
public class ExplicitConversion {
public static void main(String[] args){
	int a=65;
	long l=a;
	float f=a;
	double d=a;
	char ch=(char)a;
	byte b1=(byte)a;
	
	System.out.println("Integer a = "+a);
	System.out.println("Long integer l = "+l);
	System.out.println("Float f = "+f);
	System.out.println("Double d = "+d);
	System.out.println("Character ch = "+ch); //it will display its ascii value
	System.out.println("Byte b = "+b1);
}
}
