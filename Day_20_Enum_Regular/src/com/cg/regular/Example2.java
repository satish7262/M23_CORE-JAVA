package com.cg.regular;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Example2 {
	public static void main(String[] args)
	{
		Pattern obj=Pattern.compile("Programming:");
		Matcher m=obj.matcher("java programming is good");
		
		while(m.find())
		{
			System.out.println("pattern found from "+m.start()+m.end());
		}
		System.out.println("Nothing");
	}

}
