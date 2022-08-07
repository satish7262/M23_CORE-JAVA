package com.tns;

import java.util.Scanner;

public class Recuirsion {
	static int factorial(int n)
	{
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));
		

	}

}
