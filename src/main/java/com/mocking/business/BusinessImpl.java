package com.mocking.business;

import com.mocking.data.DataService;

public class BusinessImpl {

	
	private DataService dataService;
	
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

	public int calculateSum(int [] args)
	{
		int sum=0;
		for(int value:args)
			sum+=value;
		return sum;
	}
	
	public int calculateSumDataService()
	{
		int arr[]=dataService.retrieveAllData();
		int sum=0;
		for(int value:arr)
			sum+=value;
		return sum;
	}
}
