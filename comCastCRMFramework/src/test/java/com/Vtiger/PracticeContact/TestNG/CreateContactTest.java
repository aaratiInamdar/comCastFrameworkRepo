package com.Vtiger.PracticeContact.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.BaseClassUtility.BaseClassUtility;
import com.Vtiger.ObjectRepository.ContactPage;

public class CreateContactTest extends BaseClassUtility{

	@Test
	public void createContactTest()
	{
		ContactPage cp=new ContactPage();
		
		System.out.println(" first statement");
//		not completed yet
		
		hp.getContacts().click();
		cp.getAddbtn().click();
//		cp.getLastnamefield().sendKeys("sdf");
//		cp.getSavebtn().click();
	}
	
}
