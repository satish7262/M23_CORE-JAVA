package com.cg.arraylist;
import java.util.ArrayList;


public class ArrayListExample {
	public static void main(String[] args) {
		// Integer Arraylist 
		ArrayList <Integer> al=new ArrayList<>();
		ArrayList <Integer> a2=new ArrayList<>();
		
		
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(11);
		System.out.println(al.contains(11));
		
		System.out.println("Elements of ArrayList::"+" "+al);
		
		//String Arraylist:::
		ArrayList <String > a=new ArrayList<>();
		a.add("Sambhaji");
		a.add("Samadhan");
		
		System.out.println("Elements of Arraylist of String:"+a);
		
		
		//ArrayList that stores the heterogeous elements::
		ArrayList <Object > a1=new ArrayList<>();
		a1.add(al);
		a1.add(a);
		
		
		System.out.println(a1);
		
		//ArrayList of Boolean type
		ArrayList <Boolean > b=new ArrayList<>();
		b.add(true);
		System.out.println(b);
		

	}

	

}
