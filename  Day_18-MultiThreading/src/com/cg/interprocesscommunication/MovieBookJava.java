package com.cg.interprocesscommunication;
//problem without the synchronization (inter process communication) 
class  TotalEarnings extends Thread
{ 
	int total=0;
	public void run()
	{
		synchronized(this)
		{
			for(int i=1;i<=10;i++)
				{
					total=total+100;
				}
			this.notify();
		}
	}
}
	

public class MovieBookJava {
public static void main(String[] args) throws InterruptedException {
		
		TotalEarnings te=new TotalEarnings();
		te.start();
		
		//System.out.println("Total Earnings  "+te.total); it will print the total earning is 0 bcz main thread in running first need to use synchronized 
		
		synchronized(te)
		{
			te.wait();
			System.out.println("Total Earnings  "+te.total);
			
		}
		
		
	}

	

}
