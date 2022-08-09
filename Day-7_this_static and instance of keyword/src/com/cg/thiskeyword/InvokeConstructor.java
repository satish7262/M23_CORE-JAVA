package com.cg.thiskeyword;
class Z
{
	public int x;
	Z()
	{
		this(23);
		System.out.println("Default Consstructor");
	}
	 Z(int x)
	 {
		 System.out.println("Value is: "+x);
		// TODO Auto-generated constructor stub
	}
	
}

public class InvokeConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Z obj=new Z();

	}

}
