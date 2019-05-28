package com.thread;

public class MultiThread {

	public static void main(String[] args)
	{
		
		VolattileMethod t1 = new VolattileMethod();
		VolattileMethod t2 = new VolattileMethod();
		t2.setName("t2 thread");
		t1.setName("t1 Thread");
		t2.start();
		t1.start();
		
		
			}

}
