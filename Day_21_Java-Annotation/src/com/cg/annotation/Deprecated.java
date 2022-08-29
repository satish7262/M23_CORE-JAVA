package com.cg.annotation;
class xyz
{
	@Deprecated 

	void print()
	{
		System.out.println("print method:");
	}
}

public class Deprecated {
	public static void main(String[] args) {
		xyz x=new xyz();
		x.print();
		

	}

}
