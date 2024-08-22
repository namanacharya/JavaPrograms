package com.basic;

public class FirstDemo {
	public static void main(String[] args) {
		int i1=2147483647;
		long l1=8545646546556l;
		float f1=343.565f;
		double d1=8545.4545;
		byte b1=127; //1 bit
		boolean bb=true;
		char ch='N';
		
		System.out.println("Integer Value is: "+i1);
		System.out.println("Long integer value is: "+l1);
		System.out.println("Float value is: "+f1);
		System.out.println("Double value is: "+d1);
		System.out.println("Byte value is: "+b1);
		System.out.println("Boolean value is: "+bb);
		System.out.println("Character value is: "+ch);
		System.out.println("-------------------------------");
		System.out.println("Size of integer is : "+Integer.BYTES+" bytes");
		System.out.println("Size of long integer is : "+Long.BYTES+" bytes");
		System.out.println("Size of float is : "+Float.BYTES+" bytes");
		System.out.println("Size of double is : "+Double.BYTES+" bytes");
		System.out.println("Size of byte is : "+Byte.BYTES+" bit");
		System.out.println("Size of character is : "+Character.BYTES+" bytes");
	}

}
