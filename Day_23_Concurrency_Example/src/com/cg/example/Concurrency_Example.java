package com.cg.example;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Concurrency_Example  implements Runnable {
	final Main m;
	final int n;
	final String task;
	public Concurrency_Example(Main m,int n,String task)
	{
		this.m=m;
		this.n=n;
		this.task=task;
		
	}
	@Override
	public void run() {
		for(int i=0;i<3;i++)
		{
			System.out.println("This is thread"+Thread.currentThread().getName());
			
		}
		m.paouse(Math.random());
		
	}


	public static void main(String[] args)
	{
		new Main().print();
		

	}

}
class Main
{
	public void print()
	{
		ExecutorService t=Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++)
		{
			t.execute(new Concurrency_Example(this, i+1, "task"));
		}
			t.shutdown();
		
		
	}
	void paouse(double sec)
	{
		try
		{
			Thread.sleep(23);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured::");
		}
	}
}
