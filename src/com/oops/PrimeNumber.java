package com.oops;

class prime
{
	public void CheckPrime(int n)
	{
		for (int i = 0; i<=n; i++)
		{
			boolean isPrime=true;
			for (int j = 2; j < i; j++) 
			{
				if (i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if (isPrime)
			{
				System.out.print(i+" ");
			}
		}
	}	
}

public class PrimeNumber {
public static void main(String[] args)
{
	int n=50;
	System.out.println("Prime number from 1 to "+n+ " are: ");
	prime p=new prime();
	p.CheckPrime(n);
}
}