package com.map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class MapExample {
	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();
	
		map.put(6,"siddhi");
		map.put(2,"sabhnam");
		map.put(10,"neha");
		
		System.out.println(map);
		

	}

}
