package com.tns.operator;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		boolean res=x>y && x<y;
		boolean res1=x>y || x<y;
		boolean res2= !(x>y);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		

	}

}
