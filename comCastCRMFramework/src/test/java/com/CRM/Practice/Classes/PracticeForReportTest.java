package com.CRM.Practice.Classes;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRM.ListenerUtility.ListImpClass;
import com.Vtiger.BaseClassUtility.BaseClassUtility;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



@Listeners(com.CRM.ListenerUtility.ListImpClass.class)
public class PracticeForReportTest extends BaseClassUtility {
	ExtentTest test;
	public ExtentSparkReporter spark;	
	
	@Test
	public void createContactTest()
	{

		TakesScreenshot tks=(TakesScreenshot)driver;
		String filePath = tks.getScreenshotAs(OutputType.BASE64);
		
		test = ListImpClass.report.createTest("createContactTest");
		test.log(Status.INFO,"login to app");
		test.log(Status.INFO,"navigate to contact page");
		test.log(Status.INFO,"create contact");
		
		if("HDFC".equals("HdFC"))
		{
			test.log(Status.PASS,"Contact is created");
		}
		else
		{
			test.log(Status.FAIL,"Contact is not created");
			test.addScreenCaptureFromBase64String(filePath, "ErrorFile");
		}
		
		System.out.println("logout from app");
		driver.close();
	}
	
	
}
