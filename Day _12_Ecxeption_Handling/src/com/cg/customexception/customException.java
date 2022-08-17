package com.cg.customexception;
import java.util.Scanner;

class NameNotFound extends Exception
{
	NameNotFound(String name)
	{
		super(name);
	}
	
}

public class customException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		try
		{
			
			empname(str);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}		
		static void empname(String str) throws NameNotFound
		{
			if(str.isEmpty())
			{
				throw new NameNotFound("name is empty::");
			}
			else
			{
				System.out.println("hello"+str);
			}
		}

	

}
