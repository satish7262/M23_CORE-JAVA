package com.cg.fifthunittestingprogram;
import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

public class FifthUnitTestingProgram {
	@Test
	void trueAssumption()
	{
		assumeTrue(5>1);
		assertEquals(5+1,6);
	}
	@Test
	void falseAssumption()
	{
		assumeFalse(5>1);
		assertEquals(5+3,6);
	}
	
	@Test
	void assumptionaThat()
	{
		String str="shiwan";
		assumingThat(str.equals("shivam"),
		() -> assertEquals(5+7,6));
	}

}
