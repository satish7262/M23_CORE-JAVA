package com.cg.polymorphism;
//method overloading
class A
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(float a,float b)
	{
		System.out.println(a+b);
		
	}
}

public class CompileTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.add(5, 2);
		a.add(2.5f ,4.2f);

	}

}
