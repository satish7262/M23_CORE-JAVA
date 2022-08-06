package com.tns.operator;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int res=(x=y);
		int res1=(x+=y);
		int res2=(x*=y);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		

	}

}
