package com.cg.secondestingprogram;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecondUnitTestingProgram {
	@Test
	@BeforeAll
	static void display()
	{
		System.out.println("before all excute before all the test method:");
	}
	@Test
	@BeforeEach
	void accept()
	{
		System.out.println("hey");
	}
	@Test
	
	void print()
	{
		System.out.println("hello guys:");
	}


}
