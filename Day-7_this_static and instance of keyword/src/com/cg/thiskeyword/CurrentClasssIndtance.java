package com.cg.thiskeyword;
class main
{
	public int x,y;
	main()
	{
		x=10;
		y=10;
		
	}
	main get1()
	{
		return this;
	}
	public void display()
	{
		System.out.println("Multiplication of x and y is: "+(x*y));
		
	}
}

public class CurrentClasssIndtance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main m=new main();
		m.get1().display();

	}

}
