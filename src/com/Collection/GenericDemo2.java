package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

/* Another example of Generic
 * we will get the data from Student.java class
 * 
 */

public class GenericDemo2 
{
	public static void main(String[] args)
	{
		ArrayList<Student> a1=new ArrayList<Student>();
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Dhimahi");
		s1.setBranch("Pal");
		s1.setCity("Surat");
		
		Student s2=new Student();
		s2.setId(2);
		s2.setName("Naman");
		s2.setBranch("Pal");
		s2.setCity("Surat");
		
		a1.add(s1);
		a1.add(s2);
		//System.out.println(a1);
		
		Iterator i1=a1.iterator();
		while (i1.hasNext()) 
		{
			Student s=(Student)i1.next();
			System.out.println("---------------------------");
			System.out.println("Roll no is: "+s.getId());
			System.out.println("Name is: "+s.getName());
			System.out.println("Branch is: "+s.getBranch());
			System.out.println("City is: "+s.getCity());
		}
		

	}
}
