package com.basic;
/*
 * Loop: iterative, repetitive, doing same work in repeat work
 * 2 types: 1. Entry check (movie ticket check)
 *               for loop
 *               for(initialization; condition; increment/decrement)
 *               {
 *               }
 *               -------------------------------------------------------
 *               while loop 
 *               while(condition)
 *               {
 *               statement; 
 *               increment/decrement 
 *               }
 *               -------------------------------------------------------
 *          2. Exit check (hotel bill payment)
 *               do while
 *               do
 *               {
 *               	statement;
 *               } 
 *               while(condition)
 */
public class LoopingDemo {
public static void main(String args[]) 
{
	//for loop start, 11 time loop will execute
	System.out.println("********************");
	System.out.println("For Loop Execution");
	System.out.println("********************");
	for (int i = 1; i <=5; i++) {
		System.out.println(i);
	}
	
	//while loop start, 17 time loop will execute
	//if you don't know the endpoint at that time while loop has been used
	int k = 1;
	System.out.println("********************");
	System.out.println("While Loop Execution");
	System.out.println("********************");
	while (k<=5) {
		System.out.println(k);
		k++;
	}
	
	//do while loop start, 21 times loop will be execute
	int j=1;
	System.out.println("********************");
	System.out.println("Do while loop Execution");
	System.out.println("********************");
	do {
		System.out.println(j);
		j++;
	} while (j<=5);
}
}