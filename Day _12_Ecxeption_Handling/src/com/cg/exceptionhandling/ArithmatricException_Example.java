package com.cg.exceptionhandling;
import java.util.Scanner;
public class ArithmatricException_Example {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		int a=sc.nextInt();
		int res=a/0;
		System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
