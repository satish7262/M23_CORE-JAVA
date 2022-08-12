package com.cg.array;
import java.util.Scanner;
public class ArraydemoUserInput {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		//array declaration
		int arr[]=new int[size];
		System.out.println("Enter the values: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+i+" index");
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++);
		
	}

}
