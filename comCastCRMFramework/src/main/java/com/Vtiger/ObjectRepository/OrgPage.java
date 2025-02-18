package com.Vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgPage {

	 WebDriver driver;
	public OrgPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="phone")
	private WebElement phonefield;
	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement addbtn;
	
	@FindBy(xpath="//input[@name='button' and @value='  Save  ']")
	private WebElement savebtn;
	
	@FindBy(name="accountname")
	private WebElement accfield;
	
	@FindBy(name="industry")
	private WebElement industry;
	
	@FindBy(name="accounttype")
	private WebElement typeopt;
	
	
	public WebElement getPhonefield() {
		return phonefield;
	}

	public WebElement getAddbtn() {
		return addbtn;
	}
	
	
	public WebElement getSavebtn() {
		return savebtn;
	}

	
	public WebElement getAccfield() {
		return accfield;
	}
	
	public WebElement getIndustry() {
		return industry;
	}

	public WebElement getTypeopt() {
		return typeopt;
	}
}
