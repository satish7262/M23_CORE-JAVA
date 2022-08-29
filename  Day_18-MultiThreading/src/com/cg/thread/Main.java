package com.cg.thread;

public class Main {
	public static void main(String[] args) {
		
		Thread t=Thread.currentThread();
		System.out.println("Current thread:"+t);
		
		t.setName("Void");
		System.out.println("Current thread:"+t);
		
		try
		{
			Thread.sleep(0);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread is Interrupted");
		}

	}

}

}
