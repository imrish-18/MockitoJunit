package com.mocking.business;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.mocking.data.StringHelper;
@TestInstance(value = Lifecycle.PER_CLASS )
public class StringHelperTest {

	@InjectMocks
	private StringHelper helper;

	@BeforeAll
	public void before()
	{
		
		MockitoAnnotations.initMocks(this);
	}
	@BeforeAll
	public void beforeClass()
	{
		System.out.println("before each method is executed");
	}
	@AfterEach
	public void after()
	{
		System.out.println("this method is called after each method");
	}
	@Test
	public void truncateInFirst2Position()
	{
		String actual=helper.truncateInFirst2Positions("abaacd");
		
		assertEquals("cd", actual);
	}
	@Test
	public void firstAndLast2CharMatcherTest()
	{
		boolean bool=helper.firstAndLast2CharMatcher("abab");
		assertTrue(bool);
	}
	@Test
	public void firstAndLast2CharMatcherNegativeTest()
	{
		boolean bool=helper.firstAndLast2CharMatcher("ababc");
		assertFalse(bool);
	}
}
