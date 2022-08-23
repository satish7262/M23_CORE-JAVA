package com.genericinterface;
interface abc <t1,t2>
{
	 <t1> void display1(t1 x);
	 <t2> void display2(t2 y);
	
}

public class GenericInterface implements abc {
public static void main(String[] args) {
		
		Generic_Interface gi=new 	Generic_Interface();
		gi.display1(11);
		gi.display2(12);

	}

	public void display1(Object X)
	{
		System.out.println("value of x is:"+X);
		
	}

	public void display2(Object y) 
	{
		System.out.println("value of y is:"+y);
		
	}

}


