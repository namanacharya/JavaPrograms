package com.basic;

public class ConvertTemprature {
	public static void main(String[] args) 
	{
		double cel,fer;
		fer=210.5;
		cel=(fer-32)*5/9;
		
		System.out.println("Temprature in Ferenhit : "+fer);
		System.out.println("Temprature in Celcious : "+cel);
	}
}
