package com.Vtiger.PracticeORG.TestNG;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import com.Vtiger.BaseClassUtility.BaseClassUtility;
import com.Vtiger.ObjectRepository.HomePage;
import com.Vtiger.ObjectRepository.OrgPage;
import com.Vtiger.Utilities.ExcelUtility;
import com.Vtiger.Utilities.JavaUtility;


public class CreateOrgTest extends BaseClassUtility{
	@Test
	public void createOrgTest() throws EncryptedDocumentException, IOException
	{
		
		hp.getOrglink().click();
		OrgPage org=new OrgPage(driver); 
		org.getAddbtn().click();
	
		ExcelUtility eu=new ExcelUtility();
		JavaUtility ju=new JavaUtility();
		String cell = eu.getExcelData(1,2)+"abcd" + ju.randomNumber(500);
		
		org.getAccfield().sendKeys(cell);
//		org.getSavebtn().click();
	}
	
}
