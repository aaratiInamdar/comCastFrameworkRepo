package com.Vtiger.PracticeORG.TestNG;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import com.Vtiger.BaseClassUtility.BaseClassUtility;
import com.Vtiger.ObjectRepository.OrgPage;
import com.Vtiger.Utilities.ExcelUtility;
import com.Vtiger.Utilities.JavaUtility;
import com.Vtiger.Utilities.WebDriverUtility;

public class CreateOrgWithIndustryTest extends BaseClassUtility {

	@Test
	public void createOrgWithIndustryTest() throws EncryptedDocumentException, IOException
	{
		hp.getOrglink().click();
		OrgPage org=new OrgPage(driver); 
		org.getAddbtn().click();
		
		ExcelUtility eu=new ExcelUtility();
		JavaUtility ju=new JavaUtility();
//		String cell = eu.getExcelData(1,2)+"Organization" + ju.randomNumber(500);
		
		String cell=eu.getExcelData(1,2)+"abcd"+ju.randomNumber(20);
		org.getAccfield().sendKeys(cell);
		org.getAccfield().sendKeys("fth");
		
		WebDriverUtility wu=new WebDriverUtility();
		wu.selectByText(org.getIndustry(), "Technology");
		wu.selectByValue(org.getTypeopt(), "Investor");
		//org.getSavebtn().click();
	}
	
}
