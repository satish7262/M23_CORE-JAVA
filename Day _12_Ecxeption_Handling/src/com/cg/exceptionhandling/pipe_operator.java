package com.cg.exceptionhandling;
import java.util.Scanner;
public class pipe_operator {
	public static void main(String[] args) {
		String s[]= {"abc","123","null","xyz"};
		for(int i=0;i<4;i++)
		{
			try
			{
			int a=s[i].length()+ Integer.parseInt(s[i]);
			}
			catch(NumberFormatException | NullPointerException |ArrayIndexOutOfBoundsException  ex)
			{
				System.out.println(ex);
			}
		}
			

	}
	

}
