package com.thread;


//thread demo with Interface
class Second implements Runnable //interface
{
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("This is second thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
public class RunnableDemo 
{
	public static void main(String[] args)
	{
		Second sc=new Second();
		Thread t=new Thread(sc);
		t.start();
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println("This is main thread");
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
