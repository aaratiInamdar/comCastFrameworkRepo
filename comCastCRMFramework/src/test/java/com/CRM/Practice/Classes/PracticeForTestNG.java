package com.CRM.Practice.Classes;

import org.testng.annotations.Test;

import com.Vtiger.BaseClassUtility.BaseClassUtility;

public class PracticeForTestNG extends BaseClassUtility{

	@Test (groups="smoke")
	public void sampleMethod1()
	{
		System.out.println("Method 1");
	}
	
	@Test (groups="smoke")
	public void sampleMethod2()
	{
		System.out.println("Method 2");
	}
	
	
	@Test (groups="regression")
	public void sampleMethod3()
	{
		System.out.println("Method 3");
	}
	
	
	
	
}
