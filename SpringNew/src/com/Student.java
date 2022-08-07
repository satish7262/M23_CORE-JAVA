package com;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class Student {
	private Map<Integer,String> stud;
	public Map<Integer ,String> getStud;{
	   return stud;
	}
	public void setStud(Map<Integer ,String> stud) {
		this.stud = stud;
		
	}
	@Override
	public String toString() {
		return "";
		
	}
	public void displayInfo()
	{
		Set<Integer> set1=stud.keySet();
		Interator<Integer> itr=set1.iterator()
		while(itr1.hasNext()) {
			Integer i=itr1.next();
			System.out.println("Roll Number"+i+"Student Name:"+stud.get(i));
		}
		
	}
	
	

}
