package com.deque;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class Deque_Iterator {
	public static void main(String[] args) {
		Queue<Integer> q=new ArrayDeque<>();
		
		for(int i=10;i<15;i++)
		{
			q.add(i);
			
		}
		System.out.println(q);
		// Iterator as can you use for the iterating purpose:
		
		Iterator<Integer> itr=q.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		boolean isadded=q.offer(25);
		System.out.println("Isadded:"+isadded);
		System.out.println(q);

	}


}
