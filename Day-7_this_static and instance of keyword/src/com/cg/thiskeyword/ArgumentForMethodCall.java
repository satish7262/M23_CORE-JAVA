package com.cg.thiskeyword;
class B
{
	public void accept(B b)
	{
			System.out.println("Accept1 method");
	}
	public void accept2()
	{
		accept1(this);
	}
}

public class ArgumentForMethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		B.accept1(b);

	}

}
