package com.Vtiger.ObjectRepository;


	import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.Vtiger.Utilities.FileUtility;
import com.Vtiger.Utilities.WebDriverUtility;

	public class LoginPage {
		WebDriver driver;
		FileUtility fu=new FileUtility();
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		@FindBy(name="user_name")
		 private WebElement username;
		
		@FindBy(name="user_password")
		private WebElement password;
		
		@FindBy(id="submitButton")
		private WebElement loginbtn;
		
		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLoginbtn() {
			return loginbtn;
		}
		
		

		

		public void loginToApp() throws IOException
		{
			String UN = fu.getDataFromProperties("username");
			String PWD = fu.getDataFromProperties("password");
			username.sendKeys(UN);
			password.sendKeys(PWD);
			loginbtn.click();
		}
		
		
	}

