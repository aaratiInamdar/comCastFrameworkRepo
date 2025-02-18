package com.Vtiger.BaseClassUtility;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.Vtiger.ObjectRepository.HomePage;
import com.Vtiger.ObjectRepository.LoginPage;
import com.Vtiger.Utilities.DatabaseUtility;
import com.Vtiger.Utilities.ExcelUtility;
import com.Vtiger.Utilities.FileUtility;
import com.Vtiger.Utilities.JavaUtility;
import com.Vtiger.Utilities.WebDriverUtility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClassUtility {
		public WebDriver driver=null;
		public DatabaseUtility dlib=new DatabaseUtility();
		public FileUtility flib=new FileUtility();
		public ExcelUtility elib=new ExcelUtility();
		public JavaUtility jlib=new JavaUtility();
		WebDriverUtility wu=new WebDriverUtility();
		public HomePage hp =null;
		public static WebDriver sdriver=null;
		
		@BeforeSuite
		public void configBeforeSuite() throws SQLException, IOException {
			
//			System.out.println("=========Connect to db,Report Config=========");
//			dlib.getConnectionToDatabase();
	}
		
		
		@BeforeClass (alwaysRun = true)
		public void ConfigBeforeClass() throws Throwable {
			System.out.println("launch a Browser");
			String BROWSER = flib.getDataFromProperties("browser");
		
			if(BROWSER.equals("Chrome")) {
				driver=new ChromeDriver();	
			}else if(BROWSER.equals("Firefox")) {
				driver=new FirefoxDriver();
			}else if(BROWSER.equals("Edge")) {
				driver=new EdgeDriver();
			}else {
				driver=new ChromeDriver();
			}
			sdriver=driver;
			wu.GetMaximizeScreen(driver);
			wu.WaitForPageToLoad(driver);
			String appURL = flib.getDataFromProperties("url");
			driver.get(appURL);
			hp=new HomePage(driver);
			
		}
		@BeforeMethod (alwaysRun = true)
		public void ConfigBeforeMethod() throws Throwable {
			System.out.println("====login===");
			LoginPage lp=new LoginPage(driver);
			lp.loginToApp();
		}
        @AfterMethod (alwaysRun = true)
		public void ConfigAfterMethod() {
			System.out.println("====Logout====");
			
			hp.getLogout();			
		}
        
		@AfterClass (alwaysRun = true)
		public void ConfigAfterClass() {
			System.out.println("====close the Browser===");
			driver.close();
		}
		@AfterSuite
		public void ConfigAfterSuite()  {
//			System.out.println("close db,Report Backup");
//			dlib.getConnectionClose();
		
	
		}
		

	}

