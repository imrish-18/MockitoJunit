package com.mocking.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mocking.data.DataService;

class DataServiceStub implements DataService
{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int [] {1,2,3};
	}
	
}
public class BusinessImplStubTest {
	
	
	@Test
	public void calculateStubTest()
	{
		BusinessImpl impl=new BusinessImpl();
		impl.setDataService(new DataServiceStub());
		int actualResult=impl.calculateSumDataService();
       int expectedResult=6;
       assertEquals(expectedResult,actualResult);
       //org.opentest4j.AssertionFailedError: expected: <5> but was: <6>
       // it will check both value are same then true else return false
	}
	
	@Test
	public void calculateEmptyTest()
	{
		BusinessImpl impl=new BusinessImpl();
		int actualResult=impl.calculateSumDataService();
       int expectedResult=0;
       assertEquals(actualResult, expectedResult);
	}

	
	
}
