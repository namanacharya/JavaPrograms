package keywords;
/*
 * Interface: 
 * 1. Same as class but we can not create object of interface (We can create Reference)
 * 2. Interface only contain variable and method (we can't create constructor)
 * 3. All Data member/variable are final by default (We have to assign values)
 * 4. All member function are abstract by default(we can give body in method)
 * 5. Use "Implements" method to inherit some other child class
 * 6. Main purpose is to resolve multiple inheritance problem (Multiple parent single child)
 * 7. Pure Data hiding(highest data security like store money in bank) (Like Abstraction, Inheritance, Encapsulation, store money in wallet)
 * 
 * for creating interface select new => interface
 */
class Result
{
	String grade="A";
}
class IDemo extends Result implements InterDemo
{
	public void show() 
	{
		System.out.println("I no     : "+i1);
		System.out.println("Grade    : "+grade);
		System.out.println("I2 value : "+i2);
	}
}
public class Interface 
{
	public static void main(String[] args)
	{
		IDemo iD=new IDemo();
		iD.show();
	}
}
