package com.cg.date_time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Example2 {
public static void main(String[] args) {
		
		String str="2022-04-30 12:15";
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy-MM-DD HH:mm");
		LocalDateTime t= LocalDateTime.parse(str,dtf);
		System.out.println(t);

	}

	


		

}
