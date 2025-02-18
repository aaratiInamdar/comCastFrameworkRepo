package com.CRM.Listener;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Vtiger.BaseClassUtility.BaseClassUtility;


@Listeners(com.CRM.ListenerUtility.ListImpClass.class)
public class SampleClassForListener extends BaseClassUtility {

	@Test (retryAnalyzer = com.CRM.ListenerUtility.RetryListenerImp.class)
	public void createSampleTest()
	{
		System.out.println("execute createSampleTest ");
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, "login");
		System.out.println("Step-1");
		System.out.println("Step-2");
		
	}
	
//	@Test
//	public void createSampleTest1()
//	{
//		System.out.println("execute createSampleTest1 ");
//		Assert.fail();
//		System.out.println("Step-1");
//		System.out.println("Step-2");
//	}
//	
//	
//	
}
