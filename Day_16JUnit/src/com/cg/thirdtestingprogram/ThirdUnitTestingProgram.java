package com.cg.thirdtestingprogram;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThirdUnitTestingProgram {
	@Test
	@DisplayName("Function tested")
	void function()
	{
		System.out.println("want to display a name:");
	}
	
	@Test
	@Disabled("not tested")
	
	void print()
	{
		System.out.println("Disable");
	}

}
