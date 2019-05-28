package com.thread;

public class WithoutThread {

	public static void main(String[] args)
	{
	   A a1 = new A();
		a1.setDaemon(true);
		Thread t = new Thread(a1);
		t.start();
		a1.start();
		A a2 = new A();
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(a2);
		a2.start();
		System.out.println(Thread.activeCount());
		for(int i= 0; i<= 10; i++) {
			System.out.println("main" + i);
				
		}
		
	}

}

class  A extends Thread implements Runnable
{
	
	public void run()
	{
		for(int i= 0; i<= 10; i++) {
			System.out.println("Thread" + i);
			
					
		}
		
			
		}
	}
	
