package com.cg.thread;
class Test 
{
	synchronized void print(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			
			try
			{
				Thread.sleep(i);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class Thread1 extends Thread 
{
	Test t;
	
	Thread1(Test t)
	{
		this.t=t;
	} 
	
	public void run()
	{
		t.print(5);
	}
	
}


class Thread2 extends Thread 
{
	Test t;
	
	Thread2(Test t)
	{
		this.t=t;
	} 
	
	public void run()
	{
		t.print(50);
	}
	
}



public class Method_Synchronized {
	public static void main(String[] args) {
		Test t=new Test();
		
		Thread1 t1=new Thread1(t);
		Thread2 t2=new Thread2(t);
		
		t1.start();
		t2.start();
	}
	

}
