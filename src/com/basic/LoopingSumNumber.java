package com.basic;
/*logic of this program is 
start with last number divide that number and then perform summation of that number 
*/
public class LoopingSumNumber {
	public static void main(String[] args) {
		int i=12345,j,sum=0;
		while (i!=0) {
			j=i%10;
			i=i/10;
			sum=sum+j;
		}
		System.out.println("Summation of given number is : "+sum);
	}
}
