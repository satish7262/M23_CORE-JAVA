package com.cg.annotation;
class car
{
	void speed(int s)
	{
		System.out.println(" car speed is:"+s);
	}
}
class BMD extends car
{
	@Override 
	void speed(int s)
	{
		System.out.println("speed is:"+s);
	}
	
}


public class Override_Annotation {
	public static void main(String[] args) 
	{
		car c=new car();
				
		BMD b=new BMD();
		b.speed(60);
		

	}

}
