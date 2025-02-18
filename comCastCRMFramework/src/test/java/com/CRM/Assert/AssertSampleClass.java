package com.CRM.Assert;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSampleClass {
	SoftAssert soft=new SoftAssert();
	@Test
	public void sampleTest()
	{
		System.out.println("Test Starts");
		String data="abcd";
//		SoftAssert soft=new SoftAssert();
		soft.assertEquals(data, "abcdefg");
		System.out.println("Test Ends");
		soft.assertAll();
	}
	
	
	@Test
	public void sampleTest1()
	{
		System.out.println("Test Starts");
		String data="abcd";
		Assert.assertEquals(data, "abcd");
		System.out.println("Test Ends");
	}
}
