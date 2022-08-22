package com.set;
import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashsetClass {
public static void main(String[] args) {
		
		Set <Object> obj=new LinkedHashSet<>();
		obj.add("heha");
		obj.add(12.4);
		obj.add(23);
		
		Object [] arr=obj.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		System.out.println();
		for(Object itr:arr)
		{
			System.out.println(itr);
		}
}

}
