package com.mocking.data;

public class StringHelper {

	public String truncateInFirst2Positions(String str)
	{
		return str.substring(str.length()-2);
	}
	
	public boolean  firstAndLast2CharMatcher(String str)
	{
		if(str.substring(0,2).equals(str.substring(str.length()-2)))
			return true;
		else return false;
	}
}
