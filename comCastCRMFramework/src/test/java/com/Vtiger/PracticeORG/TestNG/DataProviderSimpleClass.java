package com.Vtiger.PracticeORG.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSimpleClass {

  @Test(dataProvider ="getData")
  public void practiceSampleDataProvider(String firstname,String city)
  {
	  
	  System.out.println("FirstName:" + firstname + " "+"City:"+ city);
  }
	
  @DataProvider
  public Object[][] getData()
  {
	  Object[][] obj =new  Object[3][2];
	  obj[0][0]="Aarati";
	  obj[0][1]="Mumbai";
	  
	  obj[1][0]="Shivansh";
	  obj[1][1]="Mumbai";
	  
	  obj[2][0]="Shiv";
	  obj[2][1]="Mumbai";
	  return obj;
	  
  }
}
