package com.Vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.Utilities.WebDriverUtility;

public class HomePage {
	WebDriver driver=null;

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(linkText = "Contacts")
	private WebElement contacts;

	@FindBy(linkText = "Organizations")
	private WebElement orglink;

	@FindBy(xpath="//img[@style='padding: 0px;padding-left:5px']")
	private WebElement admin;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutbtn;

	public WebElement getOrglink() {
		return orglink;
	}
	
	public WebElement getContacts() {
		return contacts;
	}
	
	
	public WebElement getAdmin() {
		return admin;
	}

	public WebElement getSignoutbtn() {
		return signoutbtn;
	}
	public void getLogout()
	{
		WebDriverUtility wu= new WebDriverUtility();
		wu.WaitForElementToPresent(driver, admin);
		
		Actions act=new Actions(driver);

		act.moveToElement(admin).perform();
		getAdmin().click();
		signoutbtn.click();
	}
}
