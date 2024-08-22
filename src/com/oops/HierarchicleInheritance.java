package com.oops;
/*
 * Hierarchical Inheritance: One parent multiple child
 */
class Parent
{
	String parent_name;
	long p_no;
	
	public void setParent() 
	{
		parent_name="Kundanlal Acharya";
		p_no=9725040706l; //add l(L) atlast of number
	}
}
class Child1 extends Parent
{
	String name="Janak";
	public void show()
	{
		System.out.println("For any complain of "+name+ " contact "+parent_name+ " his mobile number "+p_no);
	}
}
class Child2 extends Parent
{
	String name="Harshad";
	public void show()
	{
		System.out.println("For any complain of "+name+ " contact "+parent_name+ " his mobile number "+p_no);
	}
}
class Child3 extends Parent
{
	String name="Yogen";
	public void show()
	{
		System.out.println("For any complain of "+name+ " contact "+parent_name+ " his mobile number "+p_no);
	}
}
public class HierarchicleInheritance 
{
	public static void main(String[] args)
	{
		Child1 c1=new Child1();
		c1.setParent();
		c1.show();
		Child2 c2=new Child2();
		c2.setParent();
		c2.show();
		Child3 c3=new Child3();
		c3.setParent();
		c3.show();
	}
}