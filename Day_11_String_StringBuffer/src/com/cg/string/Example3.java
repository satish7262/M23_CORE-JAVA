package com.cg.string;

public class Example3 {
public static void main(String[] args) {
		
		String str1=new String("hello");
		
		String str2=new String("hello");
		
		System.out.println(str1==str2);
		
		System.out.println(str1.equals(str2));//it not check the memory location
	}

}

