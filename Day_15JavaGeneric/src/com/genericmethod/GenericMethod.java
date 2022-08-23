package com.genericmethod;

public class GenericMethod {
	public static <E> void Print(E[] elments)
	{
		for(E el:elments)
		{
			System.out.println(el);
		}

	}	



	public static void main(String[] args) {
	
		Integer arr[]= {12,34,55};
		Character ch[]= {'s','d'};
		
		System.out.println("Array Elements:");
		Print(arr);
		
		System.out.println("Character Elements:");
		Print(ch);
	}

}
