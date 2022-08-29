package com.cg.stream_API;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Basic_Stream {

	public static void main(String[] args) {
		//Stream cn be created with the static data
	Stream <Integer> stream =Stream.of(12,45,79);
	
	stream.forEach(E-> System.out.println(E));
	
	//ArrayList<String> al=new ArrayList<String>();
	List<String> obj=Arrays.asList(new String[] {"latur","pune"});
	obj.forEach(E-> System.out.println(E));

	}


}
