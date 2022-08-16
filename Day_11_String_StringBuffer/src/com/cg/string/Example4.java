package com.cg.string;

public class Example4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str1="Dhoni";
		String str2=new String();
		str2=sc.nextLine();
		if(str1.equals(str2))
		{
			System.out.println("String get matched:");
		}
		else
		{
			System.out.println("String get mismatched:");
		}
	}


}
