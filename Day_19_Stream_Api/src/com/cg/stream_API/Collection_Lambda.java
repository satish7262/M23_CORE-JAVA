package com.cg.stream_API;
import java.util.LinkedList;


public class Collection_Lambda {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer> ();
		list.add(12);
		list.add(128);
		
		System.out.println(list);

		for(Integer i:list)
		{
		System.out.println(i);
		}
		
		list.forEach(i ->System.out.println(i));
	}


}
