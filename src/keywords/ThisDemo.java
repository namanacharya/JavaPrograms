package keywords;
/*
 * This: Current class Context.
 * when instance ( class / global) variable is same as argument name/parameter name at that time THIS keyword has been used to separate context
 *  
 */
class TDemo
{
	int f_no,s_no;
	
	public void SetData(int f_no,int s_no)
	{
		this.f_no=f_no;
		this.s_no=s_no;
	}
	public void sum()
	{
		System.out.println("Value of First  No: "+f_no);
		System.out.println("Value of Second No: "+s_no);
		System.out.println("Summation is      : "+(f_no+s_no));
	}
}
public class ThisDemo 
{
	public static void main(String[] args)
	{
		TDemo tD=new TDemo();
		tD.SetData(20, 50);
		tD.sum();
	}
}
