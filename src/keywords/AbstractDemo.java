package keywords;
/*
 * Total number of keywords in java
 * - abstract     - super          - final
 * - this         - static         - interface
 * 
 * Abstraction: Details are hidden only essential information is shown.
 * It can be used with class:
 * 1. we cannot create object of abstract class
 * 2. We have to (must) inherit into some other class
 * 
 * It can be used with Method:
 * 1. abstract method can not be defined as body/ abstract method can not have body 
 * 2. Abstract method must implement into child class (we have to inherit into child class to what to do)
 * 3. Abstract method must have abstract class
 */
abstract class ADemo
{
	int r_no;
	String name;
	
	public void setData() 
	{
		r_no=4;
		name="Naman";
	}
	public abstract void show(); //abstract method, we can't define body 
}
class Demo extends ADemo //for accessing ADemo abstract class we have to Inherit that class in to another class
{

	@Override
	public void show() //to access abstract show method we have to define the data here.
	{
		// TODO Auto-generated method stub
		System.out.println("    Employee Details");
		System.out.println("----------------------------");
		System.out.println("Roll Number   : "+r_no);
		System.out.println("Employee Name : "+name);
	}
	
}
public class AbstractDemo
{
	public static void main(String[] args)
	{
		//ADemo ad=new Ademo(); it is abstract class so we can't create object of it.
		Demo d=new Demo(); //another class has been created and abstract class has been extended in that class
		d.setData();
		d.show();
	}
}
