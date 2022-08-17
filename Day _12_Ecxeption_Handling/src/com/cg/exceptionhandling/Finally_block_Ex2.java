package com.cg.exceptionhandling;

public class Finally_block_Ex2 {

	public static void main(String[] args) {

		try 
		{
			int data=30/3;
			System.out.println(data);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block get executed always:");
		}

	}


}
