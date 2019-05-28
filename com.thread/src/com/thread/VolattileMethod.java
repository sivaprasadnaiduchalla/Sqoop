package com.thread;

public class VolattileMethod extends Thread
{
	synchronized public void run()
	{
		for(int i=0;i<= 10; i++)
		{
		System.out.println(Thread.currentThread().getName() + ":" + Thread.activeCount() + "value of " + i);
		}
	}

}
