package com.cg.finalkeyword;

class A
{
	A()
	{
		System.out.println("constructor");
	}
}
class B extends A 
{
	void print ()
	{
		System.out.println("parent class");
	}
}

public class Final_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.print();

	}

}
