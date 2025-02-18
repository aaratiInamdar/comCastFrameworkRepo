package com.CRM.Practice.Classes;

import org.testng.annotations.Test;

import com.Vtiger.BaseClassUtility.BaseClassUtility;

public class PracticeForTestNGSampleClass extends BaseClassUtility {

	@Test (groups="smoke")
	public void sampleMethod4()
	{
		System.out.println("Method 4");
	}
	
	@Test (groups="regression")
	public void sampleMethod5()
	{
		System.out.println("Method 5");
	}
	
	@Test (groups="smoke")
	public void sampleMethod6()
	{
		System.out.println("Method 6");
	}
	
	
	
	
}
