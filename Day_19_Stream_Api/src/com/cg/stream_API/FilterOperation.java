package com.cg.stream_API;
import java.util.Arrays;
import java.util.List;


public class FilterOperation {

	public static void main(String[] args) {
		List<Float> list1=Arrays.asList(12.3f,56.6f);
		list1.stream().filter((i) -> i> 3f).forEach(System.out::println);
		

	}

}
