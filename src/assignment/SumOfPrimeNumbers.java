package assignment;

public class SumOfPrimeNumbers 
{
	public static void main(String[] args) 
	{
		{  
			int n = 1, c, s = 0;  
			while(n <= 100)  
			{  
			c = 0;  
			int i = 2;  
			while(i <= n/2 )  
			{         
			if(n % i == 0)  
			{  
			c++;  
			break;  
			}  
			i++;  
			}   
			if(c == 0 && n != 1 )            
			{  
			s = s + n;  
			} 
			n++;  
			}  
			System.out.println("The Sum of Prime Numbers from 1 to 100 is: " + s);  
		}
	}
}
