package com.cg.exceptionhandling;

public class statements_At_end {
	public static void main(String[] args) {
		try
		{
			int a=121/0;
			System.out.println(a);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block::");
		}
		System.out.println("out of try catch and finally block:::");

	}

}
