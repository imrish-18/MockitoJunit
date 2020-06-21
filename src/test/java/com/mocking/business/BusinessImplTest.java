package com.mocking.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BusinessImplTest {
	
	@Test
	public void calculateTest()
	{
		BusinessImpl impl=new BusinessImpl();
		int actualResult=impl.calculateSum(new int[] {1,2,3});
       int expectedResult=6;
       assertEquals(expectedResult,actualResult);
       //org.opentest4j.AssertionFailedError: expected: <5> but was: <6>
       // it will check both value are same then true else return false
	}
	
	@Test
	public void calculateEmptyTest()
	{
		BusinessImpl impl=new BusinessImpl();
		int actualResult=impl.calculateSum(new int[] {});
       int expectedResult=0;
       assertEquals(actualResult, expectedResult);
	}

	
	
}
