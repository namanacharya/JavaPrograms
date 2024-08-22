package com.basic;

public class DistanceConvert {
	public static void main(String[] args) {
		double km,mtr,ft,inch,cm;
		km=5;
		mtr=1000*km;
		ft=3.28084*mtr;
		inch=12*ft;
		cm=100*inch;
		
		System.out.println("Defined Km are : "+km);
		System.out.println("Meter are      : "+mtr);
		System.out.println("Feet are       : "+ft);
		System.out.println("Inches are     : "+inch);
		System.out.println("Cms are        : "+cm);		
	}
}
