package com.cg.date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Example3 {
	public static void main(String[] args) {
	LocalDateTime str=LocalDateTime.now();
	DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
	String str1=str.format(dtf);
	System.out.println();
	}
	

}
