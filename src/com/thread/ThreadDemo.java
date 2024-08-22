package com.thread;
/*
 * Thread:
 * Simple light weight Process
 * Single Thread: Single work at a time 
 * 
 * Multi Thread: Multiple Process at a time
 * 
 * Thread LifeCycle:
 * 1. NewBorn (start(), stop())
 * 2. Runnable (yield())
 * 3. Running (yield())
 * 4. Blocked (suspend(), sleep(t), wait(), resume(), notify(), stop())
 * 5. Dead (stop())
 * 
 * Thread can be achieved with class and interface
 * 
 */

//thread demo with class
class FirstDemo extends Thread
{
	public void run() //by-default RUN will be set
	{
		for (int i = 0; i<5; i++)
		{
			System.out.println("This is First Thread");
			try 
			{
				Thread.sleep(2000); //it will wait till 2 seconds, 2000 is mili-seconds, always take seconds data in mili-seconds format
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace(); //used for printing the error
			}
		}
	}
}
public class ThreadDemo 
{
	public static void main(String[] args)
	{
		FirstDemo fd=new FirstDemo();
		fd.start();
		
		for (int i = 0; i <5; i++)
		{
			System.out.println("This is main thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace(); //used for printing the error
			}
		}
	}
}