package com.cg.linkedlist;
import java.util.LinkedList;


public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList <Integer> l=new LinkedList<>(); //Integer LinkedList:::
		
		l.add(12);
		l.add(13);
		System.out.println(l);
		
		
		LinkedList <Object> l1=new LinkedList<>();// object type elements::
		l1.add("Sambhaji");
		l1.add(21);
		l1.add(1.3);
		System.out.println(l1.size());
		
		System.out.println("Heterogeoues elements in linked list:"+l1);
		
		LinkedList <Character> l2=new LinkedList<>();// Characher type linkedlist::: 
		l2.add('S');
		l2.add('a');
		l2.add('m');
		l2.add('b');
		l2.add('h');
		l2.add('a');
		l2.add('j');
		l2.add('i');
		
		System.out.println(l2);
		
		
		
		

	}

}
