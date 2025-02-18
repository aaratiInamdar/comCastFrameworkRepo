package com.Vtiger.PracticeORG.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test
	public void dataProviderTest()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("IPhone",Keys.ENTER);
		
		
//		Capture product information
		
	}
	
	
	public void getData()
	{
		Object[][] obj =new Object[3][2];
				}
}
