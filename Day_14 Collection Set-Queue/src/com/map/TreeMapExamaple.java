package com.map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExamaple {
	public static void main(String[] args) {
		NavigableMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(12,"Sambhaji");
		map.put(14,"Tanaji");
		map.put(16,"ac");
		map.put(19,"bc");
		map.put(18,"dfg");
		map.put(17,"xyz");
		
		System.out.println(map.firstKey());

		System.out.println(map.firstEntry());
		System.out.println(map.lastKey());

		System.out.println(map.lastEntry());
		System.out.println(map);
		
		

	}


}
