package com.basic;

public class FindDuplicate {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,2,3,4,6,7};
		System.out.println("Duplicate Elements from an Array are : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}
}
