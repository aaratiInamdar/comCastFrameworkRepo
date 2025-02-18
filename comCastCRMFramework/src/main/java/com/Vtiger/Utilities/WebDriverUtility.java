package com.Vtiger.Utilities;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.protobuf.Duration;

public class WebDriverUtility {

	WebDriver driver;
		
	FileUtility fu=new FileUtility();
//		implicitly wait
		public void WaitForPageToLoad(WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		}
		
//		explicitly wait
		public void WaitForElementToPresent(WebDriver driver,WebElement element)
		{
			WebDriverWait wait =new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		
//		maximize the screen
		public void GetMaximizeScreen(WebDriver driver)
		{
			driver.manage().window().maximize();
		}
		
//		Switch to window
		public void switchToWindow(WebDriver driver,String partialUrl)
		{
			String parentid = driver.getWindowHandle();
			Set<String> all_id = driver.getWindowHandles();
			for (String ids : all_id) {
				driver.switchTo().window(ids);
				String currentUrl = driver.getCurrentUrl();
				if(currentUrl.contains(partialUrl))
				{
					driver.switchTo().window(ids);
				}
			}
			driver.switchTo().window(parentid);
		}
		
//		Switch to frame By Name
		public void switchToFrame(WebDriver driver,String name)
		{
		driver.switchTo().frame(name);
		}
		
//		Switch to Frame By Index
		public void switchToFrame(WebDriver driver,int index)
		{
			driver.switchTo().frame(index);
		}
		
//		Switch to Frame By WebElement
		public void switchFrame(WebDriver driver,WebElement element)
		{
			driver.switchTo().frame(element);
		}
		
//		Switch to Alert
		public void switchToAlertAccept(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}
		
//		Switch to Alert
		public void switchToAlertDismiss(WebDriver driver)
		{
			driver.switchTo().alert().dismiss();
		}
		
//		Select By Value
		public void selectByValue(WebElement element, String value)
		{
			Select sel=new Select(element);
			sel.selectByValue(value);
		}
		
//		Select By Visible Text
		public void selectByText(WebElement element, String text)
		{
			Select sel=new Select(element);
			sel.selectByVisibleText(text);
		}
		
//		SelectBy index
		public void selectByIndex(WebElement element, int index)
		{
			Select sel=new Select(element);
			sel.selectByIndex(index);
		}
		
//		to perform double click 
		public void doubleClick(WebDriver driver,WebElement element)
		{
			Actions act=new Actions(driver);
			act.doubleClick(element).perform();
		}
		
		public void launchApp() throws IOException
		{
			String URL = fu.getDataFromProperties("url");
			driver.get("http://49.249.28.218:8888/");
		}

	}
	
	

