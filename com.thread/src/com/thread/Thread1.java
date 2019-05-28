package com.thread;

abstract public class Thread1 extends Thread implements Runnable
{
	abstract public void run();
}

class Thread2 extends Thread1
{
	
	public void run()
	{
		if(Thread.currentThread().getName().equals("mouni"))
		{
			
			//Thread2 t2 = new Thread2();
			//t2.join();
			System.out.println("mouni thread:"+ Thread.activeCount());
			
		}
		
		if(Thread.currentThread().getName().equals("murali"))
		{
			System.out.println("murali thread:"+ Thread.activeCount());
			
		}
	}
}
