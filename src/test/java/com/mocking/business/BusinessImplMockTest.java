package com.mocking.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import com.mocking.data.DataService;
@TestInstance(value = Lifecycle.PER_CLASS )

public class BusinessImplMockTest {
	 @InjectMocks
	 private BusinessImpl impl;
	 @Mock
	private  DataService service;
	 

	/*
	 * private BusinessImpl impl=new BusinessImpl(); 
	 * private DataService service=mock(DataService.class);
	 */

	@BeforeAll
	public void before()
	{
	MockitoAnnotations.initMocks(this);//  initializes fields annotated with Mockito annotations.
	}

	/*
	 * @BeforeAll 
	 * public static void setUp() 
	 * { service=mock(DataService.class);
	 *  }
	 */
	@Test
	public void calculateStubTest()
	{
		
//	DataService service=mock(DataService.class);
	//retrieve all data  new int []{1,2,3} 
	when(service.retrieveAllData()).thenReturn(new int []{1,2,3});
	
		int actualResult=impl.calculateSumDataService();
       int expectedResult=6;
       assertEquals(expectedResult,actualResult);
       //org.opentest4j.AssertionFailedError: expected: <5> but was: <6>
       // it will check both value are same then true else return false
	}
	
	@Test
	public void calculateEmptyTest()
	{
		
		when(service.retrieveAllData()).thenReturn(new int []{});
	
		int actualResult=impl.calculateSumDataService();
       int expectedResult=0;
       assertEquals(actualResult, expectedResult);
	}

	
	
}
