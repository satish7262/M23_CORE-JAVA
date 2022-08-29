package com.cg.enumpro;


public class Example2 {
	
		enum color
		{
			red,green,blue;
		}
	public static void main(String[] args) {
		//color c=color.blue;
		//System.out.println(c);
		
		for(color c:color.values())
		{
			System.out.println(c);
		}
	}


}
