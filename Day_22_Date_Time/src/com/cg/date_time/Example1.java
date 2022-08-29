package com.cg.date_time;
import java.time.LocalDate;


public class Example1 {
	public static void main(String[] args) {

		LocalDate date1=LocalDate.now();
		LocalDate date2=date1.plusDays(12);
		System.out.println(date2);
				
	}

}
