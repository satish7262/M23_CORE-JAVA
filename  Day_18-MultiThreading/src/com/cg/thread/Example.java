package com.cg.thread;

public class Example {
	public void run()
	{
		System.out.println("Thread is running");
	}
public static void main(String[] args)
{
	Example t=new Example ();
	t.start();
	t.run();

}

}

