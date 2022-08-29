package com.cg.regular;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Example1 {
	public static void main(String[] args) {
		String pattern="sambhaji";
		Scanner s=new Scanner(System.in);
		
		String input=s.nextLine();
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);
		s.close();

	}


}
