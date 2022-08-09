package com.cg.thisdemo;

public class Derived extends Base1
{
	Derived()
	{
			System.out.println("Default constructor for Derived");
	}
	Derived(int i)
	{
		this();
		System.out.println("Parametrized constructor for Derived"+i);
	}

}
