package com.Vtiger.PracticeORG.TestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Vtiger.BaseClassUtility.BaseClassUtility;
import com.Vtiger.ObjectRepository.OrgPage;
import com.Vtiger.Utilities.ExcelUtility;
import com.Vtiger.Utilities.JavaUtility;
import com.Vtiger.Utilities.WebDriverUtility;

@Listeners(com.CRM.ListenerUtility.ListImpClass.class)
public class CreateOrgWithPhoneNumTest extends BaseClassUtility {

	ExcelUtility eu=new ExcelUtility();
	JavaUtility ju=new JavaUtility();
	@Test
	public void createOrgWithPhoneNumTest() throws EncryptedDocumentException, IOException
	{
		
		hp.getOrglink().click();
		OrgPage org=new OrgPage(driver); 
		org.getAddbtn().click();

		String cell = eu.getExcelData(1,2);	
		org.getAccfield().sendKeys(cell + "abcds" + ju.randomNumber(500)) ;
		String phno = eu.getExcelData(1, 3);
		org.getPhonefield().sendKeys(phno);
		org.getSavebtn().click();
	}
}
