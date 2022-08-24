package com.cg.collectiongenerics;

import java.util.LinkedList;

public class CollectionGenerics {
	public static void main(String[] args) {
		LinkedList<Integer> obj= new LinkedList<Integer>();
		obj.add(12);
		obj.add(14);
		obj.add(13);
		
		obj.forEach((i) ->
		{
			System.out.println(i);
		});
	}
	


}
