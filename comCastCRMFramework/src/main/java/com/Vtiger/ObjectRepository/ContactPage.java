package com.Vtiger.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {

	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement addbtn;
	
	
	@FindBy(name="lastname")
	private WebElement lastnamefield;
	
	@FindBy(xpath="//input[@name='button' and @value='  Save  ']")
	private WebElement savebtn;


	public WebElement getAddbtn() {
		return addbtn;
	}

	public WebElement getLastnamefield() {
		return lastnamefield;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
}
