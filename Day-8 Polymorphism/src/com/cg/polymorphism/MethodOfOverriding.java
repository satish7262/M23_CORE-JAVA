package com.cg.polymorphism;

class Multiplication
{
	void accept(int a,int b)
	{
		System.out.println(a*b);
	}
	
}
class Muls extends Multiplication
{
	void accept (int x,int y) 
	{
		System.out.println(x*y);
	}
}

public class MethodOfOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Muls m=new Muls();
		m.accept(4,5);
		Multiplication m1=new Multiplication();
		m1.accept(6, 7);

	}

}
