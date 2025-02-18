package com.CRM.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssertPractice {
	
	WebDriver driver=new ChromeDriver();
	@Test
	public void verifyHomeTitle()
	{
		String expTitle="Home";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://49.249.28.218:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		
//		Hard Assert
		String actTitle = driver.findElement(By.xpath("//a[contains(text(),'Home')]")).getText();
		Assert.assertEquals(expTitle, actTitle);
		System.out.println("Test Case is Passed");
	}
	
	
//	Soft Assert
	public void verifyLogo()
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://49.249.28.218:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		
	}
	
}
