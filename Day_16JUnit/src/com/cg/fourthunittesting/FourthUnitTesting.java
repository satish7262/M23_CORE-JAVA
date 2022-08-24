package com.cg.fourthunittesting;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class FourthUnitTesting {
	@Test
	void display()
	{
		int arr[]= {1,3,56,7};
		assertAll("arr" ,()-> assertEquals(arr[0],1));
	}

}
