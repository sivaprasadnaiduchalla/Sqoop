package com.thread;

public class MyThread extends Thread{
	
	public void run()
	{
		System.out.println("my thread");
		System.out.println("my thread");
		System.out.println("my thread");
	}
	public static void main(String[] args)
	{
		MyThread t1= new MyThread();
		t1.start();
		System.out.println(t1.getName());
		System.out.println("main thread");
		System.out.println("main thread");
		t1.setName("mouni");
		System.out.println(t1.getName());
		System.out.println(Thread.currentThread().getName());
	}
	}
