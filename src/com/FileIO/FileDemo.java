package com.FileIO;
/*
 * File: It is a class
 * 
 */

import java.io.File;
import java.io.IOException;

class FDemo
{
	File file;
	
	public FDemo() throws IOException
	{
		file=new File("file3.txt");
		file.createNewFile();
		System.out.println("This is Demo File");
		display();
	}
	public void display() 
	{
		System.out.println("Is file or not : "+file.isFile());
		System.out.println("Is directory or not : "+file.isDirectory());
		System.out.println("Can Read or not : "+file.canRead());
		System.out.println("Can Write or not : "+file.canWrite());
		System.out.println("Can Execute or not : "+file.canExecute());
		System.out.println("File Name : "+file.getName());
		System.out.println("File Path : "+file.getPath());
		System.out.println("File Path : "+file.getAbsolutePath());
		
	}
}
public class FileDemo 
{
	public static void main(String[] args) throws Exception
	{
		new FDemo();
	}
}
