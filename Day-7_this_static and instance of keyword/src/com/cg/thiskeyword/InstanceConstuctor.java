package com.cg.thiskeyword;
class A
{
	public int num;
	A()
	{
		System.out.println("Welcome to M23 Batch");
	}
	A(int num)
	{
		this.num=num;
		System.out.println("Num is: "+num);
	}
}

public class InstanceConstuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		A b=new A(5);
		System.out.println(b.num);

	}

}
