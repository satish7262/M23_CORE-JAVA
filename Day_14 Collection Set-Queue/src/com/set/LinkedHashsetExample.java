package com.set;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetExample {
	public static void main(String[] args) {
		Set <Object> s=new LinkedHashSet<>();
		s.add(45);
		s.add(45);
		s.add(78);
		s.add(23);
		s.add(null);
		s.add(18);
		s.add("ssd");
		System.out.println(s);

	}

}
