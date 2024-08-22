package com.basic;

public class salary {
public static void main(String[] args) {
	int bs=10000; //pre defined
	double dar=0.25; //da 25%
	double hrar=0.15; //hra 15%
	
	double da=bs*dar; //da calculations
	double hra=bs*hrar; // hra calculations
	
	double ts=bs+da+hra; //total salary calculations
	
	System.out.println("------------------------");
	System.out.println("  Salary Calculations");
	System.out.println("------------------------");
	System.out.println("Basic Salary   : "+bs);
	System.out.println("DA             : "+da);
	System.out.println("HRA            : "+hra);
	System.out.println("------------------------");
	System.out.println("Total Salary   : "+ts);
}
}
