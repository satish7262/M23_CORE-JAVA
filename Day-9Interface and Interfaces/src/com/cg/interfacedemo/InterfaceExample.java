package com.cg.interfacedemo;
interface A
{
	void print();
	void display();
}
class B implements A
{
	public void print()
	{
		System.out.println("Technoserve India Foundation");
	}
	public void display()
	{
	
		System.out.println("Java Full Stack");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.print();
		b.display();

	}

}
