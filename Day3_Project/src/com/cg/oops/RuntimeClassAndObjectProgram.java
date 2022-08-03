package com.cg.oops;
import java.util.Scanner;
import java.lang.System;
class Vehicle
{
	//Variable
	public int a;
	//user-define method
	void display()
	{
		System.out.println("Welcome to M23 Batch");
	}
}

public class RuntimeClassAndObjectProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj=new Vehicle();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value for a:");
		
		obj.a=s1.nextInt();
		obj.display();
		//accessing the class variable
		System.out.println(obj.a);
		s1.close();

	}

}
