package com.Vtiger.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String getDataFromProperties(String key) throws IOException
	{ 
		FileInputStream fis=new FileInputStream("./TestData/CommonData.properties");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		
	}
	
}
