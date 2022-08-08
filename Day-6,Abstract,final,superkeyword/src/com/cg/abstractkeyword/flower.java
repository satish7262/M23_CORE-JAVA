package com.cg.abstractkeyword;

public abstract class flower {
	abstract void print();
	void display()
	{
		System.out.println("this is normal method");
	}
}
class Rose extends flower
{
	void print()
	{
		System.out.println("this is abstract class method");
	}
}
public class Abstarct_Class {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rose r=new Rose();
		r.print();
		r.display();

	}
}

