package assignment;
//find factorial of given number

public class Factorial 
{
	public static void main(String[] args)
	{
		int n=5,f=1;
		System.out.println("Find factorial of number: " +n);
		System.out.println("-------------------------------");
		
		for (int i = 1; i <=n; i++)
		{
			f=f*i;
		}
		System.out.println("Factorial of "+n+" is : "+f);
		
	}
}
