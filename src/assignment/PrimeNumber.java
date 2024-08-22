package assignment;

public class PrimeNumber 
{
	public static void main(String[] args)
	{
		int n=8,count=0;
		System.out.println("Check Enterd number "+n+" is Prime Number or Not Prime Number");
		System.out.println("---------------------------------------------------------------");
		
		if (n<=1)
		{
			System.out.println("The number "+n+" is not a Prime Number");
			return;
		} 
		for (int i = 1; i <=n/2; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if (count>1)
		{
			System.out.println("The Number "+n+" is not a Prime Number");
		} else 
		{
			System.out.println("The Number "+n+" is a Prime Number");
		}
	}
}
